package com.mayur.ds.sort;

public class BubbleSort {
	
	
	public void insertionSort( int [] n) {
		int len=n.length;
		
		// {2,4,1,8,5};
		
		for(int i=1;i<n.length-1;i++) {
			int key=i;
			int a=key;
			for(int j=key;j>=0;j--) {
				if(n[j]>n[key]) {
					int temp=n[j];
					n[j]=n[key];
					n[key]=temp;
										
				}
			
				
		}
			
			/*
			 * for(int d=0;d<n.length;d++) { System.out.print(n[d]+" ");
			 * 
			 * } System.out.println();
			 */
			
			
		}
		
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
		
		
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort b=new BubbleSort();
		 int[] number= {2,4,1,8,5};
		b.insertionSort(number);
		
		 int[] number2= {2,4,1,8,5};
	int len=number.length;
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number.length;j++) {
				if((j<len-1)&&number[j]>number[j+1]){
					int temp=number[j];
					 number[j]=number[j+1];
					 number[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		
		int min=0;
		int count=0;
		int t=0;
		
		for(int i=0;i<number2.length;i++) {
			min=i;
			for(int j=i;j<number2.length;j++) {
				if((j<len-1)&&number2[min]>number2[j+1]){
					t=j+1;
					
				count++;
				}
				
			}
			if(count>0) {
				int temp=number2[min];
				 number2[min]=number2[t];
				 number2[t]=temp;
				 count=0;
			}
		}
		
		System.out.println();
		for(int i=0;i<number2.length;i++) {
			System.out.print(number2[i]+" ");
		}
	}
	
	

}
