public class ValidParentheses {
    public static boolean isValid(String str){

        return false;
    }

    public static void main (String[] args){
        String[] input = {"()", "()[]{}", "(]", "([)]", "{[]}"};
        for(int i = 0; i < input.length; i++){
            System.out.println("Input: " + input[i] + ", Output: " + isValid(input[i]));
        }

    }
}
