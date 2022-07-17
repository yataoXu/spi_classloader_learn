package com.jdbc.spi;


import com.evan.JDBC;

import java.util.ServiceLoader;

/**
 * @author yatao.xu
 * @version 1.0.0
 * @date 2022-07-17
 **/
public class StartApp {

    public static void main(String[] args) {
        ServiceLoader<JDBC> load = ServiceLoader.load(JDBC.class);
        for (JDBC driver : load) {
            System.out.println("diverName :" + driver.getClass().getName() + " , loadDriver's Loader: " + driver.getClass().getClassLoader());
            System.out.println(driver.baseURL());
        }

        System.out.println("当前线程上下文类加载器 : " + Thread.currentThread().getContextClassLoader());
        System.out.println("加载ServiceLoader的类加载 : " + load.getClass().getClassLoader());

    }
}
