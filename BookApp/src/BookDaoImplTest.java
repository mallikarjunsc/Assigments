import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import com.book.app.dao.BookDaoImpl;
import com.book.app.model.Book;
class BookDaoImplTest {


	Book b1 = new Book(1000,"Mahabharath",10,"Vyasa");
	Book b = new Book();
	
//	BookDaoImpl book = new BookDaoImpl();

	@Test
	void searchBookContents()//to test test the content of the added Books
	{
		//BookDaoImpl book = null;
		

		//Book list = null;
		try {
			BookDaoImpl book = null;
			Book list = book.addBook(b);
			
			assertEquals(b1,b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
	}
	
	@Test
	void searchAuhtorId()
	{
		
	}
	
	


}
