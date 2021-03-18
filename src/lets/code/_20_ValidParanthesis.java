package lets.code;

import java.util.HashMap;
import java.util.Stack;

public class _20_ValidParanthesis {

	public boolean isValid(String s) {
	    
        HashMap<Character, Character> map = new HashMap<>();
        map.put( '(', ')' );
        map.put( '[', ']' );
        map.put( '{', '}' );
        
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        
        for (int i=0; i<len; i++) {
            if ( map.containsKey(s.charAt(i)) ) {
                stack.push(s.charAt(i));
            } else {
                if ( map.get(stack.pop()) != s.charAt(i) ) {
                    return false;
                }
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		_20_ValidParanthesis t = new _20_ValidParanthesis();
		
		System.out.println(t.isValid("()"));
		
		System.out.println(t.isValid("()[]{}"));
		
		System.out.println(t.isValid("(]"));
		
		System.out.println(t.isValid("([)]"));
		
		System.out.println(t.isValid("{[]}"));
	}
}