
public class ReplaceCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello how are you";
		char c[] = s.toLowerCase().toCharArray();
		
		for(int i = 0; i < c.length; i++){
			if(c[i] == ' ')
				c[i] = '#';
		}
		System.out.println(String.valueOf(c));

	}

}
