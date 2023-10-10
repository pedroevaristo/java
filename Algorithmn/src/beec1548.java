//https://www.beecrowd.com.br/judge/pt/problems/view/1548

import java.util.Scanner;

public class beec1548 {
   public static void main(String[] args) {
       Scanner inputQuantityInRow = new Scanner(System.in);
       int howManyInRow;

        System.out.println("Digite quantas filas foram formadas:");
        int loopWhileHowManyInRow = inputQuantityInRow.nextInt();

        System.out.println("Digite a seguir quantidade de notas:");

        int loop = 0;
        int auxiliarOrganize = 0;
        do {
            howManyInRow = inputQuantityInRow.nextInt();
            int[] gradesStudent = new int[howManyInRow];

            for (int loopFor = 0; loopFor < howManyInRow; loopFor++) {
                System.out.println("Digite as notas:");
                gradesStudent[loopFor] = inputQuantityInRow.nextInt();
            }

            int[] greatStudentCopy = gradesStudent.clone();

            for (int i = 0; i < howManyInRow; i++) {
                for (int j = i + 1; j < howManyInRow; j++) {
                    if (gradesStudent[i] < gradesStudent[j]) {
                        auxiliarOrganize = gradesStudent[i];
                        gradesStudent[i] = gradesStudent[j];
                        gradesStudent[j] = auxiliarOrganize;
                    }
                }
            }
            int sum = 0;
            for(int i = 0; i <greatStudentCopy.length; i++){
                if(greatStudentCopy[i] != gradesStudent[i]){
                    sum +=1;
                }
            }
            System.out.println(sum);

            System.out.println("|----------------------|");

            loop += 1;
        } while (loop < loopWhileHowManyInRow);



        inputQuantityInRow.close();
    }
}