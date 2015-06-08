package controller;

import model.CalculatorModel;
import util.CalculatorBean;
import util.CalculatorOperation;

public class MainController {
    private CalculatorModel model;
    
    public MainController() {
        model = new CalculatorModel();
    }
    
    public CalculatorBean performAction(
            CalculatorBean calculatorData,
            CalculatorOperation operation) {
        
        model.setValue1(calculatorData.getValue1());
        model.setValue2(calculatorData.getValue2());
        
        switch (operation) {
            case ADD:
                model.add();
                break;
            case SUBTRACT:
                model.subtract();
                break;
            case MULTIPLY:
                model.multiply();
                break;
            case DIVIDE:
                model.divide();
                break;
            case POWER:
                model.power();
                break;
            case RADIX:
                model.radix();
                break;
            case PERCENTAGE:
                model.percentage();
                break;
        }
        
        calculatorData.setValue1(model.getValue1());
        calculatorData.setValue2(model.getValue2());
        calculatorData.setResult(model.getResult());
        
        return calculatorData;
    }
}
