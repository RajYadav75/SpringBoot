package in.raj.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class MyntraApp {
    @Autowired
    @Qualifier("bDart")
    private Courier courier;

    public void useService(){
        courier.service();
    }

}
