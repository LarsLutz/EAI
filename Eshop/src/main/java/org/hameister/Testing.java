package org.hameister;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.hameister.*;


@RestController
public class Testing {
 
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hellogdfgdrg World!", HttpStatus.OK);
    }
}
