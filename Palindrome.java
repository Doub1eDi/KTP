public class Palindrome{
    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            String s = args[i];
            if (isPalindrome(s) == true) System.out.println(s + " - Palindrome  ");
            else  System.out.println(s + " - Not a palindrome  ");
        }
    }

    public static String reverseString(String reverse){
        String f = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            f += (reverse.charAt(i));
        }
        return f;
    }

    public static boolean isPalindrome(String s){
        String f = reverseString(s);
        return s.equals(f);
    }

}