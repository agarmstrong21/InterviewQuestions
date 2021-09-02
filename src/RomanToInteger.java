public class RomanToInteger {
    public static int romanToInt(String str){
        if((str.length() < 1 || str.length() > 15) &&
                (str.contains("I") && str.contains("V") && str.contains("X") &&
                        str.contains("L") && str.contains("C") && str.contains("D") && str.contains("M"))){
            return 0;
        }
        str = str.toUpperCase();
        int output = 0;
        output = recursiveRomanToInt(str, output);
        return output;
    }

    public static int recursiveRomanToInt(String str, int output){
        if(str.length() == 0){
            return output;
        }
        if(str.startsWith("CM")){
            output += 900;
            str = str.replaceFirst("CM", "");
        }else if(str.startsWith("M")){
            output += 1000;
            str = str.replaceFirst("M","");
        }else if (str.startsWith("CD")){
            output+= 400;
            str = str.replaceFirst("CD","");
        }else if (str.startsWith("D")){
            output+= 500;
            str = str.replaceFirst("D","");
        }else if (str.startsWith("XC")){
            output+= 90;
            str = str.replaceFirst("XC","");
        }else if (str.startsWith("C")){
            output+= 100;
            str = str.replaceFirst("C","");
        }else if (str.startsWith("XL")){
            output+= 40;
            str = str.replaceFirst("XL","");
        }else if (str.startsWith("L")){
            output+= 50;
            str = str.replaceFirst("L","");
        }else if (str.startsWith("IX")){
            output+= 9;
            str = str.replaceFirst("IX","");
        }else if (str.startsWith("X")){
            output+= 10;
            str = str.replaceFirst("X","");
        }else if (str.startsWith("IV")){
            output+= 4;
            str = str.replaceFirst("IV","");
        }else if (str.startsWith("V")){
            output+= 5;
            str = str.replaceFirst("V","");
        }else if (str.startsWith("I")){
            output+= 1;
            str = str.replaceFirst("I","");
        }
        return recursiveRomanToInt(str, output);
    }

    public static void main(String[] args){
        String[] input = {"III","IV","IX","LVIII","MCMXCIV"};
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++){
            output[i] = romanToInt(input[i]);
            System.out.println("Input: " + input[i] + "\nOutput: " + output[i]);
        }

    }
}
