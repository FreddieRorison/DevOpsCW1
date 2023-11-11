import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public Dec2Hex() {}

    public static void main(String[] args) {
        if (args[0]) {
        DecConvert(args[0]);
        } else {
         System.out.println("No Input Provided");
        }
    }

    public static void DecConvert(String Dec)
    {
        if (!isNumber(Dec)) {
           System.out.println("Input is not a number");
           return;
        }
        int Arg1 = Integer.parseInt(Dec);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }
    public static void isNumber(String str) {
       try {
           int in = Integer.parseInt(Dec);
       } catch (NumberFormatException nfe) {
        return false;
       }
       return true;
    }
}
