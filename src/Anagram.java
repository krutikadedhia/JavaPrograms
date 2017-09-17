import java.util.HashMap;

public class Anagram {
   
	public  static void main(String args[])
	{
		String a = "south";
		String b = "shout";
	
		Boolean result = usingFunction1(a,b);
		if(result == true)
			System.out.println("two strings are anagram");
		else
				System.out.println("two strings are not anagram");
		//usingFunctions1();


	}
	
	public static boolean usingFunction1(String a, String b)
	{ 
		char p[] = a.toLowerCase().toCharArray();
		char q[] = b.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> map= new HashMap<>();
		
		for(char c:p){
			int count = 1;
			if(map.containsKey(c)){
				count = map.get(c) + 1;
				map.put(c,count);
			}
			else
				map.put(c, count);
		}	
	
	for(char c:q){
		int count = -1;
		if(map.containsKey(c)){
			count = map.get(c) - 1;
			map.put(c,count);
		}
		else
			map.put(c, count);
	}	
	for(char c:map.keySet()){
		if(map.get(c)!=0)
			return false;
	}
	return true;
}
	
	/*public  static void usingFunctions1( )
	{
//		char p[] = a.toCharArray();
//		char q[] = b.toCharArray();
		// a="gidh44";'
		System.out.println(a);

	}*/
	
}
