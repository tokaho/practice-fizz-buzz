package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_countOff_given_1(){
        //given
        int input=1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("1",actual);
    }


}
