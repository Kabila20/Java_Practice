
public class UsingThreads extends Thread {
	
	public void run() 
	{
		System.out.println("hellooo");
	}
static void show()
	{
	 System.out.println ("hell");
	}
	public static void main(String[] args)
	{
		UsingThreads obj = new UsingThreads ();
		obj.start();
		obj.show();
		
	}

}
