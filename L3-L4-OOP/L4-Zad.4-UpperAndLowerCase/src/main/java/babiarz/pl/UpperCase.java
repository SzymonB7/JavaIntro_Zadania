package babiarz.pl;

public class UpperCase implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
