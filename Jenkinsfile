pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('clean') {
            steps {
                sh './mvnw clean'
            }
        }
        
        stage('build') {
            steps {
                sh './mvnw package'
            }
        }
    }
}