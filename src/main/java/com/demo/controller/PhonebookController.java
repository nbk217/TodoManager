package com.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.demo.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PhonebookController {
    Map<String,String> directory= new LinkedHashMap<>();
    List<Contact> contactList = new ArrayList<>();

    @GetMapping("/phonebook/all")
    public List<Contact> allContactDetails() throws JsonProcessingException {

        List<String> list=new ArrayList<>(50);
       for(String key: directory.keySet()){
           list.add(directory.get(key));
       }
       return contactList;
    }
    @GetMapping("/phonebook/{name}")
    public String contactDetails(@PathVariable("name") String name){
        return directory.get(name);
    }
    @PostMapping("/phonebook")
    public boolean saveContact(@RequestBody Contact contact){
//        directory.put(contact.getName(),contact.getMobile());
        contactList.add(contact);
        return true;
    }
    @DeleteMapping("/phonebook")
    public boolean deleteContact(@RequestBody Contact contact){
        directory.remove(contact.getName());
        return true;
    }
//    @PutMapping("/phonebook/{name}")
//    public boolean replacePerson(@RequestBody Contact contact) {
//
//
//    }

}

