package realworld.filter.foreach.example;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	
	public static List<Employee> getEmployees(){
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(1, "akshay", "java", 600000));
		list.add(new Employee(2, "akash", "python", 900000));
		list.add(new Employee(3, "akshata", "aws", 1200000));
		list.add(new Employee(4, "gayatri", "azure", 400000));
		list.add(new Employee(5, "suyog", "civil", 200000));
	
		return list;
	}
}
