package javatechie;

@FunctionalInterface
interface Calculator{
	int calculate(int param1,int param2);
}

class CalculatorImpl implements Calculator{
	@Override
	public int calculate(int param1,int param2) {	
		if(param1>param2) {
			throw new RuntimeException();
		}
		else
		{
			return param2-param1;
		}	
}
}

public class LambdaMain {
	
	public static void main(String[] args) {
		
		Calculator calculatorImpl=new CalculatorImpl();
		System.out.println(calculatorImpl.calculate(40,30));
		
//	Calculator calculator=() -> System.out.println("Calculate");
//	calculator.calculate();
		
//		Calculator calculator= (param) -> System.out.println("Calculate : "+param);
//		calculator.calculate(30);
		
		Calculator calculator=(param1,param2)->{
			if(param1>param2) {
				throw new RuntimeException();
			}else {
			 return param2-param1;
			}
			};
		System.out.println(calculator.calculate(30, 40));
		
	}

}
