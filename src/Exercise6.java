import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int integer = -1;

        do{
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        } while (integer < 0 || integer > 92);

        int length = integer;
        long[] arr = new long[length];

        for(int x = 0; x < length; x++){
            if(x - 1 >= 0 && x - 2 >= 0){
                arr[x] = (arr[x -2] + arr[x - 1]);
            } else if(x == 1){
                arr[x] = 1;
            } else if(x == 0){
                arr[x] = 0;
            }
        }

        System.out.print("\n" + arr[integer - 1] + ".");
        in.close();
    }
}
