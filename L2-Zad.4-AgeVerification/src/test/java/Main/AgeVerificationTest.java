package Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgeVerificationTest {
    @Test
    void shouldVerifyIfAge20IsHigherOrEqualTo18(){
        //given
        int age = 20;
        //when
        boolean isAdult = AgeVerification.isAdult(age);
        //then
        Assertions.assertTrue(isAdult);
    }
    @Test
    void shouldVerifyIfAge18IsHigherOrEqualTo18(){
        //given
        int age = 18;
        //when
        boolean isAdult = AgeVerification.isAdult(age);
        //then
        Assertions.assertTrue(isAdult);
    }
    @Test
    void shouldVerifyIfAge5IsHigherOrEqualTo18(){
        //given
        int age = 5;
        //when
        boolean isAdult = AgeVerification.isAdult(age);
        //then
        Assertions.assertFalse(isAdult);
    }
    @Test
    void shouldVerifyIfAgeIsHigherOrEqualTo18GivenNegativeNumber(){
        //given
        int age = -5;
        //when
        boolean isAdult = AgeVerification.isAdult(age);
        //then
        Assertions.assertFalse(isAdult);
    }
}