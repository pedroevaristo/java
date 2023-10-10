import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode1480 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> numString = new ArrayList<>();
        String transfer = new String();
        boolean whileLoop = true;
        System.out.println("Digite os numeros, quando terminar digite: s ");

        while (whileLoop == true) {
            transfer = input.nextLine();
            if(transfer.equals("s")) {
                transfer = " ";
                whileLoop = false;
                break;
            }
            numString.add(transfer);
        }

        int sizeOfNumString = numString.size();
        List<Integer> numbInt = k(numString, sizeOfNumString);

        int sum = 0;
        for(int i = 0; i < numbInt.size(); i++){
            sum += numbInt.get(i);
            int sumOf = sum;
            numbInt.set(i, sumOf);
        }
        System.out.println(numbInt);

    }

    public static List<Integer> k(ArrayList<String> numString1, Integer numberString) {
        List<Integer> numInt = new ArrayList<>();

        for (int i = 0; i < numberString; i++) {
            int pass = Integer.parseInt(numString1.get(i));
            numInt.add(pass);
        }
        return numInt;
    }

}

