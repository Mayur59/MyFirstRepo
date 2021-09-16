package com.bank;

public interface Bank {
	
	default void go() {
		
	}
	 default void say(){  
	        System.out.println("Hello, this is default method");  
	    }  
	  String getBankName();  
	  
	  static void cal() {
		  System.out.println("yes it is static matheod in Interface");
	  }
}
