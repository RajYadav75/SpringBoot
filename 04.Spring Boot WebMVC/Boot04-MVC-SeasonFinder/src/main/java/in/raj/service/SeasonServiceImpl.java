package in.raj.service;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class SeasonServiceImpl implements ISeasonService{


    @Override
    public String getSeason() {
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();
        if (month >= 7 && month <= 9) {
            return "Rainy Season";
        }
        else if (month >= 3 && month <= 6) {
            return "Summer Season";
        }
        else {
            return "Winter Season";
        }
    }
}
