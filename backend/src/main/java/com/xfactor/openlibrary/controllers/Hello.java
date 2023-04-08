package com.xfactor.openlibrary.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
@RestController
@RequestMapping("helloController")
//http://localhost:8080/helloController/sayhi/Arideepa/20
public class Hello 
{

    @GetMapping("/hello")
    public String hello(@RequestParam String name, @RequestParam int age, @RequestParam String college) {
        return "Hello, My name is " +name+ ". I am " +age+ "years old. I am a student of " +college+ ". Thank you...";
    }
    //http://localhost:8080/hello?name=Arideepa&age=20&dept=IT
    @GetMapping("/hi/{name}/{age}")
    public String hi(@PathVariable String name, @PathVariable int age, @RequestParam String dept) {
        return "Hello, I am " +name+ ". My age is " +age+ "years. I am a student of " +dept+ " Department. Thank you...";
    }
    //http://localhost:8080/hi/Arideepa/20?dept=IT
    @GetMapping("/sayhi/{name}/{age}")
    public HashMap<String, Object> sayhi (@PathVariable String name, @PathVariable int age) {
        HashMap <String, Object> respHashMap = new HashMap<>();
        respHashMap.put("name", name);
        respHashMap.put("age", age);
        return respHashMap;
        //http://localhost:8080/sayhi/Arideepa/20
    }

}
