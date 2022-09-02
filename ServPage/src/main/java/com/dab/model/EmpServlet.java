package com.dab.model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class EmpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("-----------------------");
        System.out.println("  Welcome to Servlet  ");
        System.out.println("-----------------------");

        Database db = new Database();
        List<EmployeeModel> getEmployeeModels = db.getAllEmployeeModels();

        req.setAttribute("employees", getEmployeeModels);
        RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        rd.forward(req, resp);

    }
}
