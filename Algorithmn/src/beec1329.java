//https://www.beecrowd.com.br/judge/pt/problems/view/1329
import java.util.Scanner;
import java.lang.String;

public class beec1329 {
static Scanner input = new Scanner(System.in);
static String receive01 = new String();

    public static void main(String[] args) {
        boolean returnTF = true;
        System.out.println("Digite quantos números que digitar");
        int verifyNumber = input.nextInt();
        //input.nextLine();
        System.out.println("Digite 0s e 1s:");
        while ( returnTF) {
            receive01 = input.nextLine();

            if(!receive01.isEmpty()) {
                if(receive01.equals("1") || receive01.equals("0")){
                    System.out.printf("Digite somente 0s e 1s\n");
                }
                if (receive01.length() == verifyNumber) {
                    System.out.println("Chegou ao valor. Aperte Enter mais uma vez\n");
                    returnTF = false;
                    //deu true
                }if (receive01.length() > verifyNumber) {
                    System.out.printf("Digitou mais que que foi determinado: %d \n", verifyNumber);
                    //deu mais que devia
                }if (receive01.length() < verifyNumber) {
                    System.out.printf("Digite a quantidade exata: %d\n", verifyNumber);
                }
                input.hasNextLine(); //não entendi sobre isso
            }
        }

        if(receive01.isEmpty()){
            System.out.printf("Tá vazio");
        }
        //System.out.println(receive01);
        int joao = 0;
        int maria = 0;
        for(int loop = 0; loop < receive01.length(); loop++){
            if(receive01.charAt(loop) == '1'){
                joao +=1;
            }if (receive01.charAt(loop) == '0'){
                maria+=1;
            }
        }

        System.out.printf("o resultado ficou:\n Joao(cara): %d\n Maria(coroa): %d", joao, maria);
        input.close();
    }

}
