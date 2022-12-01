package tdd.fizzbuzz;

public class FizzBuzz {

    private static final String EMPTY = "";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(int countNumber) {
        String returnStr = EMPTY;
        if (countNumber % 3 == 0) {
            returnStr += FIZZ;
        }
        if (countNumber % 5 == 0) {
            returnStr += BUZZ;
        }
        if (countNumber % 7 == 0) {
            returnStr += WHIZZ;
        }

        if (returnStr.equals(EMPTY)) {
            return String.valueOf(countNumber);
        } else {
            return returnStr;
        }
    }
}
