
public class FindPopulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] birthDeathYear = {{1925,2025},  {1951,1952},{1950,1950}, {1925, 2000}};
		
		
		//System.out.println(birthDeathYear.length);
		//System.out.println(birthDeathYear[1][0]);
		int min = birthDeathYear[0][0];
		int max = birthDeathYear[0][1];

		for(int i=0; i<birthDeathYear.length; i++) {
			//for(int year= birthDeathYear[i][0]; year<birthDeathYear[i][1]; year++) {
				if(min>birthDeathYear[i][1]){
					min = birthDeathYear[i][0];					
				}
				if(max<birthDeathYear[i][1]){
					max = birthDeathYear[i][1];					
				}
			
				
				//System.out.print(birthDeathYear[i][j] + "  ");
				
				
			//}
			System.out.println();
		}
		
		int[] years = new int[max-min+1];
		int max_year = 0;
		int index = 0;
		for(int i=0; i<birthDeathYear.length; i++) {
			System.out.println("in");
			int tempBirth = birthDeathYear[i][0]-min;
			years[tempBirth]+=1;
			int tempDeath = birthDeathYear[i][1]-min;
			years[tempDeath]-=1;
			System.out.println("out");
			
		}
		
		for(int i = 1; i < years.length; i++){
			years[i]= years[i]+years[i-1];
		}
		for(int i = 0; i < years.length; i++){
			System.out.println(min+i + " : "+ years[i]);
			if(max_year < years[i])
			{
				max_year = years[i];
				index = i;
			}
			
		}
		
		System.out.println("Max populated year: "+ (min+index));

//		System.out.println("Max " + max);
		
	}

}
