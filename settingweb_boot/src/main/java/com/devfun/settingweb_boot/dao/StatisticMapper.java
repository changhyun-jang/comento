package com.devfun.settingweb_boot.dao;
import java.util.HashMap;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
 
public interface  StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
 
}
