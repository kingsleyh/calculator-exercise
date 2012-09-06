package net.masterthought;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbersTogether() {
        Calculator calculator = new Calculator();
        Integer actualResult = calculator.addition(1, 5);
        assertThat(actualResult, is(6));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        Calculator calculator = new Calculator();
        Integer actualResult = calculator.subtraction(10, 5);
        assertThat(actualResult, is(5));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        Integer actualResult = calculator.multiplication(3, 5);
        assertThat(actualResult, is(15));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        Calculator calculator = new Calculator();
        Integer actualResult = calculator.division(10, 2);
        assertThat(actualResult, is(5));
    }

    @Test
    public void shouldRecordHistoryOfAllCalculations() {
        Calculator calculator = new Calculator();
        calculator.addition(1, 1);
        calculator.subtraction(10, 1);
        String history = calculator.getCalculationHistory();
        assertThat(history, is("1+1=2,10-1=9"));
    }

    @Test
    public void shouldResetHistoryOfAllCalculations() {
        Calculator calculator = new Calculator();
        calculator.addition(1, 1);
        calculator.subtraction(10, 1);
        calculator.resetCalculationHistory();
        String history = calculator.getCalculationHistory();
        assertThat(history, is(""));
    }

}
