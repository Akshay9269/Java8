package filter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FilterDemo {
	
	public static void main(String[] args) {

//		Filter Demo for list
		
		List<String> list=new ArrayList<String>();
		list.add("akshay");
		list.add("akshata");
		list.add("akash");
		list.add("suyog");
		list.add("gayatri");
		
/*		Traditional Approach
		for(String s:list) {
			if(s.startsWith("a")) {
				System.out.println(s);
			}
		}
*/
		
		list.stream().filter(s->s.startsWith("a")).forEach(t->System.out.println(t));
		
//-------------------------------------------------------------------------------------------------------	
		
//		Filter Demo for map
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
/*		Traditional Approach
		for(Entry<Integer, String> i:map.entrySet()) {
			if(i.getKey()%2==0) {
				System.out.println(i.getKey()+" "+i.getValue());
			}
		}
*/	
		
		map.entrySet().stream().filter(p->p.getKey()%2==0).forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
	}

}
