#!/usr/bin/groovy
package com.raj
def call(LinkedHashMap options) {

    sh "mvn package deploy "

}