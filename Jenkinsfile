@Library('groovy@master')
def url = 'https://github.com/Rajdash/groovy.git'
def branchvalue = 'master'
node() {
    stage ("Preparation-Build"){
    checkout url: url, branch: branchvalue
    mvnBuild()
    }
    stage ('deploy'){
    sh 'echo dep'
    }

}