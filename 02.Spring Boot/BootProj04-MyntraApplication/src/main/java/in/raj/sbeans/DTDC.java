package in.raj.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier{
    @Override
    public void service() {
        System.out.println("DTDC.service");
    }
}
