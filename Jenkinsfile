#!groovy
library identifier: 'Jenkins@master', retriever: modernSCM(
        [$class: 'GitSCMSource',
         remote: 'https://github.com/Ketan-Joshi/Jenkins'])
pipeline {
   agent any
    options{
       timestamps()
       ansiColor('xterm')
   }
   stages {
      stage('Coloured Outputs') {
         steps {
             script{
                    logs.info "SUCCESS"
		    logs.warn "WARNING"
		    def gitId=sh(script: 'git rev-parse HEAD' , returnStdout: true)
		    logs.gitCommitId(gitId)	
             }
         }
      }
   }
}
