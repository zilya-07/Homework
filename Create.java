//Create Phone Number
//        Write a function that accepts an array of 10 integers (between 0 and 9),
//        that returns a string of those numbers in the form of a phone number.
public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder string = new StringBuilder("(" + numbers[0] + numbers[1] + numbers[2] + ") ");
        for (int i = 3; i < numbers.length; i++) {
            string.append(numbers[i]);
            if (i == 5) {
                string.append("-");
            }
        }
        return string.toString();
    }
}