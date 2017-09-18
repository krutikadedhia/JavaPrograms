
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -123;
		int n = num;
		
		boolean isNegative = false;
		int reverse = 0;
		int lastDigit = 0;
		
		if(n < 0)
		{
			isNegative = true;
			n = n * -1;
		}
			
		while (n >= 1){
			lastDigit = n % 10;
			reverse = reverse * 10 + lastDigit;
			n = n / 10;
		}
		
		if(isNegative == true)
			reverse = reverse * -1;
	System.out.println("reverse of number "+num + " is "+reverse);
	}
}
