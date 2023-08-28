pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // This stage is for checking out the repository, which is handled automatically.
                script {
                    echo 'Checking out the repository'
                }
            }
        }
        stage('Compile and Run Java') {
            steps {
                sh 'javac IterateList.java'   // Compile the Java file
                sh 'java IterateList'         // Run the Java program
            }
        }
    }
}

