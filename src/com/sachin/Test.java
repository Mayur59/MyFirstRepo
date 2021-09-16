package com.sachin;

public class Test  extends Thread{

	
	public void run() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("running by "+ Thread.currentThread().getName());
			
			
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Test();
		Thread t2=new Test();
		Thread t3=new Test();
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.setName("Ram");
		t2.setName("Vishnu");
		t3.setName("Krishna");
		
		
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("It is in main");
		
		

	}

}
