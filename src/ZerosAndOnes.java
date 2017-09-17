
public class ZerosAndOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,1,1,1,0,0,1,0};
		method1(a);
		System.out.println("");
		method2(a);
	}
		public static void method1(int a[]){
			int count_zero = 0;
			for(int i = 0 ; i < a.length ; i++)
			{
				if(a[i] == 0)
				{
					count_zero++;
				}
			}
			for(int i = 0; i < count_zero; i++)
			{
				a[i] = 0;
			}
			for(int i = count_zero; i < a.length; i++)
			{
				a[i] = 1;
			}
			for(int i = 0; i < a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
		}
		
		public static void method2(int a[]){
			int left = 0;
			int right = a.length - 1;
			while(left < right)
			{
				while(left < right && a[left] == 0)
				{
					left++;
				}
				while(left < right && a[right] == 1)
				{
					right--;
				}
				if(left<right){
					a[left] = 0;
					a[right] = 1;
					left++;
					right--;
				}
			}
			for(int i = 0; i < a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
		}
}
