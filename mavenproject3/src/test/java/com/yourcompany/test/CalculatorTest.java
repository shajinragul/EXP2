package com.yourcompany.test;

import com.yourcompany.Main.Calculator;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    public void addTest() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    private void assertEquals(int i, int result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
