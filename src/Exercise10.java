import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        String Number = in.nextLine();
        String Type = "";

        int Length = Number.length();
        int[] arr = new int[Length];
        for (int i = 0; i < Length; i++){
            String card2 = Number.substring(i, i+1);
            int card3 = Integer.parseInt(card2);
            arr[i] = card3;
        }
        if(Length == 15 && Number.substring(0,2).equals("34") || Number.substring(0,2).equals("37")){
            Type = "American Express";
        }else if (Length == 16 && Number.substring(0,2).equals("51") || Number.substring(0,2).equals("52") || Number.substring(0,2).equals("53") || Number.substring(0,2).equals("54") || Number.substring(0,2).equals("55")){
            Type = "Mastercard";
        }else if ((Length == 13 || Length == 16) && Number.substring(0,1).equals("4")){
            Type = "Visa";
        }else {
            Type = null;
        }

        boolean result = true;

        int[] multiplyArray = new int[Length/2];
        int checksum = 0;
        int start = 0;
        for(int i = Length-2; i >= 0; i-=2){
            multiplyArray[start++] = arr[i]*2;
        }
        for(int i = 0; i < multiplyArray.length; i++){
            if(multiplyArray[i] >=10){
                String twoDigitNum = String.valueOf(multiplyArray[i]);
                for(int j = 0; j < twoDigitNum.length(); j++){
                    int subNum = Integer.parseInt(twoDigitNum.substring(j, j+1));
                    checksum+= subNum;
                }
            } else{
                checksum+= multiplyArray[i];
            }
        }
        for(int i = Length-1; i >=0; i-=2){
            checksum+= arr[i];
        }

        String checkSumToString = String.valueOf(checksum);
        int checkSumLength = checkSumToString.length();
        String lastDigit = checkSumToString.substring(checkSumLength-1, checkSumLength);
        if(lastDigit.equals("0")){
            result = true;
        } else{
            result = false;
        }

        if(result && Type != null){
            System.out.println("\n"+Type+".");
        } else {
            System.out.println("\nInvalid.");
        }
        in.close();
    }
}