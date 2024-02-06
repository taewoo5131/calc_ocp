package main.calculation.operations;

import java.math.BigDecimal;

public class Addition implements CalculationOperation {
    private BigDecimal left;
    private BigDecimal right;
    private BigDecimal result;

    public Addition() {}

    @Override
    public void setting(BigDecimal l, BigDecimal r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public void calc() {
        result = left.add(right);
        System.out.println(result);
    }
}
