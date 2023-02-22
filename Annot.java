package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Annot {

@Value("Hello")
private String wel;

@Value("${sample.value}")
private String name;

@GetMapping("annot")
public String Annotations(){
return wel+" "+name;
}
}
