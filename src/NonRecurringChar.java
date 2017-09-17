
public class NonRecurringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "www.nytimes.com";
		char ch[] = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++){
			if(ch[i] == ch[i+1]){
				i++;
			}
			else
			{
				System.out.println("First non-repeating char : " + ch[i+1]);
				break;
			}
		}
	}

}
