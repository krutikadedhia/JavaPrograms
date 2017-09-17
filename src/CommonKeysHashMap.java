import java.util.HashMap;

public class CommonKeysHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map1.put(1, "Krutika");
		map1.put(2, "Kinjal");
		map1.put(3, "Ankur");
		
		map2.put(1, "Dedhia");
		map2.put(2, "Gada");

		for(int i : map1.keySet()){
			if(map2.containsKey(i))
				System.out.print(i+" ");
		}
	}

}
