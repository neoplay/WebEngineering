package mvc

import geb.spock.*
import grails.test.mixin.integration.Integration

@Integration
class FHNWWebsiteSpec extends GebSpec {

    void "home links to Students"() {
        when:"home page is visited"
            go 'https://www.fhnw.ch/de/'
        then:"The title is FHNW — Deutsch"
            title == "FHNW — Deutsch"

        when: "click on link to Studium"
            $("a", text: "Impressum").click()
        then: "Second page is displayed"
            title == "Impressum — Deutsch"

    }

}
