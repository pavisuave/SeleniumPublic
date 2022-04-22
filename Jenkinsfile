pipeline {
    agent any
	tools {
        maven 'Maven' 
    }
    stages {
        stage('Checkout') {
            steps { 
                echo 'Welcome to LambdaTest'
				// Get some code from a GitHub repository
                git url: 'https://github.com/pavisuave/SeleniumPublic.git', branch: 'master'
            }
        }
		stage('build') {
            steps { 
                dir("MySeliniumProject") {
                sh "mvn clean compile"
                }
            }
        }
		
		stage('test') {
            steps { 
                 dir("MySeliniumProject") {
                    sh "mvn clean test"
                 }
            }
        }
        
        stage('Deploy') {
            
        }
    }
}
