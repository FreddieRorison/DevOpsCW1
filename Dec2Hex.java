import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public Dec2Hex() {}

    public static void main(String[] args) {
        DecConvert(args[0]);
    }

    public static void DecConvert(String Dec)
    {
        if (dec == null) {
           System.out.println("Input not provided as argument");
           return;
        } else if (Integer.parseInt(Dec) == false) {
           System.our.println("Input is not a number");
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
}
