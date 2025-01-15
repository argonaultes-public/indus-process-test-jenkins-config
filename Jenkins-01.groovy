pipeline {
    agent any
        stages {
            stage('Super Test') {
                steps {
                    sh 'echo super test'
                }
        }
    }
}