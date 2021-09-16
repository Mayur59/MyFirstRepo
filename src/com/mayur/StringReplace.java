package com.mayur;

import java.util.Scanner;

public class StringReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String ostring = sc.nextLine();
		char[] ochar = ostring.toCharArray();
		String rstring = sc.nextLine();
		char[] rchar = rstring.toCharArray();
		String mstring = sc.nextLine();
		char[] ms = mstring.toCharArray();
		int olen = ostring.length();
		int rlen = rstring.length();

		for (int i = 0; i < olen; i++) {

			System.out.print(ochar[i]);
		}
		System.out.println();
		for (int i = 0; i < rlen; i++) {

			System.out.print(rchar[i]);
		}
		int i = 0;
		int res = 0;
		int w = 0;
		int temp1 = 0;
		int temp2 = 0;

		while (i < olen) {
			int a = i;

			for (int j = 0; j < rlen; j++) {
				temp1 = a;
				if ((a < olen) && ochar[a] == rchar[j]) {

					a++;
					res++;
				} else {
					System.out.println("j=" + j);
					a = j;
					res = 0;
					break;
				}

			}
			i++;

			if (res == rlen) {
				int t = 0;
				temp1 = temp1 - res + 1;
			//	System.out.println("temp1=" + temp1 + "a= " + a + "olen " + olen + "t=" + t);

				for (int k = temp1; k < olen; k++) {
					if (t == rlen) {
						break;
					}
					ochar[k] = ms[t];
					t++;

					System.out.println("finally");
				}
				res = 0;

				w++;

			}

		//	System.out.println("in while");

		}
		if (w > 0) {
			System.out.println("found =" + w+" times");
		} else {
			System.out.println("not found");
		}
		System.out.println();
		for (int k = 0; k < olen; k++) {

			
			System.out.print(ochar[k]);
		}

	}

}
