//https://www.beecrowd.com.br/judge/pt/problems/view/2950
import java.util.Scanner;

public class beec2950 {
    public static void main(String[] args) {
        Scanner inputValues = new Scanner(System.in);
        double[] stockValues = new double[3];
        System.out.println("Digite na sequência: distância e os dois diâmetros dos pontos:");
        for(int loop = 0; loop < 3; loop++){
            stockValues[loop] = inputValues.nextDouble();
        }
        doCalculation(stockValues);

    }
    public static void doCalculation(double[] stockValues){
    double resultCalculation = 0;
        resultCalculation = stockValues[0] /(stockValues[1] + stockValues[2]);
    System.out.printf("result is : %.2f", resultCalculation);
    }

}
