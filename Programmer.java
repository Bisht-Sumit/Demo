import java.util.Scanner;

public class Program {

	public static void main(String arg[]) 
	{ 
		final Scanner sc = new Scanner(System.in);		
		final int num1 = sc.nextInt();
		final int num2 = sc.nextInt();

		final Calculator calculator = new Calculator();
		final Logger logger = new Logger();
		final Integer add = calculator.add(num1, num2);

		logger.log(add.toString());

	}
}
