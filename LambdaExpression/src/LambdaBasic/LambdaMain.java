package LambdaBasic;

@FunctionalInterface
interface Calculator{
	int calculate(int param1,int param2);
//	int calculate(int param1);
//	void calculate();
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

@Override
	public int calculate(int param1,int param2, int param3) {	
		if(param1>param2 && param1<param3) {
			throw new RuntimeException();
		}
		else
		{
			return param2-param1+param3;
		}	
}
}

public class LambdaMain {
	
	public static void main(String[] args) {
		
		//Traditional Approach
		Calculator calculatorImpl=new CalculatorImpl();
		System.out.println(calculatorImpl.calculate(40,30));
		
		//Java8 Approach(Without Parameter)
		//Calculator calculator1=() -> System.out.println("Calculate");
		//calculator1.calculate();
		
		//Java8 Approach(With Parameter)
		//Calculator calculator= (param) -> System.out.println("Calculate : "+param);
		//calculator.calculate(30);
		
		//Java8 Approach(With 2 Parameters)
		Calculator calculator=(param1,param2)->{
			if(param1>param2) {
				throw new RuntimeException();
			}else {
			 return param2-param1;
			}
			};
		System.out.println(calculator.calculate(30, 40));
		
		//Java8 Approach(With 3 Parameters)
		Calculator calculator=(param1,param2,param3)->{
			if(param1>param2 && param<param3) {
				throw new RuntimeException();
			}else {
			 return param2-param1;
			}
			};
		System.out.println(calculator.calculate(30, 40, 90));
		
	}

}
