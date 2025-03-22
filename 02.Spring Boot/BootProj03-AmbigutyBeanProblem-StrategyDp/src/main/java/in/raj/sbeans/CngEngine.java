package in.raj.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("cEng")
@Lazy
public final class CngEngine implements Engine{
    public CngEngine() {
        System.out.println("CngEngine.CngEngine");
    }

    @Override
    public void start() {
        System.out.println("CngEngine.start");
    }

    @Override
    public void stop() {
        System.out.println("CngEngine.stop");
    }
}
