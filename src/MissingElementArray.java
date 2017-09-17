
public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,1,6};
		int n = 6;
		int sum = 0;
		int arr_sum = 0;
		for(int i = 1; i <= n; i++){
			sum = sum + i;
		}
		for(int i = 0; i <= arr.length - 1; i++){
			arr_sum = arr_sum + arr[i];
		}
		System.out.println("Missing element: "+(sum - arr_sum));
	}

}
