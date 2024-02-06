package main.calculation.operations;

import java.math.BigDecimal;

public class Subtraction implements CalculationOperation {
    private BigDecimal left;
    private BigDecimal right;
    private BigDecimal result;

    public Subtraction() {}

    @Override
    public void setting(BigDecimal l, BigDecimal r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public void calc() {
        result = left.subtract(right);
        System.out.println(result);
    }
}
