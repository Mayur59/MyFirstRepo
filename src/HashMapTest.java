import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapTest {

	   public static void swap(int a, int b){
	        int temp=a;
	        a=b;
	        b=temp;
	    }
	    public static void main(String[] args) throws IOException {
	        int numberOfSwaps=0;
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> a = new ArrayList<Integer>();

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aTemp[i]);
	            a.add(aItem);
	        }

	         for (int i = 0; i < a.size(); i++) {
	    // Track number of elements swapped during a single array traversal
	   // int numberOfSwaps = 0;
	    
	    for (int j = 0; j < n - 1; j++) {
	        // Swap adjacent elements if they are in decreasing order
	//   	if(j<a.size()-1) {
	        if (a.get(j) > a.get(j+1)) {
	           // swap(a.get(j), a.get(j+1));
	            int temp=a.get(j);
	          System.out.println("j="+j);
	            a.set(j,a.get(j+1));
	            a.set(j+1,temp);
	           
	            
	            numberOfSwaps++;
	        }
	 //   	}
	        for (int k = 0; k < n; k++) {
	            System.out.print(+a.get(k));

	        }
	         System.out.println();
	    }
	    
	    // If no elements were swapped during a traversal, array is sorted
	    if (numberOfSwaps == 0) {
	        break;
	    }
	}


	System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
	System.out.println("First Element: "+a.get(0));
	System.out.println("Last Element:"+a.get(n-1));
	for (int k = 0; k < n; k++) {
        System.out.print(+a.get(k));

    }



	        // Write your code here

	        bufferedReader.close();
	    }
	}

