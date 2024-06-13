package foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
	public static void main(String[] args) {
		
//		forEach Demo for list
		
		List<String> list=new ArrayList<String>();
		list.add("akshay");
		list.add("akshata");
		list.add("akash");
		list.add("suyog");
		list.add("gayatri");
		
		/*Consumer<String> consumer=(t)->System.out.println(t);
		list.stream().forEach(consumer);
		*/
		
		list.stream().forEach(t->System.out.println(t));

//--------------------------------------------------------------------------------------------------		
		
//		forEach Demo for map
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		map.entrySet().stream().forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
	}

}
