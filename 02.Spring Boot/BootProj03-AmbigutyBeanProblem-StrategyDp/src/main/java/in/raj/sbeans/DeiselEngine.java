package in.raj.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("dEng")
@Lazy
public final class DeiselEngine implements Engine{
    public DeiselEngine(){
        System.out.println("DeiselEngine.DeiselEngine");
    }
    @Override
    public void start() {
        System.out.println("DeiselEngine.start");
    }

    @Override
    public void stop() {
        System.out.println("DeiselEngine.stop");
    }
}
