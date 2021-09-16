package com.mayur;
import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(4>4) {
			System.out.println("test is done.");
		}
		else {
			System.out.println("got result");
		}
		List l=new ArrayList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("e");
		l.add("f");
		l.add("g");
		l.add("h");
		Iterator it=l.iterator();
		//int i=0;
		while(it.hasNext()) {
		//	System.out.println(it.next());
			l.remove(0);
			//i++;
			System.out.print(l);
			System.out.println();
		}
		System.out.println();
		System.out.println(l);
		
		

	}

}
