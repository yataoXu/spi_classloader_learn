package com.mysql.connection;

import com.evan.JDBC;

/**
 * @author yatao.xu
 * @version 1.0.0
 * @date 2022-07-16
 **/
public class MysqlJDBC implements JDBC {
    @Override
    public String baseURL() {
        System.out.println("mysql....");
        return "Mysql";
    }
}
