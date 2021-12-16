package Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificationTest {
    @Test
    void shouldVerifyIfAge20IsHigherOrEqualTo18(){
        //given
        int age = 20;
        //when
        boolean ageVerification = AgeVerification.ageVerification(age);
        //then
        Assertions.assertTrue(ageVerification);
    }
    @Test
    void shouldVerifyIfAge18IsHigherOrEqualTo18(){
        //given
        int age = 18;
        //when
        boolean ageVerification = AgeVerification.ageVerification(age);
        //then
        Assertions.assertTrue(ageVerification);
    }
    @Test
    void shouldVerifyIfAge5IsHigherOrEqualTo18(){
        //given
        int age = 5;
        //when
        boolean ageVerification = AgeVerification.ageVerification(age);
        //then
        Assertions.assertFalse(ageVerification);
    }
    @Test
    void shouldVerifyIfAgeIsHigherOrEqualTo18GivenNegativeNumber(){
        //given
        int age = -5;
        //when
        boolean ageVerification = AgeVerification.ageVerification(age);
        //then
        Assertions.assertFalse(ageVerification,"Age must be higher then 0");
    }
}