public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        if(x < 0 || x > ((int)Math.pow(2,31) - 1)){
            return false;
        }
        return x == Integer.parseInt((new StringBuilder(Integer.toString(x)).reverse()).toString());
    }

    public static void main(String[] args){
        int input = -101;
        boolean output = isPalindrome(input);
        System.out.println("Input: " + input + "\nIs Palindrome? " + output);
    }
}
