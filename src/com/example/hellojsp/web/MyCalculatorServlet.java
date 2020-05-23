package com.example.hellojsp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyCalculatorServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    final String operation = req.getParameter("operation");
    final int numberOne = Integer.parseInt(req.getParameter("number_one"));
    final int numberTwo = Integer.parseInt(req.getParameter("number_two"));

    PrintWriter out = resp.getWriter();
    out.println("The servlet's got your parameters: <" + operation + ", " + numberOne + ", " + numberTwo + ">.");

    // TODO: Implement calculator logic and return the result in the response.
    // TODO: Implement division and handle the case for number_two == 0.
  }

}
