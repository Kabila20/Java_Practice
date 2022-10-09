
public class NullPointerExcept {
	public static void main(String[] args)
	{
		try
		{
			String n=null;
			System.out.println(n.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("should not be null" + e);
		}
	}
	
	

}
