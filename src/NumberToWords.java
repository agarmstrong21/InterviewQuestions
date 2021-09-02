public class NumberToWords {
    public static String numberToWords(int num){
        if(num <= 0){
            return "Zero";
        }
        return recursivePlace("", num);
    }

    public static String recursivePlace(String str, int num){
        if(num == 0){
            return str;
        }

        if(num >= 1000000000){

        }


        return recursivePlace(str, num);
    }

    public static String recursiveNumber(int num){

        return "";
    }

    public static void main(String[] args){

    }
}
