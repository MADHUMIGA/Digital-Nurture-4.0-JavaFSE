package service;

import repository.BookRepository;

public class BookService {
	 private BookRepository bookRepository;

	    // Setter for dependency injection
	    public void setBookRepository(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	    public void printBook() {
	        System.out.println("Book: " + bookRepository.getBook());
	    }
}
