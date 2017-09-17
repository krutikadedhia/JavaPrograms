
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Krutika";
		String reverse = "";
		
		for(int i = a.length() - 1; i >= 0; i--){
			reverse = reverse + a.charAt(i);
		}
		
		System.out.println("Reversed String: " + reverse);
		
	}

}
