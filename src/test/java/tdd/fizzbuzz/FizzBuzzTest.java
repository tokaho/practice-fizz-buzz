package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_input_when_countOff_given_not_a_multiple_of_3_or_5_or_7(){
        //given
        int input=1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("1",actual);
    }
    
    @Test
    void should_return_Fizz_when_countOff_given_multiple_of_3(){
        //given
        int input=3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("Fizz",actual);
    }

    @Test
    void should_return_Buzz_when_countOff_given_multiple_of_5(){
        //given
        int input=5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("Buzz",actual);
    }

    @Test
    void should_return_FizzBuzz_when_countOff_given_multiple_of_3_and_5(){
        //given
        int input=15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("FizzBuzz",actual);
    }

    @Test
    void should_return_Whizz_when_countOff_given_multiple_of_7(){
        //given
        int input=7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("Whizz",actual);
    }

    @Test
    void should_return_FizzWhizz_when_countOff_given_multiple_of_3_and_7(){
        //given
        int input=21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("FizzWhizz",actual);
    }

    @Test
    void should_return_BuzzWhizz_when_countOff_given_multiple_of_5_and_7(){
        //given
        int input=35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("BuzzWhizz",actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_countOff_given_multiple_of_3_and_5_and_7(){
        //given
        int input=105;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("FizzBuzzWhizz",actual);
    }


}
