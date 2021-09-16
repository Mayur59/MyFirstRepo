package com.mayur;

public class SortBySingerComparator implements MyComparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Song s1=(Song) o1;
		Song s2=(Song) o2;
		StringDummy d=new StringDummy();
		
		return d.compareTo(s1.singer, s2.singer);
	}

}
