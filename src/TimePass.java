import java.util.Scanner;

public class TimePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=7;i++) {
			if(i%2==0) {
			continue;
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=5;i>=1;i--) {
			if(i%2==0) {
			continue;
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
