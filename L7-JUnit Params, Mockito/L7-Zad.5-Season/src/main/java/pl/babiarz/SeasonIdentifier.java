package pl.babiarz;

import java.time.Month;

public class SeasonIdentifier {
    public static Seasons getSeason (Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Seasons.Winter;
            case MARCH:
            case APRIL:
            case MAY:
                return Seasons.Spring;
            case JUNE:
            case JULY:
            case AUGUST:
                return Seasons.Summer;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Seasons.Autumn;
        }
        return null;
    }
}

