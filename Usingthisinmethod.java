
public class Usingthisinmethod {
	
	void display()
	{
	int a=10;
	String name="kabilan";
	System.out.println(a+name);
	}
	void  show()
	{
		int b=20;
		this.display();
		System.out.println(b);
	}
	
	public static void main(String[] args)
	{
		Usingthisinmethod obj = new Usingthisinmethod();
		obj.show();
	}

}
