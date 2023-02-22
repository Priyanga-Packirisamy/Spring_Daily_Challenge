package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Name {
   @GetMapping("/printname")
   
   public String printName(@RequestParam("name") String uname) {
  return "Welcome "+uname;
 
   }
}