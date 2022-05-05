package Collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionDemo1 {
	public static void main(String[] args) {
		
	
	Map<Integer, String> map=new HashMap<Integer,String>();
	map.put(1,"Ayansh");
	map.put(2,"priyansh");
	map.put(3,"kriyansh");
	map.entrySet();

	for(Map.Entry m:map.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	
	}
}

}