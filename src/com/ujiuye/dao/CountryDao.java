package com.ujiuye.dao;

import com.ujiuye.bean.City;
import com.ujiuye.bean.Country;
import com.ujiuye.servlet.selectCityByCountryId;

import java.util.List;

public interface CountryDao {

    List<Country> selectAllCountry();


    //    通过国家id查询城市
    List<City> selectCityByCountryId(int countryId);
}
