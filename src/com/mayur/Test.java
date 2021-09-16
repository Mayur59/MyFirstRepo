package com.mayur;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	 public static void main(String[] args) {
		 
		 
		Test t=Test.getTest();
	System.out.println(	t.hashCode());
		 System.out.println("test");
		 Map<String , String> m= new HashMap<String, String>();
		 Map<String , String> p= new LinkedHashMap<String, String>();
		 
		m.put("Mayur", "Ghag");
		m.put("Suresh", "Shinde");
		m.put("Sachin", "Gore");
		m.put("Jayesh", "pawar");
		
		
		p.put("Mayur", "Ghag");
		p.put("Suresh", "Shinde");
		p.put("Sachin", "Gore");
		p.put("Jayesh", "pawar");
		Set<Entry<String, String>> it=m.entrySet();
		 Iterator<Entry<String, String>>  i=it.iterator();
		 Set<Entry<String, String>> it1=p.entrySet();
		 Iterator<Entry<String, String>>  j=it1.iterator();
		 Set<String> sm= m.keySet();
		  Collection<String> c= m.values();
		  int e=c.size();
		
		  
		
			System.out.println(e);
		
		 
		Iterator<String> it2= sm.iterator();
		System.out.println("follow are all keys");

		 while(it2.hasNext()) {
			// m.remove("Mayur");
			 System.out.println(it2.next());
			 //i.next();
		 }
		 
		
		 while(i.hasNext()) {
			// m.remove("Mayur");
			 System.out.println(i.next());
			 //i.next();
		 }
		 
		 System.out.println();
		 
		 System.out.println("new list");
		 
		 
		 while(j.hasNext()) {
				// m.remove("Mayur");
				 System.out.println(j.next());
				 //i.next();
			 }
	}

	private static Test getTest() {
		// TODO Auto-generated method stub
		return new Test();
	}

}
 class A{
	/*
	 * public static void main(String[] args) { System.out.println("a"); }
	 */

 }
 class B{
	 public static void main(String[] args) {
		 System.out.println("b");
	}
 }
 class C{
	 
 }
 
