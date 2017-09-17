import java.util.HashMap;

public class CountNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,3,1,6,3};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < a.length; i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i]) + 1);
			}
			else
				map.put(a[i], 1);		
	}
		for(int key : map.keySet()){
			if(map.get(key) > 1)
				System.out.println("key: " + key + " value: " + map.get(key));
		}
	}

}
