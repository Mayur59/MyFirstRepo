 class Big{
	
	 int a=8;
	 public void  start() {
		 System.out.println("super class");
	 }
	 
	 
}


public class X extends Big {

	 public void dowork() {
		super.start();
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
        testMethod(1); 
       X x=new X();
       x.dowork();
    }
     
    public static void testMethod(long number)
    {
        System.out.println("long");
    }
 
	/*
	 * public static void testMethod(int number) { System.out.println("int"); }
	 */
 
    public static void testMethod(Integer number)
    {
        System.out.println("Integer");
    }
     
    public static void testMethod(double number)
    {
        System.out.println("double");
    }
 
        public static void testMethod(Number number)
    {
        System.out.println("Number");
    }
}
