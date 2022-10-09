
public class NumberFormatExcept { 
	public static void main(String[] args)
	{
		try {
	String n="kabilan";
	int b = Integer.parseInt(n);
	}
		catch(NumberFormatException e) {
			System.out.println("only no format" + e);
		}
	}
	

}
