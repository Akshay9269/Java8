package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateImpl implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

public class PedicateDemo {

	public static void main(String[] args) {

		//Traditional Approach
		Predicate<Integer> predicate1=new PredicateImpl();
		System.out.println(predicate1.test(10));
		
		//Anonymous Approach
		Predicate<Integer> predicate2=new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				if(t%2==0) {
					return true;
				}else {
				return false;
				}
			}
		};
		System.out.println(predicate1.test(11));
		
		//Java8 Approach
		Predicate<Integer> predicate3=(t)->{
			if(t%2==0) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println(predicate3.test(20));
		
		//Java8 Streamline
		Predicate<Integer> predicate4=t->t%2==0;
		System.out.println(predicate4.test(15));
		
		//Using Stream
		List<Integer> list=Arrays.asList(10,11,20,21);
		list.stream().filter(t->t%2==0).forEach(s->System.out.println("Printing Even : "+s));

		//Changes done in the master
		Predicate<Integer> predicate4=t->t%2==0;
		System.out.println(predicate4.test(15));


		List<Integer> list=Arrays.asList(10,11,20,21);
		list.stream().filter(t->t%2==0).forEach(s->System.out.println("Printing Even : "+s));

		//Using Stream--Change-32
		List<Integer> list=Arrays.asList(30,16,25,20);
		list.stream().filter(t->t%2==0).forEach(s->System.out.println("Printing Odd : "+s));

		//Using Stream--Change-1
		List<Integer> list=Arrays.asList(10,11,20,21);
		list.stream().filter(t->t%2==0).forEach(s->System.out.println("Printing Even : "+s));

		//Using Stream--Change-2
		List<Integer> list=Arrays.asList(10,11,20,21);
		list.stream().filter(t->t%2==0).forEach(s->System.out.println("Printing Even : "+s));



    }

}
