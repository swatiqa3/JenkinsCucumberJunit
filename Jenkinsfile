pipeline {

    agent any

    parameters {

        choice(
            name: 'ENVIRONMENT',
            choices: ['QA', 'UAT', 'PROD'],
            description: 'Select Environment'
        )

        choice(
            name: 'BROWSER',
            choices: ['chrome', 'firefox'],
            description: 'Select Browser'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Start Selenium Grid') {
            steps {
                sh 'docker compose up -d'
            }
        }

        stage('Wait for Grid') {
            steps {
                sh '''
                echo "Waiting for Selenium Grid..."

                timeout 60 bash -c '
                until curl -s http://localhost:4444/wd/hub/status | grep "ready"; do
                    sleep 2
                done
                '
                '''
            }
        }

        stage('Run Tests') {
            steps {

                sh """
                mvn clean test \
                -Denvironment=${params.ENVIRONMENT} \
                -Dbrowser=${params.BROWSER}
                """
            }
        }
    }

    post {

        always {

            junit '**/surefire-reports/*.xml'

            sh 'docker compose down'
        }
    }
}