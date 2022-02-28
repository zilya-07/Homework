//Define String.prototype.toAlternatingCase
//        (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase
//        in your selected language;
//see the initial solution for details)
//        such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.
//altERnaTIng cAsE <=> ALTerNAtiNG CaSe
public class StringUtils {

    public static String toAlternativeString(String string) {
        // your code here!
        char[] arr = string.toCharArray();
        for (int i =0;i<arr.length;i++) {
            if (arr[i] <= 90 && arr[i]  >= 65) {
                arr[i]  += 32;
            } else if (arr[i]  <= 122 && arr[i]  >= 97) {
                arr[i]  -= 32;
            }
        }
        return new String(arr);

    }
}
