
/*public class ParametrizedConstructor {
	int age;
	String name;
	float salary;
	
	ParametrizedConstructor(int a, String n)
	{
		age=a;
		name=n;
	}
	ParametrizedConstructor(int a, String n, float s)
	{
		age = a;
		name = n;
		salary =s;
	}
	void show()
	{
		
		System.out.println(age+name+salary);
	}
	
	public static void main(String[] args)
	{
		ParametrizedConstructor obj = new ParametrizedConstructor(22,"kabilan");

		ParametrizedConstructor obj1 = new ParametrizedConstructor(23,"kabila", 14.054f);
		
		obj.show();
		obj1.show();
	}

	
	

}*/


class ParametrizedConstructor{
    int id;
    String name;
    float salary;
    
    ParametrizedConstructor(int i,String n){
    id = i;
    name = n;
    }
    ParametrizedConstructor(int i, String n, float s)
    {
    	id =i;
    	name=n;
    	salary=s;
    			
    }
    void display(){System.out.println(id+" "+name +salary);}
 
    public static void main(String args[]){
    	ParametrizedConstructor s1 = new ParametrizedConstructor(111,"Karan");
    	ParametrizedConstructor s2 = new ParametrizedConstructor(222,"Aryan",14.05f);
    s1.display();
    s2.display();
   }
}

