package com.example.hellojsp.model;

public class Divider implements CalculatorStrategy {

  @Override
  public int calculate(int a, int b) {
    return a / b;
  }

}
