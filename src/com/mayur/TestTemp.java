package com.mayur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestTemp implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList();
		l.add(1);
		l.add(4);
		l.add(3);
		l.add(2);
	Collections.sort(l);
		Iterator<Integer> it=l.iterator();
	//	Collections.sort(l);
	
		
		while(it.hasNext()) {
		//	l.add(5);
		System.out.print(	it.next()+" ");
		}
		System.out.println();
		
		Th t=new Th();
		t.run();
		t.run();
		try {
			System.out.println("in");
		//	int i=1/0;
		//	System.out.println(i);
			float a=1.2f/0;
			System.out.println(a);
		}
		catch(RuntimeException e) {
			
			System.out.println("yes got it right" );
			e.printStackTrace();
			
		}
		
		
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Temp{
	
}

class Th extends Thread{
	
	public void run() {
		System.out.println(" run running");
	}
	public void  start() {
		System.out.println(" start running");
	}
}
