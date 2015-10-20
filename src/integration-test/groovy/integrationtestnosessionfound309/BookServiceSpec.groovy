package integrationtestnosessionfound309


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class BookServiceSpec extends Specification {

	def bookService

    def setup() {
    	new Book(author: "Me", url: "http://www.google.com/").save(flush: true)
    }

    def cleanup() {
    }

    void "test something"() {
        given:
        	setup()

        expect:
        	bookService.getDuplicatedBookUrl( "http://www.google.com/", "localhost:8080" ) == "localhost:8080/book/show/1"
    }
}
