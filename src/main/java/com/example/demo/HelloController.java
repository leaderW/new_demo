//package com.example.springboot;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframeword.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//  @GetMapping("/")
//  public String index() {
//    return "Greetings from Spring Boot!";
//  }
//}


package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @GetMapping("/")
        public String index() {
                return "Greetings from Spring Boot! \n";
        }

}
