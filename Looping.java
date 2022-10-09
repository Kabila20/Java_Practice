//1.while loop---entry condition loop, if condition statisfy only the loop  will get execute.
//2.do while loop---exit  condition loop, execute aleast once execute.
//3.for loop
public class Looping {
public static void main(String[] args)
{
	int rows =5;

	for (int i=0; i<=rows; i++)
	{
		for (int j=0; j<=i; j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
}
}
