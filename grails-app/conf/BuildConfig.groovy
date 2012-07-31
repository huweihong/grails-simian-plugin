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
    }
    dependencies {
        
        provided 'simian:simian:2.3.33' //'com.harukizaemon:simian:2.3.33'
    }
}
