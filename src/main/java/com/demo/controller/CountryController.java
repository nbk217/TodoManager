package com.demo.controller;

import com.demo.model.Country;
import com.demo.rest.CountryRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
public class CountryController {

    @Autowired
    private CountryRestClient countryRestClient;

    @GetMapping("/country/region/{region}")
    public String allContactDetails(@PathVariable("region") String region)  {
        final List<Country> countriesList = countryRestClient.getCountriesList(region);
        String html= "<html> <head> <style> table, th, td { border: 1px solid black; border-collapse: collapse; } </style> </head> <body> <table> <th> Name </th><th> Capital </th> <th> Population </th>";
        for (Country c: countriesList){
            if (parseInt(c.getPopulation())>10000000) {
                html = html + "<tr><td>" + c.getName() + "</td><td>" + c.getCapital() + "</td><td>" + c.getPopulation()  + "</td></tr>";
            }
            else  {
                html = html + "<tr><td><b>" + c.getName() + "</b></td><td>" + c.getCapital() + "</td><td>" + c.getPopulation() + "</td></tr>";
            }
        }
        html=html+"</table></body></html>";
        return html;
    }
    @GetMapping("/country/region/all")
    public String allContactDetails()  {
        final List<Country> countriesList = countryRestClient.getCountriesList();
        String html= "<html> <head> <style> table, th, td { border: 1px solid black; border-collapse: collapse; } </style></head><body> <table> <th> Name </th><th> Capital </th><th> Region </th> <th> Population </th>";

        for (Country c: countriesList){

                html = html + "<tr><td>" + c.getName() + "</td><td>" + c.getCapital() + "</td><td>" + c.getRegion() + "</td><td>" + c.getPopulation() + "</td></tr>";

        }
        html=html+"</table></body></html>";
        return html;
    }


}

