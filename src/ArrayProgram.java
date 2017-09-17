import java.util.*;

public class ArrayProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
        	System.out.println("Enter value in array");
            arr[arr_i] = scan.nextInt();
        }
        
        for(int i = n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
