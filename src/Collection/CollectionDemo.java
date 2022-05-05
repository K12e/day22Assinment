package Collection;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class CollectionDemo {
	public static void main(String[] args) {
		System.out.println("******************");
		
		List<String> languages = new LinkedList<String>();
		languages.add("Hindi");
		languages.add("English");
		languages.add("Marathi");
		languages.add("Telagu");
		Collections.sort(languages);
		
		System.out.println("return elements is "+languages.get(1));
		languages.set(1,"kannad");
		
		
		for(String str:languages ) {
			System.out.println(str);
		}
	
		System.out.println("******************");
		
		Stack<String> stack= new Stack<String>();
		stack.push("Kalyani");
		stack.push("Swati");
		stack.push("Dhanashri");
		stack.push("Smita");
	   
	    for(String str:stack ) {
			System.out.println(str);
	    }
	    
		 System.out.println("******************");
		 
		PriorityQueue<String> queue =new PriorityQueue<String>();
		queue.add("kalyani rathod");
		queue.add("Swati badole");
		queue.add("dhanashri nerkar");
		queue.add("smitha rai");
		
		System.out.println("head==> "+queue.element());
		System.out.println("head==> "+queue.peek());
		System.out.println(queue);
		 Iterator itr1=queue.iterator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next());
		 }
		 queue.remove();  
		 queue.poll();  
		 System.out.println("after removing two elements:");  
		 Iterator<String> itr2=queue.iterator();  
		 while(itr2.hasNext()){  
		 System.out.println(itr2.next());  
		
		 }  
		
		 System.out.println("******************");
		 
		 Map<Integer, String> map=new HashMap<Integer,String>();
			map.put(1,"Ayansh");
			map.put(2,"priyansh");
			map.put(3,"kriyansh");
			map.entrySet();

			for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
	}
			 System.out.println("******************");
}
}