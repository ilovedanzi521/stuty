package com.wanglei.study.gupao.day06.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class JdbcTemplate {
    private DataSource dataSource;
    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] objests){
        try {
            Connection conn = this.getConnection();
            PreparedStatement pstm = this.createPreparedStatement(conn, sql);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private PreparedStatement createPreparedStatement(Connection conn, String sql) {
        return null;
    }


    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }


}
