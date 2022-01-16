import pl.babiarz.Currency;

public interface RateGetter {
    double getCurrentBuyRate(Currency currency);
    double getCurrentSellRate(Currency currency);
}
