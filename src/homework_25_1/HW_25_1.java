package homework_25_1;

public class HW_25_1 {
    public static void main(String[] args) {

      String str1  ="Guten tag!";
      char[]chars = createArray(str1);
      for (char c : chars)
        System.out.print( "" + c );

    }



    public static char[] createArray(String str){
            return str.toCharArray();

        }
    }

