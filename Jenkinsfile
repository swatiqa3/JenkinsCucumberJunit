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
                bat 'docker compose up -d'
            }
        }

        stage('Wait for Grid') {
            steps {
                bat '''
                echo Waiting for Selenium Grid...

                powershell -Command ^
                "for ($i=0; $i -lt 30; $i++) { ^
                    try { ^
                        $resp = Invoke-RestMethod http://localhost:4444/wd/hub/status; ^
                        if ($resp.value.ready -eq $true) { ^
                            Write-Host 'Grid is ready'; exit 0 ^
                        } ^
                    } catch {} ^
                    Start-Sleep -Seconds 2 ^
                } ^
                Write-Host 'Grid not ready in time'; exit 1"
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