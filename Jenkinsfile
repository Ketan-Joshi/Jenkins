library identifier: 'Jenkins2@master', retriever: modernSCM(
	[$class: 'GitSCMSource',
	 remote: 'https://github.com/Ketan-Joshi/Jenkins'])
pipeline {
	agent any
	options{
		timestamps()
		ansicolor( 'xterm' )
	}
	stages {
		stage( 'Coloured Output' ) {
			steps{
				scripts {
					logs.info "SUCCESS"
					logs.warn "WARNING"
					def gitId = sh(script: 'git rev-parse HEAD', returnStdout: true)
					logs.gitCommmitId(gitId)
				}
			}
		}
	}
}

