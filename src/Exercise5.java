import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer = 0;
        boolean flag = false;

        do{
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        } while (integer <= 0 || integer % 1 != 0);

        for(int x = 2; x <= integer/2; x++){
            if(integer % x == 0){
                System.out.print("\nNot prime.");
                break;
            } else {
                System.out.print("\nPrime.");
                break;
            }
        }
        in.close();
    }
}
