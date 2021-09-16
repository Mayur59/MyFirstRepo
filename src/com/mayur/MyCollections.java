package com.mayur;

import java.util.Arrays;
import java.util.List;

public class MyCollections {

	public static <T extends Comparable<? super Object>> void sort(List<Object> l) {

		Object[] y = l.toArray();
		StringDummy sd = new StringDummy();

		for (int i = 0; i < l.size(); i++) {

			for (int j = i + 1; j < l.size(); j++) {

				if ((((Comparable<? super Object>) l.get(i)).compareTo(l.get(j))) > 0) {
				//	System.out.println("compare=" + ((Comparable<? super Object>) l.get(i)).compareTo(l.get(j)));
					Object temp = l.get(i);
					l.set(i, l.get(j));

					l.set(j, temp);

				}

			}

		}

		for (int k = 0; k < y.length; k++) {

			System.out.println(y[k]);
		}
		l = Arrays.asList(y);
		System.out.println(l);
	}
	
	public static <T extends MyComparator> void sort(List<Object> l ,MyComparator c) {
		
		
		for (int i = 0; i < l.size(); i++) {

			for (int j = i + 1; j < l.size(); j++) {

				if ((((MyComparator) c)).compare( l.get(i),l.get(j)) > 0) {
				//	System.out.println("compare=" + ((Comparable<? super Object>) l.get(i)).compareTo(l.get(j)));
					Object temp = l.get(i);
					l.set(i, l.get(j));

					l.set(j, temp);

				}

			}

		}

		
	}
	

}
