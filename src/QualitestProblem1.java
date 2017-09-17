import java.util.HashMap;
import java.util.Map;

public class QualitestProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 10;
		int array1[] = {1,3,4};
		int array2[] = {10,20};
		System.out.println("Function one :" + FunctionOne(a,b));
		System.out.println("Function two :" + FunctionTwo(array1,array2));
	}
		public static int FunctionOne(int a, int b) {
		    for(int x = a; x >= 1; x--) {
		        if (a % x == 0 && b % x == 0) {
		            return x;
		        }
		    }
		    return 1;
	}
		public static Map<Integer, Integer> FunctionTwo(int array1[], int array2[]) {
		   Map<Integer, Integer> m = new HashMap<>();
		   for(int i = 0; i < array1.length; i++){
			   if(array1.length <= array2.length)
			   m.put(array1[i],array2[i]);
		    }
		    return m;
	}

}
