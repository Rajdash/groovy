@Library('groovy@master')
def url = 'https://github.com/Rajdash/groovy.git'
def branch = 'master'
node() {
    stage ("Preparation-Build"){
    checkout url: url , branch: branch
    mvnBuild()
    }
    stage ('deploy'){
    sh 'echo dep'
    }

}