package com.example.hellojsp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.hellojsp.model.CalculatorStrategy;
import com.example.hellojsp.model.Adder;
import com.example.hellojsp.model.Multiplier;
import com.example.hellojsp.model.Subtractor;

public class MyCalculatorServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    final String operation = req.getParameter("operation");
    final int numberOne = Integer.parseInt(req.getParameter("number_one"));
    final int numberTwo = Integer.parseInt(req.getParameter("number_two"));

    final int result = getCalculator(operation).calculate(numberOne, numberTwo);
    req.setAttribute("result", result);

    final RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
    rd.forward(req, resp);

    // TODO: Implement division and handle the case for number_two == 0.
  }

  private CalculatorStrategy getCalculator(String op) {
    switch(op) {
      case "add": return new Adder();
      case "sub": return new Subtractor();
      case "mul": return new Multiplier();
    }
    throw new IllegalArgumentException("unknown operator");
  }

}
