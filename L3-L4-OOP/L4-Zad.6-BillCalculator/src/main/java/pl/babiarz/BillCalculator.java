package pl.babiarz;

public class BillCalculator {
    public static double calculate(double billValue, float serviceFee) {
        return billValue + serviceFee;
    }
    public static double calculateWithDiscount(double billValue, float serviceFee, double discount){
        return (billValue - discount) + serviceFee;
    }
    public static double calculateWithPackagingFee(double billValue, float serviceFee, short PackagingFee) {
        return billValue + serviceFee + PackagingFee;
    }
}
