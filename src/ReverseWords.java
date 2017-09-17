
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the sky is blue" ;
		char c[] = s.toCharArray();
		System.out.println("Original String : " + s);
		reverse(c);
		System.out.print("Reversed String : ");
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i]);
	}
	
	public static void reverse(char c[]){
		int i = 0;
		for (int j = 0; j < c.length; j++)
		{
			if(c[j] == ' ')
			{
				reverseWords(c, i , j-1);
				i = j+1;
			}
		}
		reverseWords(c, i, c.length - 1);
		reverseWords(c, 0, c.length - 1);
	}
	
	public static void reverseWords(char c[], int i, int j){
		while (i < j){
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
	}

}
