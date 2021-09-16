import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArryTest {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		boolean r=false;
		int sum = 0;
		int c = 0;
		int t = 0;
		int tp=0;
		int max=0;
		int g=0;
		int uni=0;
		int fin=0;
		List<List<Integer>> arr = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowTempItems[j]);
				arrRowItems.add(arrItem);
			}

			arr.add(arrRowItems);
		}

		bufferedReader.close();

//		for (int i = 0; i < arr.size(); i++) {

			for (int j = 0; j < arr.size(); j++) {
			
				if(j>=4) {
					break;
				}
				System.out.println("tp="+tp);
				g=0;
		//		uni++;
				for (int k = g; k < g+6; k++) {
					
					int z=1;
					tp=j;
					fin=tp;
					if(tp==6) {
						break;
					}
					while(z<4) {
						uni++;
						System.out.println("checking for tp="+tp +"and z="+z);
						if(tp==6) {
							break;
						}
						ArrayList it = (ArrayList) arr.get(tp);
					for (int x = k; x < k+3; x++) {
						System.out.println("universal X="+ x +"and tp="+tp) ;
						if(k+2>=6) {
							r=true;
							System.out.println("if x="+x);
							break;
						}
												int temp = (int) it.get(x);
						if (tp == fin + 1 && (x == k || x == k + 2)) {
							System.out.println("brahmand if checking tp=" + tp);
							continue;
						}
												System.out.println("temp="+temp);
							sum = sum + temp;
							 System.out.println("sum=" + sum);
						
					}
					z++;
					++tp;
					if(r==true) {
						break;
					}
					}
					if(r==true) {
						r=false;
						break;
						
					}
					if(sum<=0) {
						
						if(max==0) {
							max=sum;
						}
						if(max>sum) {
							System.out.println(" minus sum=" + sum +" max="+max);
							max=max;
							uni++;
							sum=0;
						}
						else {
							System.out.println(" else wala minus sum=" + sum+ " max="+max);
							
							max=sum;
							sum=0;
						}
						
					}
					else {
					if(max<sum) {
						System.out.println(" if sum=" + sum);
						max=sum;
						uni++;
						sum=0;
					}
					else {
						System.out.println(" else sum=" + sum);
						
						max=max;
						sum=0;
					}
					}
					
					//	uni++;
				}
				
				
				c = 0;
			}
	//	}
		System.out.println("max sum="+max);
		System.out.println("uni="+uni);
	}

}
