package sot.using.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import realworld.filter.foreach.example.EmpDao;
import realworld.filter.foreach.example.Employee;

public class SortCollection {
	
	public static void main(String[] args) {
		
//		Sort the list using traditional approach
		List<Integer> list=new ArrayList<Integer>();
		list=Arrays.asList(10,50,40,20,30);
		/*Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);*/
		
//		Sort using stream() ascending order
//		list.stream().sorted().forEach(s->System.out.println(s));
		
//		Sort using stream() descending order
//		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
		List<Employee> employees=EmpDao.getEmployees();
		
//		Sort the employees based on salary using Comparator Anonymously
		/*Collections.sort(employees, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			};
		});*/
		
//		Sort the employees based on salary using Comparator lambda
//		Collections.sort(employees,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		
//		Sort the employees based on salary using stream()
		employees.stream().sorted(Comparator.comparing(e->e.getSalary())).forEach(s->System.out.println(s));
		
//		System.out.println(employees);
		
		
	}

}

class MyComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary()-o2.getSalary());
	}
}
