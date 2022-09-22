package exos;

public class CountSubSequence {
	
	/*
	 * Count the number of subsequences of s2 in s1
	 * @param s1
	 * @param s2
	 * @return long 
	 */
	public static long countSubSequence (String s1, String s2) {
		return count(s1, s2, s1.length()-1, s2.length()-1);
    }
	
    public static long count(String s1, String s2, int i, int j){
        
        if(j < 0){//we have one subsequence
            return 1L;
        }
        
        if(i < 0){//the first string is done and no match 
            return 0L;
        }
        
        //matching
        if(s1.charAt(i)==s2.charAt(j)){
            return count(s1, s2, i-1, j-1) + count(s1, s2, i-1, j);
        } else { //not matching
            return count(s1, s2, i-1, j);
        }
    }
    public static void main (String [] args) {
    	System.out.println(countSubSequence("babgbag", "bag" ) );
    	System.out.println(countSubSequence("ABCABBC", "ABC"));
    	System.out.println(countSubSequence("rabbbit", "rabbit"));
    }
}
