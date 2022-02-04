package pl.babiarz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class DateOfBirth {
        private final String birthDay = "1987-10-27";
        private final LocalDate dateOfBirthParsed = LocalDate.parse(birthDay);

        public int getAge () {
            LocalDate now = LocalDate.now();
            Period period = Period.between(dateOfBirthParsed, now);
            return period.getYears();
        }
        public DayOfWeek getDayOfBirth () {
            return dateOfBirthParsed.getDayOfWeek();
        }
        public int getWeekOfBirthYear() {
            TemporalField weekOfYear = WeekFields.of(Locale.getDefault()).weekOfWeekBasedYear();
            return dateOfBirthParsed.get(weekOfYear);
        }
}
