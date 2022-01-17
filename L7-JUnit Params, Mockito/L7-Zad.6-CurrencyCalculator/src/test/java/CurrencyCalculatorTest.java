import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.babiarz.Currency;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CurrencyCalculatorTest {
    CurrencyCalculator currencyCalculator;
    RateGetter rateGetter;
    @BeforeEach
    void setup() {
        rateGetter = Mockito.mock(RateGetter.class);
        currencyCalculator = new CurrencyCalculator(rateGetter);
    }
    @Test
    void shouldCalculateBuyValueInUsd(){
        //given
        double pln = 20;
        //when
        when(rateGetter.getCurrentBuyRate(Currency.USD)).thenReturn(4.00);
        double buyValue = currencyCalculator.calculateBuyValue(pln,Currency.USD);
        //then
        Assertions.assertEquals(5,buyValue);
    }
    @Test
    void shouldCalculateSellValueInUsd(){
        //given
        double amount = 5;
        //when
        when(rateGetter.getCurrentSellRate(Currency.USD)).thenReturn(4.00);
        double sellValue = currencyCalculator.calculateSellValue(amount,Currency.USD);
        //then
        Assertions.assertEquals(20,sellValue);
    }
}