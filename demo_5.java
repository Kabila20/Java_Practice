abstract class Dample
{
	Dample()
	{
		System.out.println("hwll");
	}
	
	abstract void show();
	
	void main()
	{
	System.out.println("reeel");	
	}
	
}

class demo_5 extends Dample
{
static void  display()
	{
		System.out.println("alright");
	}
void show()
{
	System.out.println("heyy chetta");
}
	public static void main(String[] args)
	{
		demo_5 obj = new demo_5();
		display();
		obj.main();
	}
}