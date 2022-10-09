
public class MethodOverloading {
/*int a=10;
	void myShow()
	{
		 
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		MethodOverloading obj = new MethodOverloading();
		
		obj.a=(25);
		obj.myShow();
		//System.out.println();
	}
	
}*/
	
	/*static int show(int a, int b)
	{
		return a+b;
	}
	static double show(double a, double b)
	{
		return a+b;
	}
	public static void  main(String[] args)
	{
		System.out.println(MethodOverloading.show(11,11));
		System.out.println(MethodOverloading.show(14.1f,15.2f));
	}
		
	//MethodOverloading obj = new MethodOverloading();
	
}*/
	 void show(int a, long b)
	 {
		 System.out.println(a+b);
	 }
	 void show(int a, int b, int c)
	 {
		 System.out.println(a+b+c);
	 }
	 public static void main(String[] args)
	 {
		 MethodOverloading obj = new MethodOverloading();
		 obj.show(20, 25);
		 obj.show(20, 150, 250);
	 }
}
	
	
	
	
	
