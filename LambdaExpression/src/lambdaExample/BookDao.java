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
		books.add(new Book(5, "Kotlin", 3000));
		books.add(new Book(6, "C#", 4000));
		books.add(new Book(7, "SpringBoot", 9000));
		books.add(new Book(8, "SQL Server", 8000));
		return books;
	}
	
	
}
