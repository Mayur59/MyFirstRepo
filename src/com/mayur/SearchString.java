package com.mayur;

import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
					int c=0;
					int word=0;
						Scanner sc = new Scanner(System.in);
					     String avb = sc.next();
					  
					     char[] avbchar=avb.toCharArray();
					     int len=avbchar.length;
					     String serach = sc.next();
					     
					     char[] searchar=serach.toCharArray();
					     int lens=searchar.length;
					     
					     for(int i=0;i<lens;i++) {
					    	 System.out.print(searchar[i]);
					     }
					     System.out.println();
					     for(int i=0;i<len;i++) {
					    	 System.out.print(avbchar[i]);
					     }
	    
					     for(int i=0;i<len;i++) 
					     {
							    	 int a=i;
							    	 c=0;
							    	 for(int j=0;j<lens;j++) {
							    		 
							    		System.out.println("a="+a+"  i="+i);
							    		 
					    		if (a!=len&&(avbchar[a]==searchar[j]))
					    		{
							    	 c++;
							    	 a++;
					    			
					    			
					    		 
					    		}
	    	 
					    		else
					    		{ 
				
								//	 System.out.println("in else block"); 
									  break;
					    		}
						    	if(lens==c) {
						    		
						    		word++;
							    	
							     }
				 
	    		 
	    		 
					}
	    	 }
	    
				     if(word>0) {
				    
				    	 System.out.println("search is successful at "+word+" times" );
				     }
				     else {
				    	 System.out.println("search is unsuccessful");
				    	 
				     }
				     
	     
	 
				}
		}

