class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("Hello!"));
    }
    
    public static String reverse(String s) {
        if(s.length() == 0) return "";
        return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }
}