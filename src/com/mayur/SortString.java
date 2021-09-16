package com.mayur;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "vishnu", "omkar", "shankar" };
		int k = s[0].compareTo(s[1]);
		int kr = s[1].compareTo(s[0]);
		int l = s[1].compareTo(s[2]);
		int h = s[2].compareTo(s[0]);

		char[] s1 = s[0].toCharArray();
		char[] s2 = s[1].toCharArray();
		char[] s3 = s[2].toCharArray();

		for (int i = 0; i < s.length - 1; i++) {

			for (int j = i + 1; j < s.length; j++) {
				/*
				 * if (i == s.length - 1) { break; }
				 */
				System.out.println("s[i]=" + s[i] + " s[j]=" + s[j]);
				System.out.println("compare=" + s[i].compareTo(s[j]));
				if ((s[i].compareTo(s[j]) > 0)) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}

				// System.out.println(s[i]);
			}
		}
		System.out.println("original");
		for (int i = 0; i < s.length; i++) {

			System.out.println(s[i]);
		}
		// -----------------------------------------------------------------------
		System.out.println("==================================================================");

		String[] y = { "shankar", "omkar", "ganpati" };
		SortString t = new SortString();
		int w = t.compareTo(y[0], y[1]);
		for (int i = 0; i < y.length - 1; i++) {

			for (int j = i + 1; j < y.length; j++) {
				if (i == y.length - 1) {
					break;
				}
				System.out.println("y[i]=" + y[i] + " y[j]=" + y[j]);
				 System.out.println("compare=" + t.compareTo(y[i], y[j]));

				if ((t.compareTo(y[i], y[j]) > 0)) {
					String temp = y[i];
					y[i] = y[i + 1];
					y[i + 1] = temp;
				}

				// System.out.println(s[i]);
			}
		}

		for (int i = 0; i < y.length; i++) {

			System.out.println(y[i]);
		}

		// System.out.println("w="+w);
	}

	public int compareTo(Object s1, Object s2) {
		int sum = 0;

		char[] c1 = ((String) s1).toCharArray();
		char[] c2 = ((String) s2).toCharArray();
		int a = c1[1];
		int b = c2[1];
		int temp = c1[0] - c2[0];

		int l1 = c1.length;
		int l2 = c2.length;
		int tl = 0;
		if (l1 < l2) {
			tl = l1;
		} else {
			tl = l2;
		}

		for (int i = 0; i < tl; i++) {
			if (c1[i] != c2[i]) {
				sum = c1[i] - c2[i] + sum;

				break;
			}

		}

		return sum;
	}

}
