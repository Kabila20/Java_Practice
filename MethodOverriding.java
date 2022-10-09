class MethodOverriding {
	
	void show()
	{
		//int a =10;
		System.out.println("10");
	}
}
	class Sample extends MethodOverriding
	{
		void show()
		{
			//int a=25;
			System.out.println("25");
		}
		public static void main(String[] args)
		{
			Sample obj = new Sample();
			obj.show();
		}
	}
	
	
	
	

