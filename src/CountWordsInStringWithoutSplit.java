
public class CountWordsInStringWithoutSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "This  is Krutika ";
		char c[] = a.toCharArray();
		int count = 0;
		for(int i = 0; i < c.length; i++){
			if(((i > 0) && (c[i] != ' ') && (c[i-1] == ' ')) || ((c[0] != ' ') && (i == 0)))
				count ++;
		}
		System.out.println("Number of words: " + count);
	}

}
