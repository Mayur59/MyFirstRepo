package com.mayur;

import java.util.Scanner;

public class SearchLongWord {

	char[] t1 = new char[20];
	char[] t2 = new char[20];

	char[] t3 = new char[20];

	String s1 = "";
	String s2 = "";
	String s3 = "";

	public static void main(String[] args) {
int i=1;
		while(i==1) {
			
		Scanner sc = new Scanner(System.in);
		String avb = sc.nextLine();
		SearchLongWord a = new SearchLongWord();

		a.process(avb);
		
		i =sc.nextInt();

	}
	}

	public void process(String s) {

		int res = 0;
		char[] temp = s.toCharArray();
		int lt1 = 0;

		for (int i = 0; i < temp.length; i++) {

			if (temp[i] == ' ') {
				res++;

			}
			if (temp[i] != ' ' && res == 0) {

				s1 = s1 + temp[i];

			} else if (temp[i] != ' ' && res == 1) {

				s2 = s2 + temp[i];

			} else {
				if (temp[i] != ' ') {

					s3 = s3 + temp[i];
				}
			}

			lt1 = t1.length;

		}

		if (s1.length() > s2.length() && s1.length() > s3.length()) {
			System.out.println("final ans=" + s1);
		} else if (s2.length() > s3.length() && s2.length() > s1.length()) {
			System.out.println("final ans=" + s2);
		} else {
			System.out.println(s3);
		}

	}

}
