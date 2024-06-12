package lambdaExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {
	
	public static void main(String[] args) {
		
		List<Book> books=new BookDao().addBooks();
		System.out.println(books);
//		Collections.sort(books, new Mycomparator());
//		Collections.sort(books, new Comparator<Book>() {
//			public int compare(Book o1, Book o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		Comparator<Book> myComparator=(o1,o2)->o1.getName().compareTo(o2.getName());
		
		Collections.sort(books,myComparator);
		System.out.println(books);
		
	}
}

class Mycomparator implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}