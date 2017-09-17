import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial");
		int num = in.nextInt();
		
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		
		System.out.println("The factorial of " + num + " is " + fact);
		
		int result = fact(num);
		System.out.println("The factorial of " + num + " using recursion is " + result);

	}
	
	public static int fact(int num){
		if(num == 0 || num == 1)
		return 1;
		else 
		{
			return num * fact(num - 1);
		}
	}

}
