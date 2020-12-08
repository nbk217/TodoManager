package com.demo.controller;

import com.demo.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${environment}")
    private String env;

    @GetMapping("/number1/{n1}/{n2}")
    public String helloWorld(@PathVariable("n1") String n1, @PathVariable("n2") String n2){
        int a1= Integer.parseInt(n1);
        int a2= Integer.parseInt(n2);

        return "Hello the product is: "+a1*a2;
    }
    @GetMapping("/hello/{name}")
    public Person helloWorld(@PathVariable("name") String n1){

        Person person = getPerson(n1);

        return person;
    }

    private Person getPerson(@PathVariable("name") String n1) {
        Person person=new Person();
        person.setName(n1);
        person.setCity("Chicago");
        person.setCountry("USA");
        person.setMobile(567865432);
        return person;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam (value="name",defaultValue = "Hello ") String name){
        return name+" "+env;
    }

}
