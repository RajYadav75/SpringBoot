package in.raj.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LinkServiceImpl implements ILinkService{
    @Override
    public String generateWishMessage() {
        //get system date time
        LocalDateTime ldt = LocalDateTime.now();
        //get current hour of the day
        int hour = ldt.getHour();
        if (hour<12){
            return "Good Morning";
        } else if (hour<16) {
            return "Good AfterNoon";
        } else if (hour<20) {
            return "Good Evening";
        }else {
            return "Good Night";
        }
    }

    @Override
    public Set<String> fetchAllLanguage() {
        Locale[] availableLocales = Locale.getAvailableLocales();
        Set<String> langSet = new HashSet<String>();
        for (Locale l : availableLocales){
            langSet.add(l.getDisplayLanguage());
        }
        return langSet;
    }
}
