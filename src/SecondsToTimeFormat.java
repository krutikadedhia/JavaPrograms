
public class SecondsToTimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 86399;
		
		String hours = Integer.toString(T/3600);
		String minutes = Integer.toString((T%3600)/60);
		String seconds = Integer.toString(T%60);

		String time = hours+"h"+minutes+"m"+seconds+"s";
		System.out.println(time);
	}

}
