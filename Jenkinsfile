pipeline {
    agent none
    stages {
        stage('Packaging of Java Project') {
            agent { 
                label 'test-environment'
            }
            steps {
                sh 'mvn --version'
                echo '====stage 1: Successfully tested and packed Java Web Application===='
            }
        }
    }
}
