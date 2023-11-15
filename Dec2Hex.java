import java.util.logging.Logger;

class Dec2Hex
{

    public static void main(String[] args) {
        if (args.length > 0) {
        decConvert(args[0]);
        } else  {
         System.out.println("No Input Provided");
        }
    }

    public static void decConvert(String dec)
    {
        if (!isNumber(dec)) {
           System.out.println("Input is not a number");
           return;
        }
        int arg1 = Integer.parseInt(dec);
        char[] ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        int num;
        num = arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            StringBuilder stb = new StringBuilder();
            stb.append(ch[rem]);
            stb.append(hexadecimal);
            hexadecimal = stb.toString();
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }
    public static boolean isNumber(String str) {
       try {
           Integer.parseInt(str);
       } catch (NumberFormatException nfe) {
        return false;
       }
       return true;
    }
}
