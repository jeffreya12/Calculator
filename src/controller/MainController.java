package controller;

import model.CalculatorModel;
import util.CalculatorBean;
import util.CalculatorOperation;

public class MainController
{
    private CalculatorModel model;
    
    public MainController()
    {
        this.model = new CalculatorModel();
    }
    
    public CalculatorBean performAction(CalculatorBean pCalculatorData,
                                        CalculatorOperation pOperation)
    {
        this.model.setValue1(pCalculatorData.getValue1());
        this.model.setValue2(pCalculatorData.getValue2());
        
        switch (pOperation)
        {
            case ADD:
                this.model.add();
                break;
            case SUBTRACT:
                this.model.subtract();
                break;
            case MULTIPLY:
                this.model.multiply();
                break;
            case DIVIDE:
                this.model.divide();
                break;
            case POWER:
                this.model.power();
                break;
            case RADIX:
                this.model.radix();
                break;
            case PERCENTAGE:
                this.model.percentage();
                break;
        }
        
        pCalculatorData.setValue1(this.model.getValue1());
        pCalculatorData.setValue2(this.model.getValue2());
        pCalculatorData.setResult(this.model.getResult());
        
        return pCalculatorData;
    }
}
