package exos;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		String output = strs[0];
		for (int i = 1; i < strs.length && !output.equals(""); i++) {
			int l = Math.min(output.length(), strs[i].length());
			int j;
			
			for (j = 0; j < l && output.charAt(j) == strs[i].charAt(j); j++) ;
				
			output = output.substring(0, j);			
		}
			
		
        return output;
    }
}
