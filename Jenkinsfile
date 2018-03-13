@Library('groovy@master')
def url = 'https://github.com/Rajdash/groovy.git'
node() {
    stage ("Preparation-Build"){
    com.raj.checkout url: url
    mvnBuild()
    }
    stage ('deploy'){
    sh 'echo dep'
    }

}