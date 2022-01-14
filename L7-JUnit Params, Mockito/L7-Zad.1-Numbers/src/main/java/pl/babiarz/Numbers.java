package pl.babiarz;

public class Numbers {
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int addDigits(int number){
        int sum = 0;

        while (number != 0){
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;
    }
}
