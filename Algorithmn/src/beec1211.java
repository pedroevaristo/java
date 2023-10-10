//https://www.beecrowd.com.br/judge/pt/problems/view/1211

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class beec1211 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> stock_number_phone = new ArrayList<>();

        int N, loop = 0;
        String telephone_number = new String();

        System.out.println("Digite a quantos numeros de telefone vai colocar:");
        N = input.nextInt();

        while (loop <= N) {
            telephone_number = input.nextLine();
            while (telephone_number.length() > 20) {
                System.out.println("Passou dos 20 caracteres, digite em menor quantidade");
                telephone_number = "";
                telephone_number = input.nextLine();
            }
            stock_number_phone.add(telephone_number);
            loop += 1;
        }

        int equals_number = 0;
        System.out.println(stock_number_phone);


        for (int i = 0; i < stock_number_phone.size() - 1; i++) {
            String number = stock_number_phone.get(i);
            String next_number = stock_number_phone.get(i + 1);
            if (number.isEmpty()) {
                continue;
            }

            for (int j = 0; j < number.length(); j++) {
                if (number.charAt(j) == next_number.charAt(j)) {
                    equals_number++;
                }
            }
        }
        System.out.println(equals_number);

    }
}
