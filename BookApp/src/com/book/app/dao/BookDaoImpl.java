package com.book.app.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.book.app.model.Book;
import com.book.app.ui.AuthorNotFoundException;
public class BookDaoImpl implements BookDao {
private Connection con;
	
	private PreparedStatement smt;
	
	
	
	public BookDaoImpl() throws SQLException
	{
		con=ConnectionUtil.getDbConnection();
	}
	
	
	
	@Override
	public List<Book> searchByAuthor(int authorId) throws SQLException 
	{
//		int bookId=0;
		String query = "select * from Book where author_id = ?";
		
		smt=con.prepareStatement(query);
		
		smt.setInt(1, authorId);	
		
		ResultSet queryResult = smt.executeQuery();
		
		Book b=null;
		List<Book> list = new ArrayList<>();
		while(queryResult.next())
		{
			b = new Book();
			b.setAuthorId(authorId);
			b.setAuthorName(queryResult.getString("author_name"));
			b.setBookId(queryResult.getInt("book_id"));
			b.setBookName(queryResult.getString("book_name"));
			list.add(b);
			//System.out.println(b);
		}
		while(queryResult.next())
		{
			if(queryResult.getInt("author_id")!=queryResult.findColumn("auhtor_id"))
			{
				throw new AuthorNotFoundException("Author Id not present in DB : "+authorId);
				//System.out.println("Hi");
			}
		}
		return list;
	}

	@Override
	public List<String> FavouriteBooks() throws Exception {
//		String query = "select distinct favourite_books from Favourite_books";
//		smt=con.prepareStatement(query);
//		ResultSet queryResult = smt.executeQuery();
//		List<Book> list = new ArrayList<>();
//		if(queryResult.next())
//		{
//			Book b = new Book();
//			b.s(queryResult.getString("favourite_books"));
//			list.add(b);
//		}
//		return  list;
//		String foundType="";
		String query = "select distinct favourite_books from Favourite_books";
		//String query = "select favourite_books, from Book where classid=? and absentdt>=? and absentdt<=";
		smt=con.prepareStatement(query);
		ResultSet queryResult = smt.executeQuery();
		
		List<String> list = new ArrayList<>();
		while(queryResult.next())
		{
			Book b = new Book();
			String res =queryResult.getString("favourite_books");
			list.add(res);
			//System.out.println(res);
		}
		return list;
	}

	@Override
	public List<String> recomandedService() throws SQLException {
		String foundType="";
		String query = "select distinct recomanded_books from Recomanded_books";
		//String query = "select favourite_books, from Book where classid=? and absentdt>=? and absentdt<=";
		smt=con.prepareStatement(query);
		ResultSet queryResult = smt.executeQuery();
		List<String> list = new ArrayList<>();
		while(queryResult.next())
		{
			String res =queryResult.getString("recomanded_books");
			//System.out.println(res);
			list.add(res);
		}
		return list;
		
	}



	@Override
	public Book addBook(Book book) throws Exception {
		String query = "insert into book values(?,?,?,?)";
		smt = con.prepareStatement(query);
		smt.setInt(1, book.getBookId());
		smt.setString(2, book.getBookName());
		smt.setInt(3, book.getAuthorId());
		smt.setString(4, book.getAuthorName());
		int rowCount = smt.executeUpdate();
		if(rowCount>0)
		{
			return book;
		}
		return null;
	}



	@Override
	public Book addFavouriteBooks(Book book) throws Exception 
	{
		String query = "insert into favourite_books values(?,?)";
		smt = con.prepareStatement(query);
		smt.setString(1, book.getBookName());
		smt.setInt(2, book.getBookId());
		int rowCount = smt.executeUpdate();
		if(rowCount>0)
		{
			return book;
		}
		return null;
	}



	@Override
	public boolean deleteFavouriteBooks(Book book) throws Exception {
		String query = "delete from favourite_books where book_id = ?";
		smt = con.prepareStatement(query);
		smt.setInt(1, book.getBookId());
		int rowCount = smt.executeUpdate();
		if(rowCount==0)
		{
			return false;
		}
		return true;
	}




}
