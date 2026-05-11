pipeline {

    agent any

    parameters {

        choice(
            name: 'ENVIRONMENT',
            choices: ['QA','Dev'],
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
                bat 'docker compose up -d'
            }
        }

		stage('Wait for Grid') {
		    steps {
		        bat '''
		        echo Waiting for Selenium Grid...
		
		        powershell -Command "Start-Sleep -Seconds 15"
		        '''
		    }
		}

        stage('Run Tests') {
            steps {

                bat """
                mvn clean test ^
                -Denvironment=%ENVIRONMENT% ^
                -Dbrowser=%BROWSER%
                """
            }
        }
    }

    post {

        always {

            junit '**/surefire-reports/*.xml'

            bat 'docker compose down'
        }
    }
}