
public class MutlilevelInheritance {
	
	void show()
	{
		System.out.println("hey champ!");
	}
}
	
	 class FirstInheritance extends MutlilevelInheritance
	{
		void display()
		{
			System.out.println("you are unstopable!");
		}
	}
	 class FinalInheritance extends FirstInheritance
	{
		void main()
		{
			System.out.println("You are history!!");
		}
		public static void main(String[] args)
		{
			FinalInheritance obj = new FinalInheritance();
			obj.main();
			obj.show();
			obj.display();
		}
	}

	

