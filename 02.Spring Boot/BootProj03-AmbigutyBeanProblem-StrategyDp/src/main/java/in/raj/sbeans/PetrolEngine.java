package in.raj.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("pEng")
@Lazy
public final class PetrolEngine implements Engine{
    public PetrolEngine(){
        System.out.println("PetrolEngine.PetrolEngine");
    }
    @Override
    public void start() {
        System.out.println("PetrolEngine.start");
    }

    @Override
    public void stop() {
        System.out.println("PetrolEngine.stop");
    }
}
