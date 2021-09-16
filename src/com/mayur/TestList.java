package com.mayur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestList {

	
	 static void  process(List l) {
		 Iterator it=l.iterator();
		
		 System.out.println("for each");
		 
		 
		 
		 for (int i=0; i < l.size(); i++)
	        {
			 for (int j=i +1; j < l.size(); j++) {
				 if(((String) l.get(i)).compareTo((String) l.get(j))>0) {
					 System.out.println("compare="+((String) l.get(i)).compareTo((String) l.get(j)));
					 Object temp =  l.get(i);
					 l.set(i, l.get(j));
					 
						//y[i] = y[i + 1];
					 l.set(j, temp);
					//	y[i + 1] = temp;
					 
				 }
			 }
	            
	        }
		 System.out.println("for each end");
		 
	//	 l.set(0, "vishnu");
		 String[] j=new String[3];;
		j= (String[]) l.toArray(j);
	
		for(int k=0;k<j.length;k++) {
		System.out.println(j[k]);
		}
		
		System.out.println("finally sort ");
		
		System.out.println(l);
		
	
	 
	
	 
	 System.out.println(j);
	 
	  l=Arrays.asList(j);
	  System.out.println("converted");
	 System.out.println(l);
	 
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List s=new ArrayList();
		s.add("vishnu");
		s.add("omkar");
		s.add("shankar");
		System.out.println("main");
		System.out.println(s);
		
		process(s);
		System.out.println("after process");
		System.out.println(s);
    
     
	}

}
