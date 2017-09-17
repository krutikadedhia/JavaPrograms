import java.util.ArrayList;
import java.util.HashMap;

public class CountMaxNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,3,1,6,3,1};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0; 
		int num = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < a.length; i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i]) + 1);
			}
			else
				map.put(a[i], 1);		
	}
		for(int key : map.keySet()){
			if(map.get(key) > max){
				num = key;
				max = map.get(key);
				list.add(key);
			}		
		}
/*		for(int i = 0; i < list.size(); i++){
			if(m){
				num = key;
				max = map.get(key);
				list.add(key);
			}		
		}*/
		System.out.println("key: " + num + " value: " + max);
	}
}

