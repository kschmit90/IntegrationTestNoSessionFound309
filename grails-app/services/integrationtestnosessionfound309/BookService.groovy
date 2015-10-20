package integrationtestnosessionfound309

import grails.transaction.Transactional

@Transactional
class BookService {

    def getDuplicatedUrl( bookUrl, baseUrl ) {
        def duplicatedBook = Book.findByUrl( bookUrl )

        def bookId = duplicatedBook.id

        def showUrl = "/book/show/"

        return baseUrl + showUrl + assetId
    }
}
