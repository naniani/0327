package com.ujiuye.dao;

import com.ujiuye.bean.City;
import com.ujiuye.bean.Country;
import com.ujiuye.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class CountryDaoImpl implements CountryDao {

    private QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());

    @Override
    public List<Country> selectAllCountry() {
        String sql = "select * from country";
        List<Country> list = null;
        try {
            list = qr.query(sql, new BeanListHandler<>(Country.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<City> selectCityByCountryId(int countryId) {
        String sql = "select * from city where country_id = ?";
        List<City> list = null;
        try {
            list = qr.query(sql, new BeanListHandler<>(City.class), countryId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
