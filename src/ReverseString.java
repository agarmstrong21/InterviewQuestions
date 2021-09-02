public class ReverseString {
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static void main (String[] args){
        String input = "Hello World!";
        String output = reverse(input);
        System.out.println("Input: " + input + "\nOutput: " + output);
    }
}
