import java.util.Stack;

public class ParentesisMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{}[()}";
		boolean match = isMatch(str);
		if(match == true)
			System.out.println("Parenthesis match");
		else
			System.out.println("Parenthesis do not match");
	}
		
	public static boolean isMatch(String str){
		if(str.isEmpty())
			return true;
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(c == '{' || c == '(' || c == '[')
				stack.push(c);
			else if (c == '}' || c == ')' || c ==']')
				if(!stack.isEmpty() && 
						(c == '}' && stack.peek() == '{')
						|| (c == ')' && stack.peek() == '(')
						|| (c == '[' && stack.peek() == ']'))
					stack.pop();
			else 
					return false;
		}
		return stack.empty();
	}
}
