package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
   @GetMapping("color")
   public String color(@RequestParam("color") String fcolor) {
  return "Choose Your Favourite color "+fcolor;
   }
}