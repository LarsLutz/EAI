package org.hameister;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import java.util.Collection;
 
@SpringBootApplication
public class PaymentApplication {
 
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}
 
 
