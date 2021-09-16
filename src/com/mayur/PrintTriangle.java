package com.mayur;

import java.util.Scanner;

public class PrintTriangle {

	public void printAstricTriagle(int u) {

		System.out.println("program started in method");
		System.out.println("u=" + u);
		for (int i = u; i > 0; i--) {

			for (int j = i; j > 0; j--) {

				System.out.print(" ");
			}
			for (int k = i; k <= u; k++) {

				System.out.print(" *");

			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintTriangle p = new PrintTriangle();
		System.out.println("Please enter no from which tringle to print");
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		int u1 = sc.nextInt();
		String s=sc.next();

		System.out.println("program started");

		p.printAstricTriagle(u);

		p.getFactorail(u);

		p.reverseDigit(u1);
		
		p.reverseString(s);

	}

	private void reverseString(String s) {
		String s1="";
		int j=0;
	
		char[] temp=s.toCharArray();
		/*
		 * while(temp[j]!='\0') { j++; System.out.println(j); }
		 */
		
		System.out.println("lenght of string is " + j);
		
		
		for(int i=0;i<temp.length;i++) {
		System.out.print(temp[i]);
		}
		System.out.println();
		
		int len=temp.length;
		System.out.println("Reverse of string "+ s + " is  as follows");
		
		char [] temp1=new char[5];
		
		for(int i=len-1;i>=0;i--) {
			
			temp1[i]=temp[i];
			System.out.print(temp1[i]);
			s1=s1+temp1[i];
			
			}
		System.out.println();
		
		
		
		System.out.println("s= "+s +"and s1="+s1);
		
		if(s.equals(s1) ){
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is  not palindrome"); 
		}
		
		
		
	}

	private void reverseDigit(int u1) {
		int temp = u1;
		int no = u1;
		int rem = 0;
		int res = 0;
		while (no > 0) {
			rem = no % 10;
			no = no / 10;
			res = rem + res * 10;
		}

		System.out.println("Reverse digit=" + res);

		if (temp == res) {
			System.out.println(temp + "  Number is palindrome");
		} else {
			System.out.println(temp + " Number is not palindrome");
		}

	}

	private void getFactorail(int u) {
		int result = 1;
		// TODO Auto-generated method stub
		for (int i = u; i > 0; i--) {
			result = result * i;
		}

		System.out.println("factorial is=" + result);

	}

}
