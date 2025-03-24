package jpacrud.client;

import jpacrud.entities.Book;
import jpacrud.service.BookService;
import jpacrud.service.BookServiceImpl;

public class Client {
	public static void pritingLine() {
		System.out.println("\n==================================================================================================================================================\n");
	}
	
	public static void main(String[] args) {
		BookService service = new BookServiceImpl();
		
		pritingLine();
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		pritingLine();
		
		System.out.println("************Listing book with id 1*************");
		System.out.println("Book with ID 1:"+service.getBookById(1));
		pritingLine();
		
		System.out.println("************Listing All books JPQL*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		pritingLine();
		
		System.out.println("************Listing All books with native query*************");
		for(Book book:service.getAllBooksNative()) {
			System.out.println(book);
		}
		pritingLine();
		
		System.out.println("************Listing book written by Danny Coward*************");
		for(Book book:service.getAuthorBooks("Manideep") ) {
			System.out.println(book);
		}
		pritingLine();
		
		System.out.println("************Listing book on Android*************");
		for(Book book:service.getBookByTitle("Android")) {
			System.out.println(book);
		}
		pritingLine();		
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book book:service.getBooksInPriceRange(500, 600) ) {
			System.out.println(book);
		}
		pritingLine();
	}
}
