public class IntegerToRoman {
    public static String intToRoman(int num){
        if(num < 1 || num > 4000){
            return "";
        }

        String str = "";
        str = recursiveIntToRoman(str, num);
        return str;
    }

    public static String recursiveIntToRoman(String str, int num){
        if(num == 0){
            return str;
        }

        if(num >= 1000){
            str = str.concat("M");
            num -= 1000;
        }else if(num >= 900){
            str = str.concat("CM");
            num -= 900;
        }else if(num >= 500){
            str = str.concat("D");
            num -= 500;
        }else if(num >= 400){
            str = str.concat("CD");
            num -= 400;
        }else if(num >= 100){
            str = str.concat("C");
            num -= 100;
        }else if(num >= 90){
            str = str.concat("XC");
            num -= 90;
        }else if(num >= 50){
            str = str.concat("L");
            num -= 50;
        }else if(num >= 40){
            str = str.concat("XL");
            num -= 40;
        }else if(num >= 10){
            str = str.concat("X");
            num -= 10;
        }else if(num >= 9){
            str = str.concat("IX");
            num -= 9;
        }else if(num >= 5){
            str = str.concat("V");
            num -= 5;
        }else if(num >= 4){
            str = str.concat("IV");
            num -= 4;
        }else if(num >= 1){
            str = str.concat("I");
            num -= 1;
        }
        return recursiveIntToRoman(str, num);
    }

    public static void main(String[] args){
        int[] input = {3, 4, 9, 58, 1994};
        String[] output = new String[input.length];

        for (int i = 0; i < input.length; i++){
            output[i] = intToRoman(input[i]);
            System.out.println("Input: " + input[i] + "\nOutput: " + output[i]);
        }
    }
}
