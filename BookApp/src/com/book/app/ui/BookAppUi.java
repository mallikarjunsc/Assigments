package com.book.app.ui;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.book.app.model.Book;
import com.book.app.service.BookService;
import com.book.app.service.BookServiceImpl;

public class BookAppUi {
	private Scanner sc = new Scanner(System.in);
	private static BookService bService;
	
	public BookAppUi() throws SQLException
	{
		bService = new BookServiceImpl();
	}
	
	public void addBooks()
	{
		int id = 0;
		String bookName=null;
		int authorId=0;
		String authorName=null;
		Book b = new Book();
		System.out.println("Enter the Book Details :");
		System.out.println("Enter the Book Id : ");
		id = sc.nextInt();
		System.out.println("Enter the Book Name : ");
		bookName = sc.next()+sc.nextLine();
		System.out.println("Enter the Auhtor Id : ");
		authorId = sc.nextInt();
		System.out.println("Enter the Author Name : ");
		authorName = sc.next()+sc.nextLine();
		
		try
		{
			if(authorId>100)
			{
				throw new InvalidAuthorIdException("Enter the auhtorId less than 1000 : "+authorId);
			}
			if(id>10000)
			{
				throw new InvalidBookIdException("Enter the bookId less than 1000 : "+id);
			}
			
		}
		catch(InvalidBookIdException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Handeled InvalidBookIdException");
		}
		catch(InvalidAuthorIdException e2)
		{
			System.out.println(e2.getMessage());
			System.out.println("Handeled InvalidAuthorIdException");
		}
		
		Book book = new Book(id, bookName, authorId, authorName);
		Book savedBook;
		try
		{
			savedBook = bService.addBook(book);
			System.out.println("Book Added Successfull!!");
			System.out.println(savedBook);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void addFavourite()
	{
		System.out.println("Enter the Book Details : ");
		System.out.println("Enter the Book Name : ");
		String bookName = sc.next()+sc.nextLine();
		System.out.println("Enter the Book Id : ");
		int bookId = sc.nextInt();
		
		try
		{
			if(bookId>10000)
			{
				throw new InvalidBookIdException("Enter the bookId less than 1000 : "+bookId);
			}
		}
		catch(InvalidBookIdException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Handeled InvalidBookIdException");
		}
		
		Book book = new Book(bookName, bookId);
		Book savedFavourite;
		try
		{
			savedFavourite = bService.addFavouriteBooks(book);
			System.out.println("Book Added Successfully to Favourite list!!!");
			System.out.println(savedFavourite);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void deleteFavourites()
	{
		System.out.println("Enter the Book Details : ");
		System.out.println("Enter the Book Id : ");
		int bookId = sc.nextInt();
		Book book = new Book(bookId);
		boolean deleteBook;
		try
		{
			if(bookId>10000)
			{
				throw new InvalidBookIdException("Enter the bookId less than 1000 : "+bookId);
			}
		}
		catch(InvalidBookIdException e)
		{	System.out.println(e.getMessage());
			System.out.println("Handeled InvalidBookIdException ");
		}
		try
		{
			deleteBook = bService.deleteFavouriteBooks(book);
			System.out.println("Favourite Book Deleted Successfully!!");
			System.out.println(deleteBook);
		}
		catch(Exception e1)
		{	System.out.println(e1.getMessage());
		}
		
	}
	
	public void searchAuthor()
	{
		System.out.println("Enter Author Details :  ");
		System.out.print("Author ID : ");
		int authorId=0;
		List<Book> book=null;
		
		try
		{
			authorId=sc.nextInt();
		}
		catch(InputMismatchException e3)
		{   System.out.println(e3.getMessage());
			System.out.println("InputMisMatchException Handeled");
			
		}
		try
		{
			
			if(authorId>1000)
			{
				throw new InvalidAuthorIdException("Enter the auhtorId less than 1000 : "+authorId);
			}
		}
		
		
		catch(InvalidAuthorIdException e2)
		{
			System.out.println(e2.getMessage());
			System.out.println("Handeled InvalidAuthorIdException");
		}
		
		try 
		{
			book = bService.searchByAuthor(authorId);
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}

		System.out.println(book);
	}



	public void displayFavouriteBooks() 
	{
		System.out.println("The Favourite Books are : ");
		List<String> book=null;
		try {
			book = bService.FavouriteBooks();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(book);
	}
	
	public void displayRecomanded()
	{
		System.out.println("The Recomanded Books are : ");
		List<String> book=null;
		try {
			book = bService.recomandedService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(book);
	}
	
	
	
}
