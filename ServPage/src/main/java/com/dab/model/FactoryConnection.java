package com.dab.model;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConnection {

    private static SessionFactory factory;

    public FactoryConnection(){}

    public static SessionFactory getSessionFactory(){
        if(factory == null){
            Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");
            factory = config.buildSessionFactory();
        }
        return factory;
    }
}