//https://www.techiedelight.com/?problem=ZeroSumII
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
// mudar para arraylist ou linkedHashSet ou algo que não faça que ordene os valores inteiros
public class ZeroSum2 {
private static boolean tempoExpirado = false;

    public static void main(String[] args) {
        Scanner inputingInfor = new Scanner(System.in);
        ArrayList<Integer> inputValues = new ArrayList<>();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                System.out.println("\nAcabou tempo de digitar");
                tempoExpirado = true;

            }
        };
        timer.schedule(task,10000);

        System.out.println("Digite abaixo os valores");

        while(!tempoExpirado) {
            int receber = inputingInfor.nextInt();
            if(tempoExpirado == true){
                break;
            }
            inputValues.add(receber);
        }
        System.out.println(inputValues);
       printingTheSubarrays(inputValues);

        inputingInfor.close();
        timer.cancel();
        //System.out.println(inputValues);

    }

    public static void printingTheSubarrays(ArrayList<Integer> inputValues){

        for (int loop1 =0; loop1< inputValues.size(); loop1++){
            int sum = 0;

            for(int loop2  = loop1; loop2< inputValues.size(); loop2++){
                // qual a diferença entre loop2  = loop1 para loop2  = loop1 +1?

                    sum+= inputValues.get(loop2) ;
                    if(sum == 0){
                        System.out.println(loop1 +" : " +loop2 +"- (" +inputValues.get(loop1)+ ") : ( "+inputValues.get(loop2)+" ) = "+ sum +";");
                    }



            }
        }
    }
}
