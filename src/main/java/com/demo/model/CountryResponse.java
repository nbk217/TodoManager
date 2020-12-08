package com.demo.model;

import com.demo.model.Country;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class CountryResponse {

    private int numberOfCountries;
    private List<Country> countryList;
}
