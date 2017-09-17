
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,7,3,9,2,5,4};
		
		System.out.println("Original array: ");
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		quickSort(a, 0, a.length-1);

		System.out.println(" ");
		System.out.println("Sorted array: ");
		for(int i = 0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void quickSort(int a[], int low, int high){
		if(a == null || a.length == 0)
			return;
		
		if(low >= high)
			return;
		
		int pivot = a[low+(high - low)/2];
		int i = low;
		int j = high;
		
		while(i <= j){
		
			while(a[i] < pivot){
				i++;
			}
			while(a[j] > pivot){
				j--;
			}
			if(i <= j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
			if(low < j)
				quickSort(a, low, j);
			if(i < high)
				quickSort(a, i, high);
		}
	}
}
