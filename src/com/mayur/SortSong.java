package com.mayur;

import java.util.*;

public class SortSong {

	public static void main(String[] args) {

		Song s1 = new Song("vishnu", "mangesh", "mahadev");
		Song s2 = new Song("omkar", "suresh", "omkar1");
		Song s3 = new Song("shankar", "milind", "krishna");
		 Song s4=new Song("ram","Ajay","Keshav");

		List<Object> l = new ArrayList<Object>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		 l.add(s4);
		System.out.println("before");
		System.out.println(l);
		// Collections.sort(l);
		MyCollections.sort(l);
		System.out.println("after");

		System.out.println(l);
		SortBySingerComparator s=new SortBySingerComparator();
		MyCollections.sort(l, s);
		System.out.println("after comparator sort");

		System.out.println(l);
	}
}

class Song implements Comparable<Object> {

	String title;
	String singer;
	String movie;

	public Song(String title, String singer, String movie) {
		super();
		this.title = title;
		this.singer = singer;
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", singer=" + singer + ", movie=" + movie + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		SortString t = new SortString();
		// System.out.println("count");
		Song s = (Song) o;
		StringDummy sd = new StringDummy();
		return sd.compareTo(this.title, s.title);

		// return this.title.compareTo(s.title);

	}

}
