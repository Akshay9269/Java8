package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println("Printing Traditional : "+t);
	}
}

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		//Traditional Approach
		ConsumerImpl consumerImpl=new ConsumerImpl();
		consumerImpl.accept(10);
		
		//comment git
		//Anonymous class
		Consumer<Integer> consumerAnonym=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("Printing anonymous : "+t );
			}
		};

		consumerAnonym.accept(20);
		
		//Java8 Approach
		Consumer<Integer> consumerJava=(t)->{
			System.out.println("Printing Java8 : "+t);
		};
		
		consumerJava.accept(30);
		
		//More Stremline(Removing Brackets)
		Consumer<Integer> consumerJavaStreml=(t)->System.out.println("Printing Java8 Streml : "+t);
		
		consumerJavaStreml.accept(30);
		
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		
		//Using Stream()-First
		list.stream().forEach(consumerJava); //We can pass any consumer object e.g consumerAnonym,consumerJavaStreml
		System.out.println();
		
		//Using Stream()-Second
		list.stream().forEach(t->System.out.println(t));

		//Using Stream()-Change-92
		list.stream().forEach(f->System.out.println(f));

		//Additional extra lines Adding now
		list.stream().forEach(U->System.out.println(U));


		//Additional extra lines Adding now--Change-12
		list.stream().forEach(S->System.out.println(S));

		//Additional extra lines Adding now--Change-1
		list.stream().forEach(U->System.out.println(U));

		//Developing one feature
		System.out.println("Developed Code");

		//master change 1.2
		list.stream().forEach(U->System.out.println(U));

		//Additional extra lines Adding now---Change-2
		list.stream().forEach(U->System.out.println(U));



    }

}

/*
 Output:
 Printing Traditional : 10
Printing anonymous : 20
Printing Java8 : 30
Printing Java8 Streml : 30
Printing Java8 : 10
Printing Java8 : 20
Printing Java8 : 30
Printing Java8 : 40
Printing Java8 : 50

10
20
30
40
50
*/ 

