package com.book.app.ui;

public class AuthorNotFoundException extends RuntimeException {
private static final long serialVersionUID = 1L;
	
	public AuthorNotFoundException()
	{
		
	}
	
	public AuthorNotFoundException(String msg)
	{
		super(msg);
	}

}
