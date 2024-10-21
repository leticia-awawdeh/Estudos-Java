public class CalcBinario {
    public static String Calculadora(int numD){
            if(numD == 0){
                return "0";
            }

            StringBuilder binario = new StringBuilder();
            while(numD > 0){
                binario.append(numD % 2);
                numD = numD / 2;
            }

            return binario.toString();
    }
}
