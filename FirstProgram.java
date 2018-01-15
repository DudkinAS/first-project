import java.util.Scanner;

public class FirstProgram

{
	public static void main(String[] args)
	{
		// print strings
		System.out.println("Hello out there.");
		System.out.println("I will add two numbers for you.");
		System.out.println("Enter two whole numbers on a line.");

		// define variables
		int n1, n2;

		// get input data
		Scanner keyboard = new Scanner(System.in);

		// assign two variables
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();

		// output result
		System.out.println("The sum of those two numbers is");
		System.out.println(n1 + n2);

	}
}