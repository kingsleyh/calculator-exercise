//package net.masterthought;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Calculator {
//
//    private List<String> history;
//
//    public Calculator() {
//        this.history = new ArrayList<String>();
//    }
//
//    public Integer addition(int firstNumber, int secondNumber) {
//        Integer result = firstNumber + secondNumber;
//        recordHistory("+", firstNumber, secondNumber, result);
//        return result;
//    }
//
//    public Integer subtraction(int firstNumber, int secondNumber) {
//        Integer result = firstNumber - secondNumber;
//        recordHistory("-", firstNumber, secondNumber, result);
//        return result;
//    }
//
//    public Integer multiplication(int firstNumber, int secondNumber) {
//        Integer result = firstNumber * secondNumber;
//        recordHistory("*", firstNumber, secondNumber, result);
//        return result;
//    }
//
//    public Integer division(int firstNumber, int secondNumber) {
//        Integer result = firstNumber / secondNumber;
//        recordHistory("/", firstNumber, secondNumber, result);
//        return result;
//    }
//
//    private void recordHistory(String operator, Integer firstNumber, Integer secondNumber, Integer result) {
//        history.add(String.valueOf(firstNumber) + operator + String.valueOf(secondNumber) + "=" + String.valueOf(result));
//    }
//
//    public String getCalculationHistory() {
//        StringBuffer stringBuffer = new StringBuffer();
//        for (String calculation : history) {
//            stringBuffer.append(calculation);
//            stringBuffer.append(",");
//        }
//        return stringBuffer.toString().replaceAll(",$", "");
//    }
//
//    public void resetCalculationHistory() {
//        history = new ArrayList<String>();
//    }
//}
