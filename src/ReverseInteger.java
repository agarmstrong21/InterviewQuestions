public class ReverseInteger {
    public static int reverse(int x){
        if(x > ((int)Math.pow(2,31) - 1) || -x > ((int)Math.pow(2,31) - 1)){
            return 0;
        }
        int output;
        if(x < 0){
            x *= -1;
            output = -1 * Integer.parseInt((new StringBuilder(Integer.toString(x)).reverse()).toString());
        }else{
            output = Integer.parseInt((new StringBuilder(Integer.toString(x)).reverse()).toString());
        }
        return output;
    }

    public static void main(String[] args){
        int input = 1534236469;
        int output = reverse(input);
        System.out.println("Input: " + input + "\nOutput: " + output);
    }
}
