package OOP.src;

import java.time.LocalDate;
import java.time.Period;

public class CalcAge {
        public static double calculateAge(LocalDate birthDate) {
        if (birthDate != null) {
            return Period.between(birthDate, LocalDate.now()).getYears();
        } else {
            return 0;
        }
    }
}
