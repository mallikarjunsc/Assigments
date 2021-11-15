package com.book.app.main;
import java.sql.SQLException;
import java.util.Scanner;

import com.book.app.ui.AuthorNotFoundException;
import com.book.app.ui.BookAppUi;
import com.book.app.ui.InputMissMatchException;

public class BookAppRunner {
	public static void main(String[] args) throws SQLException, InputMissMatchException  
	{
		Scanner sc = new Scanner(System.in);
		BookAppUi appUi=null;
		appUi = new BookAppUi();
		String str = "password";
		System.out.println("Welcome To BookApp!!!");
		System.out.println("---------------------");
		System.out.println("Enter the UserName : ");
		String userName = sc.nextLine();
		System.out.println();
		System.out.println("Enter the Password :");
		String password = sc.nextLine();
		if(str.equalsIgnoreCase(password))
		{
			System.out.println("Login Successfull!!");
			System.out.println();
		}
		else 
		{
			System.out.println("Wrong Password!!!");
			System.exit(1);
		}
		while(true)
		{
			System.out.println("Enter a option : \n [1 - Add Books] \n [2 - Display Favourite Books] \n [3 - Search By Authors] \n [4 - Display Recomandation] \n [5 - Add Favourite Books]\n [6 - Delete Favourite Book] \n [0 - Exit] \n" );
			int option = sc.nextInt();
			switch(option)
			{
				case 1:
					appUi.addBooks();
					break;
				case 2:
					appUi.displayFavouriteBooks();
					break;
				case 3:
				
					appUi.searchAuthor();
				
					break;
				case 4:
					appUi.displayRecomanded();
					break;
				case 5:
					appUi.addFavourite();
					break;
				case 6:
					appUi.deleteFavourites();
					break;
				case 0:
					System.exit(1);
					break;
				default:
					throw new IllegalArgumentException("Invalid Option: " + option);
			}
		}
	}
}
