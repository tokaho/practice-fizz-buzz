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
    
    @Test
    void should_return_Fizz_when_countOff_given_3(){
        //given
        int input=3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("Fizz",actual);
    }

    @Test
    void should_return_Buzz_when_countOff_given_5(){
        //given
        int input=5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("Buzz",actual);
    }

    @Test
    void should_return_FizzBuzz_when_countOff_given_15(){
        //given
        int input=15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("FizzBuzz",actual);
    }

    @Test
    void should_return_Whizz_when_countOff_given_7(){
        //given
        int input=7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("Whizz",actual);
    }

    @Test
    void should_return_FizzWhizz_when_countOff_given_21(){
        //given
        int input=21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("FizzWhizz",actual);
    }

    @Test
    void should_return_BuzzWhizz_when_countOff_given_35(){
        //given
        int input=35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("BuzzWhizz",actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_countOff_given_105(){
        //given
        int input=105;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual=fizzBuzz.countOff(input);
        //then
        assertEquals("FizzBuzzWhizz",actual);
    }


}
