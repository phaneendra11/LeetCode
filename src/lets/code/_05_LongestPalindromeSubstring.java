package lets.code;

public class _05_LongestPalindromeSubstring {

	public String longestPalindrome(String s) {
        
        int len = s.length();
        if(len == 0) {
            return "";
        } else if (len == 1) {
            return s;
        }
        
        int maxPalindromeLength = 0;
        String maxPalindromeString = "";
        int j = 0;
        for(int i=0; i<len; i++) {    
            j = 0;
            while( i-j >=0 && i+j < len) {
                if(s.charAt(i-j) != s.charAt(i+j)) {
                    break;
                }
                j++;
            }
            if(2*j+1 > maxPalindromeLength) {
                maxPalindromeLength = 2*j+1;
                maxPalindromeString = s.substring(i-j+1, i+j);
            }
        }
        
        for(int i=0; i<len-1; i++) {
            j = 0;
            while( i-j >=0 && i+1+j < len) {
                if(s.charAt(i-j) != s.charAt(i+1+j)) {
                    break;
                }
                j++;
            }
            if(2*j+2 > maxPalindromeLength) {
                maxPalindromeLength = 2*j+2;
                maxPalindromeString = s.substring(i-j+1, i+j+1);
            }
        }
        
        return maxPalindromeString;
    }

	public static void main(String[] args) {
		_05_LongestPalindromeSubstring t = new _05_LongestPalindromeSubstring();
		
		System.out.println(t.longestPalindrome("babad"));
		
		System.out.println(t.longestPalindrome("cbbd"));
		
		System.out.println(t.longestPalindrome("a"));
		
		System.out.println(t.longestPalindrome("ac"));
		
		System.out.println(t.longestPalindrome("bb"));
	}
}
