package com.example.hellojsp.model;

public class Subtractor implements CalculatorStrategy {

  @Override
  public int calculate(int a, int b) {
    return a - b;
  }

}
