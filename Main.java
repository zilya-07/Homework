//String repeat
//Write a function called repeatStr which repeats the given string string exactly n times.
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String repeatedString = "";
        for(int i = 0; i<repeat; i++) {
            repeatedString += string;
        }
        return repeatedString;
    }
}