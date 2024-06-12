package lambdaExample;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> addBooks(){
		List<Book> books=new ArrayList<Book>();
		books.add(new Book(1, "Java", 3000));
		books.add(new Book(2, "Hibernate", 4000));
		books.add(new Book(3, "Spring", 9000));
		books.add(new Book(4, "Python", 8000));
		return books;
	}
	
	
}
