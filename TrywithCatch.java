
public class TrywithCatch {
	public static void main(String[] args)
	{
	
	try {
		int a=10;
		int b=0;
		int c;
		c=a/b;
		
		System.out.println(c);
		}
	
	catch(ArithmeticException e)
	{
		System.out.println("zero can be divide" + " " +e);
	}
/*	finally
	{
		System.out.println("you are a champion");
	}*/
	}
	

}
