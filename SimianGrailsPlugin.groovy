/*
 * Copyright 2012 Hu Weihong.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
 
class SimianGrailsPlugin {

    def version = "0.1-SNAPSHOT"
    
    def grailsVersion = "1.3.7 > *"
    
    def dependsOn = [:]
    
    String license = "APACHE"
    String author = "huweihong"
    String authorEmail = "weihong0427@163.com"
    String title = "Simian for Grails"
    String description = '''Simian plugin identifies duplication for Grails app code,such as .groovy,.gsp,.java,.js,.css ..., and generate report file(html,xml).
'''

    def documentation = "http://grails.org/plugin/simian"

    def doWithWebDescriptor = { xml ->}

    def doWithSpring = {}

    def doWithDynamicMethods = { ctx ->}

    def doWithApplicationContext = { applicationContext ->}

    def onChange = { event ->}

    def onConfigChange = { event ->  }
}
