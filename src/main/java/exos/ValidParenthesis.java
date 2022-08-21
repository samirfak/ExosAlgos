package exos;

import java.util.ArrayList;

public class ValidParenthesis {
	public static boolean isValid(String s) {
		ArrayList<Character> open =  new ArrayList<Character>();
		ArrayList<Character> close =  new ArrayList<Character>();
		
		open.add('(');
		open.add('{');
		open.add('[');
		
		close.add(')');
		close.add('}');
		close.add(']');
		
		
		//String[] open = {"(", "{", "["};
		//String[] close = {")", "}", "]"};
		ArrayList<Character> openBrackets = new ArrayList<Character>();
		
        if (s.length() % 2 != 0) {
        	return false;
        }
        
        char currentChar;
        for (int i = 0; i < s.length(); i++) {
        	currentChar = s.charAt(i);
        	if(open.indexOf(currentChar) > -1) {//if currentChar is an open bracket
        		openBrackets.add(currentChar);
        	} else { //currentChar is a close bracket
        		int lastIndex = openBrackets.size();
        		//if the last open bracket has the same type of this close bracket
        		if(openBrackets.size() > 0 && open.indexOf(openBrackets.get(lastIndex - 1)) == close.indexOf(currentChar)) {
        			openBrackets.remove(lastIndex-1); //remove the last openbracket because it is closed
        		} else { //the type of the close bracket is not good
        			return false;
        		}
        	}
        }
        
        if (openBrackets.size() != 0) {//all open brackets are closed
        	return false;
        }
        
        return true;
    }
}
