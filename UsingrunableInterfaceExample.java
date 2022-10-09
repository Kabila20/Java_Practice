
public class UsingrunableInterfaceExample implements Runnable{
	public void run()
	{
		System.out.println("jiii");
	}
	
	public static void main(String[] args)
	{
		UsingrunableInterfaceExample obj = new UsingrunableInterfaceExample();
		Thread th = new Thread(obj);
			th.start();
	}
	
}

