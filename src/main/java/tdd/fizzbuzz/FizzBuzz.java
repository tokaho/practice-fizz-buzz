package tdd.fizzbuzz;

public class FizzBuzz {

    private static final String EMPTY = "";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int i) {
        String returnStr = EMPTY;
        if (i % 3 == 0) {
            returnStr += FIZZ;
        }
        if (i % 5 == 0) {
            returnStr += BUZZ;
        }
        if (i % 7 == 0) {
            returnStr += WHIZZ;
        }

        if (returnStr.equals(EMPTY)) {
            return String.valueOf(i);
        } else {
            return returnStr;
        }
    }
}
