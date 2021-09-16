package com.mayur;

import java.util.Scanner;

public class CalculateWeek {

	public static void main(String[] args) {
		int i=1;
		
		while (i==1) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		CalculateWeek c=new CalculateWeek();
		c.process(input);
		i=sc.nextInt();
		
		}
	}

	private void process(String input) {
		int temp=Integer.parseInt(input);
		String res="";
		int weeks=0;
		int days=0;
		weeks=temp /7;
		if(weeks>0) {
			res=res +weeks +" weeks ";
		}
		days=temp % 7;
		if(days>0) {
			res=res + days +" days";
		}
		
		
		
		System.out.println(res);
		
		
		
		
		
	}

}
