
public class Armstrong {

	public static void main(String args[])
	{
		int n = 371;
		int a = n;
		int s;
		int no = 0;
		
		while(a!=0)
			{
				s = a%10;
				a = a/10;
				no = no + s*s*s;  
			}
		if (no == n)
		{
			System.out.println("Number is armstrong number");
		}
		else
			System.out.println("Number is not an armstrong number");
		
	}
}
