package realworld.filter.foreach.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpService {
	
	public static List<Employee> getTaxPayableEployees(String input) {

	return input.equalsIgnoreCase("tax")?
		new EmpDao().getEmployees().stream().filter(p->p.getSalary()>500000).collect(Collectors.toList())
		:
		new EmpDao().getEmployees().stream().filter(p->p.getSalary()<=500000).collect(Collectors.toList());

//---------------------------------------------------------------------------------------------------------		
		
/*		Traditional Approach
		EmpDao dao=new EmpDao();
		List<Employee> list=dao.getEmployees();
		List<Employee> collect=new ArrayList<Employee>();
		if(input.equals("tax")) {
			
			for(Employee e:list) {
				if(e.getSalary()>500000) {
					collect.add(e);
				}
			}
		}else {
			for(Employee e:list) {
				if(e.getSalary()<500000) {
					collect.add(e);
				}
			}
		}
		return collect;
*/	
		
	}
	
	public static void main(String[] args) {
	
		EmpService.getTaxPayableEployees("non-tax").stream().forEach(t->System.out.println(t));

//--------------------------------------------------------------------------------------------------------		
		
/*		Traditional Approach
		List<Employee> list= EmpService.getTaxPayableEployees("tax");
		System.out.println(list);
*/
	}
}
