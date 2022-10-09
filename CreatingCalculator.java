import java.util.Scanner;
public class CreatingCalculator {
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two no:");
		double db1 = obj.nextDouble();
		double db2 = obj.nextDouble();
		System.out.println("Enter the operator +, *, -, / :");
		char operator = obj.next().charAt(0);
		double result ;
		
		switch(operator)
		{
		case '+':
			result = db1+db2;
			break;
			
		case '-':
			result = db1-db2;
			break;
		case '*':
			result = db1*db2;
			break;
		case '/':
			result = db1/db2;
			break;
			default:
				System.out.println("error!");
				return;
				//System.out.print(db2);
		}
	}

}
