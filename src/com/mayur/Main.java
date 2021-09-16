package com.mayur;

public class Main {

	public static boolean checkArmstrongNumber(int no) {
		boolean b;
		int tempdigit = no;
		double res = 0;
		int a = 0;
		int sum = 0;
		while (no > 0) {

			no = no / 10;
			a++;

		}
		no=tempdigit;

		while (no > 0) {

			res = no % 10;
			res = Math.pow(res, a);
			sum = (int) (sum + res);
           no=no/10;
		}
		
		if (tempdigit == sum) {
			return true;

		} else {
			return false;
		}

	}

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean temp = false;
		temp = checkArmstrongNumber(153);

		System.out.println("is this armstrong no=" + temp);

		temp = checkArmstrongNumber(1634);

		System.out.println("is this armstrong no=" + temp);
		
		temp = checkArmstrongNumber(152);

		System.out.println("is this armstrong no=" + temp);

	}

}
