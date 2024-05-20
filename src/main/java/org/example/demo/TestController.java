package org.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Hello Docker!!!");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> test2(){
        return ResponseEntity.ok("Hello Github Actions!!!");
    }
}
