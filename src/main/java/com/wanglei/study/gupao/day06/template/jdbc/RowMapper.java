package com.wanglei.study.gupao.day06.template.jdbc;

import java.sql.ResultSet;

public interface RowMapper <T>{
    T mapRow(ResultSet rs,int rowNum)throws  Exception;
}
