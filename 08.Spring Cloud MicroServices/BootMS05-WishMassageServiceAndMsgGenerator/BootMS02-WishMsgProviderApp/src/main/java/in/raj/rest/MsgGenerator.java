package in.raj.rest;
import in.raj.util.WishMsgGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Massage-Api")
public class MsgGenerator {
    @Autowired
    private WishMsgGenerator wmsg;
    @GetMapping("/wish")
    public String wish(){
        return wmsg.generateWishMsg() +"from Raj Yadav to .... ClientUser";
    }
}
