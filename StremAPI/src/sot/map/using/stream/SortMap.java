package sot.map.using.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import realworld.filter.foreach.example.Employee;

import java.util.Set;
import java.util.TreeMap;

public class SortMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		map.put("Akshay", 40);
		map.put("Suresh", 80);
		map.put("Nikhil", 50);
		map.put("Sagar", 90);
		map.put("Vini", 70);
		
		
		List<Map.Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
		
//		Traditional Appoach of sorting
		/*Collections.sort(entries, new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
		
		});*/
		
//		Sort using stream()
//		Collections.sort(entries, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
		
	/*	for(Map.Entry<String, Integer> entry1:entries) {
			System.out.println(entry1.getKey()+" : "+entry1.getValue());
		}*/
		
//		Sort using taditional approach
		Map<Employee, Integer> map2=new TreeMap<Employee, Integer>(new Comparator<Employee>(){
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		
		map2.put(new Employee(1, "Akshay", "COMP", 600000), 60);
		map2.put(new Employee(2, "Suresh", "CIVIL", 300000), 30);
		map2.put(new Employee(3, "Nilhil", "COMP", 500000), 50);
		map2.put(new Employee(4, "Sagar", "MGR", 400000), 40);
		map2.put(new Employee(5, "Vini", "LEAD", 900000), 90);
	
		System.out.println(map2);
		
//		Sort using stream
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(r->System.out.println(r));
		
		map2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
		.forEach(r->System.out.println(r));
		
		
		
		
		
		
		
		
	}

}
