public class Calculator {
    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return addition(a, -b);
    }

    public static int multiply(int a, int b){
        int out = 0;
        for(int i = 0; i < a; i++){
            out = addition(out, b);
        }
        return out;
    }

    public static int division(int a, int b){
        int out = 0;
        while(a > 0){
            a = subtraction(a, b);
            out++;
            if(a < 0){
                out--;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(addition(10, 10));
        System.out.println(subtraction(10, 10));
        System.out.println(multiply(5, 5));
        System.out.println(division(10, 3));
    }
}
