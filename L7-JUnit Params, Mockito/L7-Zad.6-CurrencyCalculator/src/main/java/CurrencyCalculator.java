import pl.babiarz.Currency;

public class CurrencyCalculator {
    private final RateGetter rateGetter;

    public CurrencyCalculator(RateGetter rateGetter) {
        this.rateGetter = rateGetter;
    }

    public double calculateBuyValue(double pln, Currency currency){
        if (pln > 0){
        return pln / rateGetter.getCurrentBuyRate(currency);
        } throw new IllegalArgumentException("Amount can't be negative");
    }
    public double calculateSellValueInPln(double amount, Currency currency) {
       if (amount > 0) {
           return amount * rateGetter.getCurrentSellRate(currency);
       } throw new IllegalArgumentException("Amount can't be negative");
    }
}
