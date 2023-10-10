import java.util.Scanner;

public class ZeroSum {

    public static void main(String[] args) {
        Scanner receiveNumber = new Scanner(System.in);
        System.out.println("Type down how many numbers you'll put: \n");

        int inputMaxValues= receiveNumber.nextInt();

        int[] maxValues= new int[inputMaxValues];

        System.out.println("type values below:");
        for(int row = 0; row < inputMaxValues; row++){

            maxValues[row]= receiveNumber.nextInt();

        }
        if(functionToMain(maxValues,inputMaxValues)){
           System.out.println("This list of the array exist subarrays with sum equal zero(0)");
        }else{
            System.out.println("This list of the array doesn't exist subarrays with sum equal zero(0)");
        }

    }

    public static Boolean functionToMain(int[] maxValues, int inputMaxValues){
        for (int loop1 = 0; loop1 < inputMaxValues; loop1++){

            int sum = maxValues[loop1];
            //System.out.println(maxValues[loop1]+ "\n");

            if(sum == 0) {
                return true;
            }
                for (int loop2 = loop1 + 1; loop2 < inputMaxValues; loop2++) {

                    System.out.println(sum + "\n");
                    sum += maxValues[loop2];
                    if (sum == 0) {
                        return true;
                    }
                }
        }
        return false;

    }
}
