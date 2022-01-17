import pl.babiarz.Currency;

public class CurrencyCalculator {
    private final RateGetter rateGetter;

    public CurrencyCalculator(RateGetter rateGetter) {
        this.rateGetter = rateGetter;
    }

    public double calculateBuyValue(double pln, Currency currency){
        if (pln > 0){
        return pln / rateGetter.getCurrentBuyRate(currency);
        } throw new IllegalArgumentException("Value can't be negative");
    }
    public double calculateSellValue (double amount, Currency currency) {
        return amount * rateGetter.getCurrentSellRate(currency);
    }
}
