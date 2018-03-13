#!/usr/bin/groovy
package com.raj
def call(LinkedHashMap options) {

    sh "mvn clean install -DskipTests=false"

}