import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("1. Decimal para Binário");
        System.out.println("2. Binário para Decimal");
        System.out.println("========================");
        System.out.print("Escolha uma das opções: ");

        int option = in.nextInt();
        in.nextLine();

        switch (option){
            case 1:
                System.out.print("Digite um número inteiro para transformar em binário: ");
                int numD = in.nextInt();

                String binario = CalcBinario.Calculadora(numD);

                System.out.println("O número " + numD + " em binário é: " + binario);

                break;

            case 2:
                System.out.print("Digite um número em binário para transformar em decimal: ");
                String numB = in.nextLine();

                int decimal = CalcDecimal.CalcPdecimal(Integer.parseInt(numB));

                System.out.println("O número " + numB + "em decimal é: " + decimal);

                break;

            default:
                System.out.println("[ERROR]");

                break;
        }
    }
}