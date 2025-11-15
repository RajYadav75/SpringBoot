package in.raj.O3Writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookInfoWriter implements ItemWriter<String> {
    @Override
    public void write(List<? extends String> list) throws Exception {
        System.out.println("BookInfoWriter.write()");
        System.out.println("Process Books are :: "+list.toString());
    }
}
