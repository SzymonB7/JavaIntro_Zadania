import pl.babiarz.Currency;

public class CurrencyCalculator implements RateGetter {
    public CurrencyCalculator(double currencyBuyRate, double currencySellRate) {
        this.currencyBuyRate = currencyBuyRate;
        this.currencySellRate = currencySellRate;
    }

    double currencyBuyRate;
    double currencySellRate;

    @Override
    public double getCurrentBuyRate(Currency currency) {
        return currencyBuyRate;
    }

    @Override
    public double getCurrentSellRate(Currency currency) {
        return currencySellRate;
    }


    public static double currencyConverter(double pln, Currency currency){
        return pln.getCurrentBuyRate(currency);
    }



}
