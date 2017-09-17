import java.util.HashMap;

public class CountNoOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Krutika Dedhia";
		name = name.toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < name.length(); i++){
			if(map.containsKey(name.charAt(i))){
				map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
			}
			else
				map.put(name.charAt(i), 1);		
	}
		for(char key : map.keySet()){
			if(map.get(key) > 1)
				System.out.println("key: " + key + " value: " + map.get(key));
		}
	}
}
