package in.raj.O2Processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class BookInfoProcessor implements ItemProcessor<String, String> {

    @Override
    public String process(String item) throws Exception {
        System.out.println("BookInfoProcessor.process()");
        if (item.equalsIgnoreCase("TIJ")) {
            return item + "-----BE";
        } else if (item.equalsIgnoreCase("EJ"))
            return item + "-- JB";
        else if (item.equalsIgnoreCase("HFJ"))
            return item + "--KS";
        else if (item.equalsIgnoreCase("BBJ"))
            return item + "--RNR";
        else if (item.equalsIgnoreCase("CRJ"))
            return item + "--PN & HS";
        else
            return null;
    }
}
