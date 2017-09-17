import java.util.HashSet;

public class PrintUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "krutika dedhia";
		char[] a = name.toCharArray();
		
		HashSet<Character> set = new HashSet<>();
		for(int i = 0; i < a.length; i++)
		set.add(a[i]);
		
		for(char c: set){
			System.out.println(c);
		}
	}

}
