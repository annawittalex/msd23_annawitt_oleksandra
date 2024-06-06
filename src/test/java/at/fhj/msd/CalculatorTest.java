package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    //---------------Testing add() method----------//
    @DisplayName("Testing add1() method") @Test
    void testAdd1(){
        assertEquals(5, calc.add(2,3)); }
    @DisplayName("Testing add2() method") @Test
    void testAdd2(){
        assertEquals(1, calc.add(-5,6)); }
    @DisplayName("Testing add3() method") @Test
    void testAdd3(){
        assertEquals(-7, calc.add(-5,-2)); }


    //---------------Testing minus() method----------//
    @DisplayName("Testing minus1() method") @Test
    void testMinus1(){
        assertEquals(2, calc.minus(5,3)); }
    @DisplayName("Testing minus2() method") @Test
    void testMinus2(){
        assertEquals(-3, calc.minus(-5,-2)); }
    @DisplayName("Testing minus3() method") @Test
    void testMinus3(){
        assertEquals(-7, calc.minus(-4,3)); }

    //---------------Testing divide() method----------//
    @DisplayName("Testing divide1() method") @Test
    void testDivide1(){
        assertEquals(4, calc.divide(12,3)); }
    @DisplayName("Testing divide2() method") @Test
    void testDivide2(){
        assertEquals(-5, calc.divide(-10,2)); }

    @DisplayName("Testing divide3() method") @Test
    void testDivide3() {
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }


    //---------------Testing multiply() method----------//
    @DisplayName("Testing multiply1() method") @Test
    void testMultiply1(){
        assertEquals(6, calc.multiply(2, 3)); }
    @DisplayName("Testing multiply2() method") @Test
    void testMultiply2(){
        assertEquals(-6, calc.multiply(-2, 3)); }
    @DisplayName("Testing multiply3() method") @Test
    void testMultiply3(){
        assertEquals(8, calc.multiply(-2, -4)); }

    @DisplayName("Testing factorial1() method")
    @Test
    void testFactorial1() {
        assertEquals(120, calc.factorial(5));
    }
    @DisplayName("Testing factorial2() method")
    @Test
    void testFactorial2() {
        assertEquals(720, calc.factorial(6));
    }
    @DisplayName("Testing factorial3() method")
    @Test
    void testFactorial3() {
        assertEquals(0, calc.factorial(-3));
    }





}
