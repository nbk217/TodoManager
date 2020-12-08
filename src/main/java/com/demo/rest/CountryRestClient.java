package com.demo.rest;

import com.demo.model.Country;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CountryRestClient {


    public List<Country> getCountriesList(String region) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://restcountries.eu/rest/v2/region/" + region;
        ResponseEntity<Country[]> response = restTemplate
                .getForEntity(url, Country[].class);
        return Arrays.asList(response.getBody());

    }

    public List<Country> getCountriesList() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://restcountries.eu/rest/v2/all";
        ResponseEntity<Country[]> response = restTemplate
                .getForEntity(url, Country[].class);
        return Arrays.asList(response.getBody());

    }
}
