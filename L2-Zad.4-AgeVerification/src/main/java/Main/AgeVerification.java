package Main;

public class AgeVerification {
    public static boolean ageVerification(int age) {
        if (age >= 18) {
            return true;
        } else if(age < 1) {
            System.out.println("Age must be higher then 0");
            return false;
        } else {
            return false;
        }
    }
}
