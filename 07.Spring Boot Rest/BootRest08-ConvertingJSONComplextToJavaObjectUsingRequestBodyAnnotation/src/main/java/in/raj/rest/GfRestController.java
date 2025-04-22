package in.raj.rest;

import in.raj.model.GirlFriends;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Girlfriend-Api")
public class GfRestController {
    @PostMapping("/register")
    public ResponseEntity<GirlFriends> registerGF(@RequestBody GirlFriends gf) {
        System.out.println(gf);
        return new ResponseEntity<GirlFriends>(gf, HttpStatus.OK);
    }

    /*{
        "firstName":"Ankita",
            "lastName":"tiwari",
            "address":"Harigana",
            "salary":150000.00,
            "nickNames":["Raj", "RajkiBb", "Raj Ki Dulhaniya"],
        "friends":[
        "Raj Yadav",
                "Raj Yadav Boyfriend",
                "Baba Yaga",
                "Husband"
    ],
        "phoneNumbers":[
        987654123, 789544123, 63854523615
    ],
        "idDetails":{
        "Id":7896, "secId":7452, "thirdId":4521
    },
        "company":{
        "id":1,
                "name":"RajTechnology",
                "address":"Kanapar Harigana",
                "size":100
    },
        "dob":"2025-04-22T09:17:55",
            "isIndian":true
    }*/
}
