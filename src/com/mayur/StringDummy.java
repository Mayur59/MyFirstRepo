package com.mayur;

public final class StringDummy {

	public final int compareTo(Object s1, Object s2) {
		int sum = 0;

		char[] c1 = ((String) s1).toCharArray();
		char[] c2 = ((String) s2).toCharArray();
		int a = c1[1];
		int b = c2[1];
		// int temp = c1[0] - c2[0];

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
