package com.example.simpleapplicationForDeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleController {

    @GetMapping("/hello")
    public String hello(){
        return "안녕하세요 어머니 저녁 맛있게 드세요 맛있게 드세요 맛있게 드세요 맛있게 드세요";
    }
}
