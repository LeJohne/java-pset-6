import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer;
        do{
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        } while (integer <= 0);

        System.out.print("\n1, " + integer);

        for(int x = 2; x <= (integer / x); x++) {
            if (integer % x == 0) {
                int div = integer / x;
                System.out.print(", " + x + ", " + div);
            }
        }
        System.out.print(".");
        in.close();
    }
}