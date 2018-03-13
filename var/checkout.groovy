#!/usr/bin/groovy
package com.raj
def call(LinkedHashMap options) {
    def branch            = options.get("branch") ?: "master"
    git url: url , branch: branch

}