import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int somar = 0;
        Scanner lerNumero = new Scanner(System.in);

        Scanner lerString = new Scanner(System.in);

        String resposta;
        do {
            System.out.println("Digite um número: ");
            int receberNumero = lerNumero.nextInt();
            //Cada scanner estar voltado para o tipo, se não há conflito e de informações entre string e int

            somar = somar + receberNumero;

            System.out.println("Quer continuar? S/N ");

            resposta = lerString.nextLine();

        } while (resposta.equals("s"));
        System.out.println("A soma é " + somar);
    }
}