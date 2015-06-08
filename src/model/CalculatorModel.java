package model;

public class CalculatorModel {
    private double value1 = 0;
    private double value2 = 0;
    private double result = 0;

    public double getValue1() {
        return value1;
    }
    public void setValue1(double value1) {
        this.value1 = value1;
    }
    public double getValue2() {
        return value2;
    }
    public void setValue2(double value2) {
        this.value2 = value2;
    }
    public double getResult() {
        return result;
    }
    public void add() {
        result = value1 + value2;
    }
    public void subtract() {
        result = value1 - value2;
    }
    public void multiply() {
        result = value1 * value2;
    }
    public void divide() {
        result = value1 / value2;
    }
    public void power() {
        result = Math.pow(value1, value2);
    }
    public void radix(){
        result = Math.pow(value1, 1 / value2);
    }
    public void percentage(){
        result = value1 * (value2 / 100);
    }
}
