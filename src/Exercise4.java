import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("###,###.00");

        int integer = 0;
        int sum = 0;
        int i = 0;

        do{
            System.out.print("Enter an integer: ");
            integer = in.nextInt();

            if(integer >= 0 && integer % 1 == 0){
                sum = integer + sum;
                i = i + 1;
            }
        } while (integer >= 0 && integer % 1 == 0 || i == 0);

        double average = (double)sum / i;

        System.out.println("\n" + deci.format(average) + ".");
        in.close();
    }
}
