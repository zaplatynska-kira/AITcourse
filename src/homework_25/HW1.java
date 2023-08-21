package homework_25;

public class HW1 {
    public static void main(String[] args) {
        String str1 = "Guten Tag";
        String str2 = "Tag";
        String str3 = "Nacht";
        strEndsWithAnotherStr(str1, str2);
        System.out.println(" String  " + strEndsWithAnotherStr(str1, str2) );
        System.out.println(" String  " + strEndsWithAnotherStr(str1, str3) );

    }

    public static boolean strEndsWithAnotherStr(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        String endStr1 = str1.substring(length1 - length2);
        if (endStr1.equals(str2)) return true;
        else return false;
    }
}