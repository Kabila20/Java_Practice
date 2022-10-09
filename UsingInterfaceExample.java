interface Games
{
	static final int a=10;
	abstract void show();
}

interface Football
{
	abstract void show();
	}
class UsingInterfaceExample implements Games, Football {
	
	public void show()
	{
		System.out.println("helllo");
	}
	public static void main(String[] args)
	{
		UsingInterfaceExample obj = new UsingInterfaceExample();
		obj.show();
	}

	
}
