package com.ujiuye.service;

import com.ujiuye.bean.City;
import com.ujiuye.bean.Country;

import java.util.List;

public interface CountryService {
    List<Country> selectAllCountry();

    List<City> selectCityByCountryId(int countryId);
}
