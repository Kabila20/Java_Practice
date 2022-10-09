
public class Usingthisinconstructor {
	int bot;
	String animal;
	
	Usingthisinconstructor()
	{
		int a=10;
		String name="kabila";
		System.out.println(a+name);
	}
	Usingthisinconstructor(int b, String a)
	{
		this();
		bot=b;
		animal=a;
		
		System.out.println(b+a);
	}
	public static void main(String[] args)
	{
		Usingthisinconstructor obj = new Usingthisinconstructor(10,"empire");
	}

}
