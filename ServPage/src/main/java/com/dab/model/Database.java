package com.dab.model;

import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public List<EmployeeModel> getAllEmployeeModels(){
        List<EmployeeModel> employeeModels = new ArrayList<>();
        FactoryConnection con = new FactoryConnection();
        Session session = con.getSessionFactory().openSession();

        Query query = session.createQuery("from EmployeeModel emp");
        employeeModels = query.list();

        return employeeModels;
    }
}