#!/usr/bin/groovy


/**
 * An opiniated git checkout with default values for branch and credentialsId
 */
def call(LinkedHashMap options) {
    if (options == null || options.url == null) {
        error ("mandatory parameter 'url' is missing")
    }
    //Mandatory options
    def url = options.url

    //Optional options
    def gitSshCredential  = options.get("gitSshCredential") ?: credential.gitSsh
    def branch            = options.get("branch") ?: "develop"

    println("Executing ${this.getClass().getSimpleName()} with options ${options}")

    git url: url, branch: branch, credentialsId: gitSshCredential

}