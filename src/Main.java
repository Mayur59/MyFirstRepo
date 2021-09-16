
/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
    	Iterator it=array.iterator();
    	
    	while(it.hasNext()) {
    		System.out.println(it.next());
    	}
    	System.out.println();
    	System.out.println();
    	System.out.println("Expected result as follows");
    	System.out.println();
    	System.out.println();
       
    	String[] s =new String[6];
    	String[] []t=new String[6][4];
    	int temp=0;
    	int max=0;
    	int pos=0;
    	String con="";
    	int cn=0;
    	int fin=0;
    	for(int i=0;i<array.size();i++) {
    		
    		s[i]=array.get(i);
    	
    	}
    	for(int j=0;j<s.length;j++) {
    	
    		t[j]=s[j].split(", ");
    		
    	
    	
    	}
   // 	System.out.println("t len="+t.length);
    	int res=0;
    //	System.out.println(t.length);
    	for(int j=0;j<t.length;j++) {
    	//	System.out.println("testing");
    		//System.out.println("starting="+t[j][0]);
    		
    			//System.out.print(t[j][i]);
    	
    		Integer id=Integer.parseInt(t[j][0]);
    		con=t[j][2];
    		temp=j;
    	//	System.out.println("temp="+temp);
    		for(int i=temp-1;i>=0;i--) {
    			if(con.equals(t[i][2])) {
    				fin++;
    			//	System.out.println("yes");
    				break;
    			}
    		}
    		if(fin>0) {
    			fin=0;
    		//	System.out.println("enetered");
    			break;
    		}
    		while(temp<t.length-1) {
    			//temp=j;
    			temp++;
    	//	System.out.println("j="+j);
    		if(con.equals(t[temp][2])) {
    			
    			if(max<Integer.parseInt(t[temp][0])) {
    				cn++;
    				max=Integer.parseInt(t[temp][0]);
    				pos=temp;
    			}
    		}
    		if(cn>=1) {
    			cn=0;
    	//	System.out.println("output con="+t[pos][2]+"  "+"voting= "+t[pos][3]);
    		}
    		
    		}
    		
    		  System.out.println("output con="+t[pos][2]+"  "+"voting= "+t[pos][3]);
    		  max=0;
    		  pos=0;
    		
    			
    			
    			
    		}
        Map<String,Integer> retVal = new HashMap<String,Integer>();
       return retVal;
    	
    

	//	return null;
    	
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
