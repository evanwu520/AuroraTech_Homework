package com.evan.homework.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
public class MainController {


    @GetMapping("/data")
    public ResponseEntity<String>  getData(){
        return ResponseEntity.ok("test");
    }



}
