def call() {
    dependencyCheck(
        additionalArguments: '--scan . --format XML --format HTML --prettyPrint',
        odcInstallation: 'DP-Check'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
