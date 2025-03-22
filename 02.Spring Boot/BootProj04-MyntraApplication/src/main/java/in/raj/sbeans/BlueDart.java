package in.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements Courier{
    @Override
    public void service() {
        System.out.println("BlueDart.service");
    }
}
