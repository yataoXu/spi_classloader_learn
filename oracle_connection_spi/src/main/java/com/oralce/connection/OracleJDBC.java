package com.oralce.connection;

import com.evan.JDBC;

/**
 * @author yatao.xu
 * @version 1.0.0
 * @date 2022-07-17
 **/
public class OracleJDBC implements JDBC {
    @Override
    public String baseURL() {
        System.out.println("oracle....");
        return "oracle";
    }
}
