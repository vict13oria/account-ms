package account.account;

import java.util.HashMap;
import java.util.Map;

public class Utils {
    public static boolean isEvenNumber(int number){

        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }

    public static boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }

    public static String getPropValue(final String key){
        Map<String, String> appProps = new HashMap<String, String>();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");
        return appProps.get(key);
    }

}
