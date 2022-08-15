package exos;

public class Palindrome {
	public static boolean isPalindrome(int x) {
        int x1 = x;
        int rev = 0;
        while (x1 != 0) {
        	rev *= 10;
        	rev += x1 % 10;
        	x1 /= 10;
        }
        return x == rev;
    }
}
