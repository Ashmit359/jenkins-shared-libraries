def call() {
    withSonarQubeEnv('Sonar') {
        sh '''
            ${SONAR_HOME}/bin/sonar-scanner
        '''
    }
}
