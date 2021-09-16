package com.mayur;

public class SearchRepitedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] number=new int[4][4];
		
		number[0][0]=1;
		number[1][0]=1;
		number[1][1]=2;
		number[1][2]=3;
		
		number[2][0]=2;
		number[2][1]=6;
		number[2][2]=6;
		number[2][3]=7;
		
		number[3][0]=0;
		number[3][1]=5;
		number[3][2]=1;
		number[3][3]=2;
		
		for(int i=0; i<number.length;i++) {
			for(int j=0; j<number.length;j++) {
				
				if(number[i][j]!=0 | (i==3&& j==0)) {
				System.out.print(number[i][j]+ " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<number.length;i++) {
			for(int j=0; j<number.length;j++) {
				
				if(number[i][j]==5) {
				System.out.print("output="+number[i][j]+ " ");
				}
			}
			
		}
		
		
		
		

	}

}
