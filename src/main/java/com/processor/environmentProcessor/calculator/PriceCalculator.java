package com.processor.environmentProcessor.calculator;

public interface PriceCalculator {

    /**
     * 计算
     * @param singlePrice 单价
     * @param quantity    数量
     * @return
     */
    public double calculate(double singlePrice, int quantity);
}
