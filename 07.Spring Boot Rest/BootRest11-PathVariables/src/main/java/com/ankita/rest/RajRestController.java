package com.ankita.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Ankita-Api")
@RestController
public class RajRestController {
    @GetMapping("/report/{id}/{name}")
    public ResponseEntity<String> registerFriends(@PathVariable("id") int fid, @PathVariable String name) {
        System.out.println("FRIENDS: " + fid + " " + name);
        return new ResponseEntity<>("FRIENDS: " + fid + " " + name, HttpStatus.OK);
    }
    @GetMapping("/report1/{id}/{name}")
    public ResponseEntity<String> registerFriends1(@PathVariable("id") String fid, @PathVariable String name) {
        System.out.println("FRIENDS: " + fid + " " + name);
        return new ResponseEntity<>("FRIENDS: " + fid + " " + name, HttpStatus.OK);
    }
    @GetMapping("/report2/{rajId}/{name}")
    public ResponseEntity<String> registerFriends2(@PathVariable(name = "rajId",required = false) String fid, @PathVariable(required = false) String name) {
        System.out.println("FRIENDS: " + fid + " " + name);
        return new ResponseEntity<>("FRIENDS: " + fid + " " + name, HttpStatus.OK);
    }
    @GetMapping("/report3/{rajId}/{name}")
    public ResponseEntity<String> registerFriends3(@PathVariable(name = "rajId",required = false) Integer fid, @PathVariable String name) {
        /*
        * FRIENDS: 101 Mr.Husband Raj Yadav
        * RajRestController.registerFriends3
        *  fid = 101, name = Mr.Husband Raj Yadav
        * fid = 101
        * name = Mr.Husband Raj Yadav
        * */
        System.out.println("FRIENDS: " + fid + " " + name);
        System.out.println("RajRestController.registerFriends3");
        System.out.println("fid = " + fid + ", name = " + name);
        System.out.println("fid = " + fid);
        System.out.println("name = " + name);
        return new ResponseEntity<>("FRIENDS: " + fid + " " + name, HttpStatus.OK);
    }
    @GetMapping("/report4/101/Raj")
    public ResponseEntity<String> registerFriends4() {
        System.out.println("RajRestController.registerFriends4");
        return new ResponseEntity<String>("From Register Friends4", HttpStatus.OK);
    }
    @GetMapping("/report5/{id}/Raj")
    public ResponseEntity<String> registerFriends5(@PathVariable(name = "id") Integer no) {
        System.out.println("RajRestController.registerFriends5");
        System.out.println("id = " + no);
        return new ResponseEntity<String>("From Register Friends5 "+no, HttpStatus.OK);
    }
    @GetMapping("/report6/101/{name}")
    public ResponseEntity<String> registerFriends6(@PathVariable(name = "name") String rajName) {
        System.out.println("RajRestController.registerFriends6");
        System.out.println("rajName = " + rajName);
        return new ResponseEntity<>("From Register Friends6 "+rajName, HttpStatus.OK);
    }

    @GetMapping("/report7/101/Raj")
    public ResponseEntity<String> registerFriends7() {
        System.out.println("RajRestController.registerFriends7");
        return new ResponseEntity<>("From Register Friends7", HttpStatus.OK);
    }
    //TODO: Send Ambiguous Mapping Error("/report7/101/Raj")("/report7/101/Raj")
    @GetMapping("/report8/101/Raj")//("/report7/101/Raj")
    public ResponseEntity<String> registerFriends8() {
        System.out.println("RajRestController.registerFriends8");
        return new ResponseEntity<>("From Register Friends8", HttpStatus.OK);
    }
    @GetMapping(value = {"/report9/{id}/{name}", "/report9/{id}"})
    public ResponseEntity<String> registerFriends9(
            @PathVariable("id") Integer rajId,
            @PathVariable(value = "name",required = false) String rajName
    ) {
        System.out.println("RajRestController.registerFriends9");
        System.out.println("rajId = " + rajId);
        System.out.println("rajName = " + rajName);
        System.out.println("rajId = " + rajId + ", rajName = " + rajName);
        return new ResponseEntity<>("From Register Friends9 "+rajId+" "+rajName, HttpStatus.OK);

    }
    @GetMapping(value = {"/report10/{id}/{name}", "/report10/{id}"})
    public ResponseEntity<String> registerFriends10(
            @PathVariable("id") String rajId,
            @PathVariable(value = "name",required = false) String rajName
    ) {
        System.out.println("RajRestController.registerFriends10");
        System.out.println("rajId = " + rajId);
        System.out.println("rajName = " + rajName);
        System.out.println("rajId = " + rajId + ", rajName = " + rajName);
        return new ResponseEntity<>("From Register Friends10 "+rajId+" "+rajName, HttpStatus.OK);

    }

}
