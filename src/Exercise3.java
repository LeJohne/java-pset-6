import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer;
        int sum = 0;

        do{
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        } while (integer <= 0);

        String userString = String.valueOf(integer);
        int length = userString.length();

        for(int x = 0; x < length; x++){

            String intSub = userString.substring(x, x+1);
            int intAtString = Integer.parseInt(intSub);

            if(intAtString % 2 != 0){
                sum = sum + intAtString;
            }
        }
        System.out.println("\n" + sum + ".");
        in.close();
    }
}