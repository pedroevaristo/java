import java.util.Arrays;
import java.util.Scanner;
public class beec1548New {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int people, numberLine, numberPerson, loop = 0, aux = 0;

    System.out.println("Digite a quantidade de filas:");
        numberLine = input.nextInt();

    System.out.println("Digite a quantidade de notas");
        numberPerson = input.nextInt();
        int[] grades = new int[numberPerson];

        int numberChanges = 0;

        for (int i = 1;i<numberPerson;i++){
            grades[i] = input.nextInt();
        }
        input.close();

        int[] orderGrades = Arrays.copyOf(grades, grades.length);

        Arrays.sort(orderGrades);

        for (int i = 0; i < grades.length; i++){
            if(grades[i] != orderGrades[i]){
                ++numberChanges;
            }
        }
        System.out.println(numberChanges);
    }
}
