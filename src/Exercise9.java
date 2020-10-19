import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int height;
        int row;
        int variablex = 1;
        int y;
        int blank = 1;
        String blank2 = "";

        do{
            System.out.print("Height: ");
            height = in.nextInt();
        } while (height < 1 || height > 24 || height % 1 != 0);

        row = height + 1;
        y = 2;

        for(int x = 0; x < height; x++){
            while(blank <= row - y) {
                blank2 = blank2 + " ";
                blank++;
            }
            while (variablex <= y){
                blank2 = blank2 + "#";
                variablex++;
            }
            blank2 = blank2 + "  ";
            blank = 1;
            variablex = 1;

            while(variablex <= y){
                blank2 = blank2 + "#";
                variablex++;
            }
            System.out.print("\n" + blank2);
            y += 1;
            blank2 = "";
            blank = 1;
            variablex = 1;
        }
        in.close();
    }
}