import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter an integer: ");
            num = in.nextInt();
        } while (num <= 0);
        System.out.print("\n");
        while (num > 0) {
            int output = num % 10;
            if ((num / 10) == 0) {
                System.out.print(output + ".");
                num = num / 10;
            } else {
                System.out.print(output + ", ");
                num = num / 10;
            }
        }
    }
}