import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.babiarz.Currency;

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
    void shouldCalculateBuyValueInUSD() {
        //given
        double pln = 20;
        //when
        when(rateGetter.getCurrentBuyRate(Currency.USD)).thenReturn(4.00);
        double buyValue = currencyCalculator.calculateBuyValue(pln, Currency.USD);
        //then
        Assertions.assertEquals(5, buyValue);
    }

    @Test
    void shouldCalculateSellValueInUSD() {
        //given
        double amount = 5;
        //when
        when(rateGetter.getCurrentSellRate(Currency.USD)).thenReturn(4.00);
        double sellValue = currencyCalculator.calculateSellValueInPln(amount, Currency.USD);
        //then
        Assertions.assertEquals(20, sellValue);
    }

    @Test
    void shouldCalculateBuyValueInEUR() {
        //given
        double pln = 22.5;
        //when
        when(rateGetter.getCurrentBuyRate(Currency.EUR)).thenReturn(4.5);
        double buyValue = currencyCalculator.calculateBuyValue(pln, Currency.EUR);
        //then
        Assertions.assertEquals(5, buyValue);
    }

    @Test
    void shouldCalculateSellValueInEUR() {
        //given
        double amount = 5;
        //when
        when(rateGetter.getCurrentSellRate(Currency.EUR)).thenReturn(4.5);
        double sellValue = currencyCalculator.calculateSellValueInPln(amount, Currency.EUR);
        //then
        Assertions.assertEquals(22.5, sellValue);
    }

    @Test
    void shouldCalculateBuyValueInGBP() {
        //given
        double pln = 55;
        //when
        when(rateGetter.getCurrentBuyRate(Currency.GBP)).thenReturn(5.5);
        double buyValue = currencyCalculator.calculateBuyValue(pln, Currency.GBP);
        //then
        Assertions.assertEquals(10, buyValue);
    }

    @Test
    void shouldCalculateSellValueInGBP() {
        //given
        double amount = 10;
        //when
        when(rateGetter.getCurrentSellRate(Currency.GBP)).thenReturn(5.5);
        double sellValue = currencyCalculator.calculateSellValueInPln(amount, Currency.GBP);
        //then
        Assertions.assertEquals(55, sellValue);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenAmountIsNegativeInCalculateBuyValue() {
        //given
        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> currencyCalculator.calculateBuyValue(-12,Currency.GBP));
    }
    @Test
    void shouldThrowIllegalArgumentExceptionWhenAmountIsNegativeInCalculateSellValue() {
        //given
        //when
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> currencyCalculator.calculateSellValueInPln(-12,Currency.GBP));
    }
}