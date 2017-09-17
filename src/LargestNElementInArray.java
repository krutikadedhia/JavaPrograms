import java.util.Arrays;

public class LargestNElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,6,4,7,5};
		Arrays.sort(arr);
		int n = 8;
		System.out.printf("Modified arr[] : %s",Arrays.toString(arr));
		System.out.println(" ");
		if(n > arr.length)
			System.out.println("Nth number is greater than array length");
		else
			System.out.println(n + " largest element is: " + (arr[arr.length-n]));
	}

}
