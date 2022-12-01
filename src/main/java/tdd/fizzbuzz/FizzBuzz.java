package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int i){
        String returnStr="";
        if(i%3==0){
            returnStr+="Fizz";
        }
        if(i%5==0){
            returnStr+="Buzz";
        }

        if(returnStr.equals("")){
            return String.valueOf(i);
        }else{
            return returnStr;
        }
    }
}
