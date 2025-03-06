package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<Integer>{
	@Override
	public Integer get() {
		// TODO Auto-generated method stub
		return 20;
	}
}

public class SupplierDemo {
	public static void main(String[] args) {
		
		//Traditional Approach
		Supplier<Integer> supplier1=new SupplierImpl();
		System.out.println(supplier1.get());
		
		//Anonymous Approach
		Supplier<Integer> supplier2=new Supplier<Integer>() {
			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 30;
			}
		};
		System.out.println(supplier2.get());
		
		//Java8 Approach
		Supplier<Integer> supplier3=()->40;
		System.out.println(supplier3.get());
		
		//Using Stream
		List<Integer> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier3));

		//Changes from the master
		List<Integer> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier3));

		//Using Stream--Change-1
		List<Integer> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier3));

		//Using Stream--Change-2
		List<Integer> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(supplier3));

	}

	//Developed Code
	public Static Integer get() {
		// TODO Auto-generated method stub
		return 20;
	}

}
