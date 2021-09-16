public class Letterconvertor {

	public static void main(String[] args) {
			char[] c= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		char[] s= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		String sample="India";
		System.out.println(sample);
			char[] sm=sample.toCharArray();
		for(int i=0;i<sm.length;i++) {
			if(sm[i]=='I'||sm[i]=='i'||sm[i]=='U'||sm[i]=='u'||sm[i]=='O'||sm[i]=='o'||sm[i]=='E'||sm[i]=='e'||sm[i]=='i'||sm[i]=='A'||sm[i]=='a'){
			if(i==0) {
				int t=sm[i];
				//sm[i]=c[t+1];
				sm[i]=(char) ++t;
			}
			else{
				    if(sm.length!=i) {
					int t1=sm[i];
					 //int temp=s[i+1];
					sm[i]=(char)++t1;
					
				}
				else {
					int t3=sm[i];
					sm[i]=(char) ++t3;
				}
			}
			}
		}
		for(int i=0;i<sm.length;i++) {
			System.out.print(sm[i]);
		}
		
	}

}
