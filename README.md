## Simian for Grails ##

Simian plugin is using <a href="http://www.harukizaemon.com/simian/">Simian</a> to identify duplication for Grails app code,such as .groovy,.gsp,.java,.js,.css ..., and generate report file(html,xml).

## Install Plugin ##

grails install-plugin simian

## Plugin Usage ##

You can use the command "grails simian-report" to generate the report files.

## Custom Config ##

If you wanna custom the config of Simian,you can add your config into Config.groovy:

simian{<br>
    &nbsp;&nbsp;&nbsp;&nbsp;reportsDir="target/simian-reports"<br>
    &nbsp;&nbsp;&nbsp;&nbsp;fileDir="."<br>
    &nbsp;&nbsp;&nbsp;&nbsp;cludesFiles=[includes:"\*\*/\*.groovy \*\*/\*.java \*\*/\*.gsp \*\*/\*.js \*\*/\*.css",excludes:"\*\*/bootstrap\*.css"]<br>
    &nbsp;&nbsp;&nbsp;&nbsp;methodParams=[threshold:20]<br>
}

   * reportsDir - the dir for generated report files,default value is APP_TOME/target;
   * fileDir - scan dir,default value is current app's root dir,you can set to "./grails-app" or other as you like;
   * cludesFiles - there are two elements, includes and excludes,each value is splited using a space;
   * methodParams - this is a params map, you can set method params of Simian,such as <i>threshold</i>,<i>defaultLanguage</i>,<i>failOnDuplication</i>,<i>ignoreCharacterCase</i> etc.If you want to know the other method params,you can check <a href="http://www.harukizaemon.com/simian/javadoc/com/harukizaemon/simian/SimianTask.html">SimianTask</a>.

