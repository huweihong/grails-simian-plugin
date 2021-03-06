## Simian for Grails ##

Simian plugin is using <a href="http://www.harukizaemon.com/simian/">Simian</a> to identify duplication for Grails app code,such as .groovy,.gsp,.java,.js,.css ..., and generate report file(html,xml).

## Install Plugin ##

grails install-plugin simian 0.1-SNAPSHOT

Note:If you are using Grails 1.3.* or before, you should add the following code into "repositories" of your BuildConfig.groovy. If you are using Grails 2.*,please ignore this note:

    grailsRepo "http://grails.org/plugins"

## Plugin Usage ##

grails simian-report

Note:This plugin will use simian-2.3.33.jar.Due to there are not simian-2.3.33.jar in Maven Repository, you should upload simian-2.3.33.jar in your own repository and add the repository url in dependencies.groovy. for example: 
    
    mavenRepo "http://yourRepositoryHost/artifactory/libs-release-local/"

## Custom Config ##

If you want to custom the config of Simian,you can add your config into Config.groovy:

    simian{
        reportsDir="target/simian-reports"
        fileDir="."
        cludesFiles=[includes:"**/*.groovy **/*.java **/*.gsp **/*.js **/*.css"
                    ,excludes:"**/bootstrap*.css"]
        methodParams=[threshold:20]
    }

   * reportsDir - the dir for generated report files,default value is APP_TOME/target;
   * fileDir - scan dir,default value is current app's root dir,you can set to "./grails-app" or other as you like;
   * cludesFiles - there are two elements, includes and excludes,each value is splited using a space;
   * methodParams - this is a params map, you can set method params of Simian,such as <i>threshold</i>,<i>defaultLanguage</i>,<i>failOnDuplication</i>,<i>ignoreCharacterCase</i> etc.If you want to know the other method params,you can check <a href="http://www.harukizaemon.com/simian/javadoc/com/harukizaemon/simian/SimianTask.html">SimianTask</a>.

## License ##

This plugin is distributed under Apache License Version 2. For the license of <a href="http://www.harukizaemon.com/simian/">Simian</a>, please read it <a href="http://www.harukizaemon.com/simian/LICENSE.txt">here</a>.
