package main.calculation.operations;

import java.math.BigDecimal;

public class Division implements CalculationOperation {
    private BigDecimal left;
    private BigDecimal right;
    private BigDecimal result;

    public Division() {}

    @Override
    public void setting(BigDecimal l, BigDecimal r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public void calc() {
        try {
            result = left.divide(right);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
