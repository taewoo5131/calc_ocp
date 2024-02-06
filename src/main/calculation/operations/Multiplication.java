package main.calculation.operations;

import java.math.BigDecimal;

public class Multiplication implements CalculationOperation {
    private BigDecimal left;
    private BigDecimal right;
    private BigDecimal result;

    public Multiplication() {}

    @Override
    public void setting(BigDecimal l, BigDecimal r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public void calc() {
        result = left.multiply(right);
        System.out.println(result);
    }
}
