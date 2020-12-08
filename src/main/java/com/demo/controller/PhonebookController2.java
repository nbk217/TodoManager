package com.demo.controller;

import com.demo.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.Set;

@RestController
public class PhonebookController2 {
    Set<Contact> contactSet = new LinkedHashSet<>();
    private int id;

    @GetMapping("/phonebook2/all")
    public Set<Contact> allContactDetails()  {
       return contactSet;
    }

    @GetMapping("/phonebook2/{name}")
    public Contact contactDetails(@PathVariable("name") String name){
        Contact searchedContact= null;
        for(Contact contact: contactSet) {
            if (contact.getName().equalsIgnoreCase(name)) {
               searchedContact= contact;
            }
        }
        return searchedContact;
    }

    @PostMapping("/phonebook2")
    public boolean saveContact(@RequestBody Contact inputcontact){
//        for(Contact contact:contactSet){
//            if(!(inputcontact.getName()==contact.getName()^inputcontact.getMobile()==contact.getMobile()^inputcontact.getEmail()==contact.getEmail())) {
//                inputcontact.setId(id);
//                ++id;
//            }
//        }
        inputcontact.setId(id+1);
        if(contactSet.add(inputcontact)){
            id++;
        }

        return true;
    }
//
//    @PutMapping("/phonebook2")
//    public boolean updateContact(@RequestBody Contact inputContact) {
//        for(Contact contact: contactSet){
//
//
//        }
//    }


}

