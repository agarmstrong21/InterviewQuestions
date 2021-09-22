import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {

        if(n <= 0 || n >= Math.pow(10,4)){
            return null;
        }


        List<String> l = new ArrayList<>(n);
        for(int i = 1; i <= n; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                l.add("FizzBuzz");
            }else if(i % 3 == 0){
                l.add( "Fizz");
            }else if(i  % 5 == 0){
                l.add("Buzz");
            }else {
                l.add(Integer.toString(i));
            }
        }
        return l;
    }

    public static void main(String[] args) {

        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(1000));


    }
}