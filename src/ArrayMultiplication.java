
public class ArrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int product = 1;
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
			product = product * a[i];
		}
		
		System.out.println("");
		
		for(int i = 0; i < a.length; i++){
			a[i] = product/a[i];
			System.out.print(a[i] + " ");
		}
	}

}
