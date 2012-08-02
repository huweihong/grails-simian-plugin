grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.dependency.resolution = {
    inherits("global") {
    }
    log "warn" 
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        
        /* Due to there are not simian-2.3.33.jar in Maven Repository,
         * you should upload simian-2.3.33.jar in your own repository
         * and add the repository url in here.
         * for example:
         * mavenRepo "http://ok988cis.eicp.net:8080/artifactory/libs-release-local/"
         */
         
    }
    dependencies {
        provided 'simian:simian:2.3.33' 
    }
}
