class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("uwu uwu", 0));
        System.out.println(isPalindrome("uuwu uwu", 0));
    }
    
    public static boolean isPalindrome(String s, int i) {
        int a = i+1;
        if(s.charAt(i) == s.charAt(s.length() -1 -i) && a < s.length()) {
            return isPalindrome(s, a);
        } else if(a < s.length()) {
            return false;
        } else {
            return true;
        }
    }
}