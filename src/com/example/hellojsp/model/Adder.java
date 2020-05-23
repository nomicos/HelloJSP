package com.example.hellojsp.model;

public class Adder implements CalculatorStrategy {

  @Override
  public int calculate(int a, int b) {
    return a + b;
  }

}
