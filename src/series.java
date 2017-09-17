import java.util.Scanner;

public class series {

	public static void main(String args[])
	{		
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a number");
		int n = sc.nextInt();

		System.out.println("Enter the number for series of");
		int num = sc.nextInt();
		
		int i = 0;
		int res = num;
		while( i < n)
		{
			System.out.print(res+" ");
			res = res * num;
			i++;
		}
		sc.close();
	}
}
