package homework_43;

import java.util.LinkedHashMap;
import java.util.Map;

public class HW_43 {
    public static Map<String,Boolean> returnTrueOderFalse(String[]strings){
        Map<String,Boolean>result=new LinkedHashMap<>();
        Map<String,Integer>newMap=new LinkedHashMap<>();
        for (String str:strings){
            int count=newMap.getOrDefault(str,0);
            newMap.put(str,count+1);
        }
        for (String str: strings){
            int count=newMap.get(str);
            result.put(str,count>1);
        }
        return result;
    }

    public static void main(String[] args) {
        String[]str1={"a","b","a","c","b"};
        System.out.println(returnTrueOderFalse(str1));
        String[]str2={"a","b","c"};
        System.out.println(returnTrueOderFalse(str2));
        String[]str3={"c","c","c"};
        System.out.println(returnTrueOderFalse(str2));
    }
}
