/*
 * Copyright 2012 the original author or authors.
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
 */
includeTargets << grailsScript('_GrailsCompile')
includeTargets << grailsScript('_GrailsPackage')

target ( default: "Analyze duplication code in your app") {
    depends(compile , createConfig)
    runSimianReport()
}

private void runSimianReport() {
    String fileDir=config.simian.fileDir?:"."
    String reportDir="${basedir}/target"
    if(config.simian.reportsDir){
        reportDir="${basedir}/${config.simian.reportsDir}"
        ant.mkdir(dir:"${basedir}/${config.simian.reportsDir}")
    }
    Ant.taskdef(name: 'simian', classname:"com.harukizaemon.simian.SimianTask")
    Ant.simian(config.simian.methodParams){
        formatter(type: "xml",toFile:"${reportDir}/simian-log.xml")
        if(config.simian.cludesFiles){
            fileset(dir:fileDir
                    ,includes:config.simian.cludesFiles.includes
                    ,excludes:config.simian.cludesFiles.excludes)
        }else{
            fileset(dir:fileDir
                    ,includes:"**/*.*"
                    ,excludes:"**/*.class")
        }
    }
    Ant.xslt style: "${simianPluginDir}/grails-app/conf/simian.xsl", out: "${reportDir}/simian-log.html", in: "${reportDir}/simian-log.xml"
}