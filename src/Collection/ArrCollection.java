package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Ayansh");
		list.add("Rahul");
		list.add("pawan");
		list.add("nayan");
		list.add("jawahar");
		
		System.out.println(" name list "+list);
		
		LinkedList linkedList= new LinkedList();
		
		linkedList.add(56);
		System.out.println("LinkedList" +linkedList);
		
		List arrayList=new ArrayList();
		
		arrayList.add(30);
		arrayList.add(70);
		
		linkedList.addAll(arrayList);
		
		System.out.println("append LinkedList" +linkedList);
		
		
	  }
		
		}


