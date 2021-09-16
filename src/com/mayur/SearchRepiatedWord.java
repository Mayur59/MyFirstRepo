package com.mayur;



public class SearchRepiatedWord {

	public static void main(String[] args) {

		int temp = 0;

		String[] avb = { "black", "orange", "black", "brown", "black", "orange", "orange", "brown" };
		System.out.println("string arrays follows");
		for (int i = 0; i < avb.length; i++) {
			System.out.print(avb[i] + " , ");
		}
		System.out.println();
		for (int i = 0; i < avb.length; i++) {
			int t = 0;
			int time = 0;
			int a = 0;
			temp = i - 1;
			outer: for (int j = i + 1; j < avb.length; j++) {

				while (temp >= 0) {
					if (avb[i].equals(avb[temp--])) {

						break outer;
					}
				}

				if (avb[i].equals(avb[j])) {
					time++;
					if (t == 0) {
						System.out.println();
						a = i;
						a++;
						System.out.print(avb[i] + " word at position no " + a + " found  at position no ");
						t++;
					}
					System.out.print(j + 1 + ", ");

				}

			}
			if (time >= 1) {
				time++;
				System.out.println("there fore " + avb[i] + " is " + time + " times in given string array");
			}

		}

	}

}
