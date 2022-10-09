 class BothThisandSuper {
	int age;
	String name;
	
	BothThisandSuper(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
 }
	
	class demo extends BothThisandSuper
	{
		float sal;
		demo(int age, String name, float sal)
		{
			super(age,name);
			this.sal = sal;
		}
		void display()
		{
			System.out.println(age+name+sal);
		}
		public static void main(String[] args)
		{
			demo obj = new demo(1,"kab",14.5f);
			obj.display();
		}
	}
	
	
	
	

