package com.ujiuye.service;

import com.ujiuye.bean.City;
import com.ujiuye.bean.Country;
import com.ujiuye.dao.CountryDao;
import com.ujiuye.dao.CountryDaoImpl;

import java.util.List;

public class CountryServiceImpl implements CountryService {

    private CountryDao cd = new CountryDaoImpl();

    @Override
    public List<Country> selectAllCountry() {
        return cd.selectAllCountry();
    }

    @Override
    public List<City> selectCityByCountryId(int countryId) {
        return cd.selectCityByCountryId(countryId);
    }
}
