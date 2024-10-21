public class CalcDecimal {
    public static int CalcPdecimal(int numB){
        int decimal = 0;
        String str = String.valueOf(numB);
        int length = str.length();

        for (int i = 0; i < length; i++ ){
            if(str.charAt(length -1 - i) == '1'){
                decimal += (int) Math.pow(2, i);
            }
        }

        return decimal;
    }
}
