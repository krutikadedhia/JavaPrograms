
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		System.out.println("Original matrix :");
		//print original matrix
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	
		//transpose the matrix		
		for(int i = 0; i < 3; i++){
			for(int j = i+1; j<3; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		System.out.println("Transposed matrix :");
		//print transposed matrix
		for(int i = 0; i < 3; i++){
			for(int j = 0; j<3; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
