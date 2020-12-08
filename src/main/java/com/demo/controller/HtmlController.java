package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HtmlController {

    @GetMapping("/html")
    public String htmlPage(){
        return "<html> <head style='table, th, td {border: 1px solid black;}'> <table> <tr> <th> sr no. </th> <th> name </th> </tr> <tr> <td> 1. </td><td> John </td></tr> <tr> <td> 2. </td><td> Alex </td></tr> </table> </head> </html>" ;
    }


}
