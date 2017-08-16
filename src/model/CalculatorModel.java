package model;

public class CalculatorModel
{
    private double value1;
    private double value2;
    private double result;
    
    public CalculatorModel()
    {
        this.value1 = 0;
        this.value2 = 0;
        this.result = 0;
    }

    public double getValue1()
    {
        return this.value1;
    }
    
    public void setValue1(double value1)
    {
        this.value1 = value1;
    }
    
    public double getValue2()
    {
        return this.value2;
    }
    
    public void setValue2(double value2)
    {
        this.value2 = value2;
    }
    
    public double getResult()
    {
        return this.result;
    }
    
    public void add()
    {
        this.result = this.value1 + this.value2;
    }
    
    public void subtract()
    {
        this.result = this.value1 - this.value2;
    }
    
    public void multiply()
    {
        this.result = this.value1 * this.value2;
    }
    
    public void divide()
    {
        this.result = this.value1 / this.value2;
    }
    
    public void power()
    {
        this.result = Math.pow(this.value1, this.value2);
    }
    
    public void radix()
    {
        this.result = Math.pow(this.value1, 1 / this.value2);
    }
    
    public void percentage()
    {
        this.result = this.value1 * (this.value2 / 100);
    }
}
