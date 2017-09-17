

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7};
		System.out.print("Original array - method 1 : ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		System.out.print("Reversed array - method 1 : ");
		rotate_method1(a,3);
		System.out.println(" ");
		System.out.print("Reversed array - method 2 : ");
		rotate_method2(a,3);
	}
	public static void rotate_method1(int a[],int k){
		 
		int b[] = new int[a.length];
		
		if(k > a.length)
			k = k % a.length;
		
		for(int i = 0; i<k; i++){
			b[i] = a[a.length - k + i];
		}
		
		int j = 0;
		for(int i = k; i < b.length; i++){
			b[i] = a[j];
			j++;
		}
		
		for(int i = 0; i < b.length; i++){
			System.out.print(b[i] + " ");
		}
	}
	public static void rotate_method2(int a[],int k){
		if(a == null || a.length == 1)
			return;
		
		int mid = a.length - k;
		reverse(a, 0, mid-1);
		reverse(a, mid, a.length - 1);
		reverse(a, 0, a.length - 1);
		
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void reverse(int a[], int left, int right){
		if(a == null || a.length == 1)
			return;
		
		while(left < right){
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;			
		}
	}
 
}
