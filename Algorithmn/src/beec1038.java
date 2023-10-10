//https://www.beecrowd.com.br/judge/pt/problems/view/1038
//import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class beec1038 {
     public static void main(String[] args) {
         HashMap<Integer, Double> stockValuesWithCode = new HashMap<>();
         Scanner InputClient = new Scanner(System.in);

         try {
            File fileTable = new File("C:\\Users\\Pedro Evaristo\\3D Objects\\java\\AlgorithmJava\\tabela.txt");
            Scanner inputTablePrice= new Scanner(fileTable);
            while(inputTablePrice.hasNextLine()){

                String showtablePrice = inputTablePrice.nextLine();
                System.out.println(showtablePrice);
            }
            inputTablePrice.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error surgido");
            e.printStackTrace();
        }
         //Usar Hasmap parar escolher as opções colocando dentro tudo de uma vez só os codigos e o preço
         addingThevaluesWithCode(stockValuesWithCode);

        System.out.println("Digite o código:");
        int codeFromTheTable = InputClient.nextInt();
        System.out.println("e a quantidade que deseja:");
        double howManyFromTheTable = InputClient.nextDouble();

        if(stockValuesWithCode.containsKey(codeFromTheTable)){
            double priceOfThePorduct = stockValuesWithCode.get(codeFromTheTable);
            double resultValueTotal = priceOfThePorduct * howManyFromTheTable;
            System.out.println("Seu valor total é: " +resultValueTotal);
        }else{
            System.out.println("Não tem essa opção em nosso cardápio. Escolhe outra");
        }

    }

    public static void addingThevaluesWithCode(HashMap<Integer, Double> stockValuesWithCode){

        stockValuesWithCode.put(1, 4.00);         stockValuesWithCode.put(2, 4.50);
        stockValuesWithCode.put(3, 5.00);         stockValuesWithCode.put(4, 2.00);
        stockValuesWithCode.put(5, 1.50);
    }





}
