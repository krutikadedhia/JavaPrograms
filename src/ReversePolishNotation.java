import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"6", "2", "/", "1" , "+"};
		int result = calculatek(a);
		System.out.println("The calculated value is " + result);
	}
	
	public static int calculatek(String a[]){
		
		String operators = "+-*/" ;
		Stack<String> s = new Stack<String>();
		
		for(String tokens: a){
			if(!operators.contains(tokens)){
				s.push(tokens);
			}
			else
			{
				int num1 = Integer.valueOf(s.pop());
				int num2 = Integer.valueOf(s.pop());	
				
				switch(tokens){
				case "+" :
					s.push(String.valueOf(num1 + num2));
					break;
				case "-" :
					s.push(String.valueOf(num1 - num2));
					break;
				case "*" :
					s.push(String.valueOf(num1 * num2));
					break;
				case "/" :
					s.push(String.valueOf(num2 / num1));
					break;
				}
			}	
		}
		return (Integer.valueOf(s.pop()));
	}

}
