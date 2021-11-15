package com.book.app.service;
import java.sql.SQLException;
import java.util.List;

import com.book.app.dao.BookDao;
import com.book.app.dao.BookDaoImpl;
import com.book.app.model.Book;
public class BookServiceImpl implements BookService {
BookDao bookService;
	
	public BookServiceImpl() throws SQLException
	{
		bookService = new BookDaoImpl();
	}
	
	

	

	@Override
	public List<String> recomandedService() throws Exception {
		
		return bookService.recomandedService();
	}

	@Override
	public List<String> FavouriteBooks() throws Exception {
		
		return bookService.FavouriteBooks();
	}





	@Override
	public List<Book> searchByAuthor(int auhtorId) throws Exception {
		
		return bookService.searchByAuthor(auhtorId);
	}





	@Override
	public Book addBook(Book book) throws Exception {
		
		return bookService.addBook(book);
	}





	@Override
	public Book addFavouriteBooks(Book book) throws Exception {
	
		return bookService.addFavouriteBooks(book);
	}





	@Override
	public boolean deleteFavouriteBooks(Book book) throws Exception {
		
		return bookService.deleteFavouriteBooks(book);
	}

	

}
