package com.thread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Reader extends Thread{
	
	
	int i=0;
	Calculator c;
	public Reader(Calculator c){
		this.c=c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Car, String> s=new HashMap<Car, String>();
		Car c=new Car("mayur");
		//c.setName("mayur");
		
	Car c2=new Car("suresh");
	//c.setName("suresh");
		
		s.put(c, "ghag");
	s.put(c2, "ghag");
		System.out.println("map");
		s.containsKey(c);
	System.out.println(	s.get(c2));
	System.out.println(	s.get(new Car("mayur")));
	System.out.println(	s.get(new Car("suresh")));
		System.out.println("done");
		
		
		
		
		
		Set m=new HashSet();
		m.add("a");
		m.add("b");
		m.add("a");
		
		System.out.println("size="+m.size());
		
		System.out.println("found="+m.contains("b"));
		
		Calculator ca=new Calculator();
		
		new Reader(ca).start();
		
		new Reader(ca).start();
		new Reader(ca).start();

		ca.start();
	}
	
	

	@Override
	public void run() {
		while(i>4) {
	
		// TODO Auto-generated method stub
		synchronized (c) {
			while(c.total==0) {
			try {
				System.out.println("waiting for calculation");
				
			
				c.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
			System.out.println("Total is="+c.total);
		}
		
		}
		i++;
	}
}



class Calculator extends Thread {
	
	
	int total;
	
	public void run() {
		synchronized ( this) {
			
			for(int i=0;i<5;i++)
			{
				total=total+i;
			}
		}
		
		this.notifyAll();
	}
	
	
}
