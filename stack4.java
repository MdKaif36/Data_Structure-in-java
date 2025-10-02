
// balanced parenthesis true or not
import java.util.Stack;
class stack4 {
 public static void main (String[] args) {
		
		String s="()[{}()]";
		boolean value=parenthesis(s);
		System.out.println(value);

		
	}

	static boolean parenthesis(String str){
		Stack<Character> s=new Stack<>();
		int size=str.length();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='('||ch=='{'||ch=='['){               //   ()[{}()]
				s.push(ch);
			}
			else if(s.isEmpty()){
				return false;
			}
			else{
				char it=s.pop();
				if(it=='('&&ch==')'||it=='{'&&ch=='}'||it=='['&&ch==']'){
					continue;
				}
				else
					return false;

			}
		}
		return true;
	}
}
