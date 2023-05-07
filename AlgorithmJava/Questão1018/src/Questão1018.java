import java.util.Scanner;

public class Questão1018 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Digite o valor:");
        float valueOfMoney = inputValue.nextInt();
        float[] arrayOfThevalues = new float[7];
        float valueCalculateFloat = (valueOfMoney / 100);

        int valueInteger = (int) Math.floor(valueCalculateFloat);//numero inteiro
        float receivePlacesFloat = (valueCalculateFloat - valueInteger);//numero decimal

        arrayOfThevalues[0] = valueInteger;//vai ser o primeiro valor a ser mostrado

        int resutlCaculateConvertInt = (int) (receivePlacesFloat * 100);
        int restOfCalculate = 0;

        if (resutlCaculateConvertInt < 100 && resutlCaculateConvertInt >= 50) {
            restOfCalculate = (resutlCaculateConvertInt - 50);

            //dentro do if else cria um loop(while) ou ou if else, onde vai verificar se o resto da subtração é maior que 50, ainda
        } else if (resutlCaculateConvertInt < 50 && resutlCaculateConvertInt >= 20) {
            restOfCalculate = (resutlCaculateConvertInt - 20);

            //dentro do if else cria um loop(while) ou ou if else, onde vai verificar se o resto da subtração é maior que 20, ainda

        } else if (resutlCaculateConvertInt < 10 && resutlCaculateConvertInt >= 1) {
            restOfCalculate = (resutlCaculateConvertInt - 5);// fazer outro if else se o numero é maior ou menor 
            restOfCalculate = (resutlCaculateConvertInt - 2);
            restOfCalculate = (resutlCaculateConvertInt - 1);

        }

        for (int arrayLoop = 0; arrayLoop > 7; arrayLoop += 1) {

        }

    }
}