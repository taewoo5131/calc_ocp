package main.calculation;

import main.calculation.operations.Addition;
import main.calculation.operations.CalculationOperation;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {
    static BigDecimal l;
    static BigDecimal r ;
    static String opp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextBigDecimal();
        opp = scanner.next();
        r = scanner.nextBigDecimal();

        CalculationOperation operationClass = getOperationClass(opp);
        calcResultPrint(operationClass);
    }

    public static void calcResultPrint(CalculationOperation calculationOperation) {
        calculationOperation.setting(l,r);
        calculationOperation.calc();
    }

    public static CalculationOperation getOperationClass(String opperation) {
        switch (opperation){
            case "+":
                return OperationKind.ADDITION.getCalculationOperation();
            case "-":
                return OperationKind.SUBTRACTION.getCalculationOperation();
            case "*":
                return OperationKind.MULTIPLICATION.getCalculationOperation();
            case "/":
                return OperationKind.DIVISION.getCalculationOperation();
        }
        return null;
    }

}
