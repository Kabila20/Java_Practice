//refer the instance variable
/* class UsingSuperKeyword {
	 String c="White";
 }
  class sample10 extends UsingSuperKeyword
  {
	String c ="Black";
	void color()
	{
		System.out.println(c);
		System.out.println(super.c);
	}
	 public static void main (String[] args)
	 {
		 sample10 obj = new sample10();
		 obj.color();
	 }
  }*/

//refer the method of parent class

 class UsingSuperKeyword1
{
	void myshow()
	{
		String n="White";
	}
}

class UsingSuperKeyword extends UsingSuperKeyword1
{
	void mysho()
	{
		String n="Black";
		System.out.println(n);	
	}
	void mydisplay()
	{
		super.myshow();
	}
	public static void main(String[] args)
	{
	UsingSuperKeyword obj = new UsingSuperKeyword();
		obj.mydisplay();
		obj.mysho();
	}
}
  

	 
	
	
	
	


