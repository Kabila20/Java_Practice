
 public class HierarchicaInheritanceExample {
	
	void display() {
		System.out.println("This is my  game");
	}
}
 class Firstclass extends HierarchicaInheritanceExample
{
	void show()
	{
		System.out.println("never give up!");
	}
}
 class Secondclass extends HierarchicaInheritanceExample
 {
	 void call()
	 {
		 System.out.println("mylevel!");
	 }
 
	public static void main(String[] args)
	{
		Firstclass obj = new Firstclass();
		obj.show();
		obj.display();
	}


}
