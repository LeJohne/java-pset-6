import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("###,###,###.##");

        int lower = 0;
        int upper = -1;
        int sum = 0;

        while(upper < lower) {
            System.out.print("Lower bound: ");
            lower = in.nextInt();

            System.out.print("Upper bound: ");
            upper = in.nextInt();
        }

        for (int x = lower; x <= upper ; x++ ){
            if (x % 2 == 0){
                sum += x;
            }
        }

        System.out.println("\n" + deci.format(sum) + ".");

        in.close();
    }
}
