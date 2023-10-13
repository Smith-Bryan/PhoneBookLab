package pluralsightwork.tdd;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

//    @org.junit.jupiter.api.Test
//    void addTest() {
//        //Given - ARRANGE
//        Calculator calculator = new Calculator();
//        double num1 = 11;
//        double num2 =20;
//        double expected = num1 + num2;
//        //When
//        double actual = calculator.add(num1,num2);
//        //Then - Act
//        Assertions.assertEquals(expected,actual);
//        //Assert
//    }
//    @org.junit.jupiter.api.Test
//    void subtractTest(){
//        Calculator calculator = new Calculator();
//         int expected = 2;
//         int actual = calculator.subtract(5,3);
//         Assertions.assertEquals(expected,actual);
//    }
//    @org.junit.jupiter.api.Test
//    void divideTest(){
//        Calculator calculator = new Calculator();
//        int expected = 4;
//                int actual = calculator.divide(8,2);
//        Assertions.assertEquals(expected,actual);
//    }
//    @org.junit.jupiter.api.Test
//    void exponentsTest(){
//        Calculator calculator = new Calculator();
//        int expected = 4;
//        int actual = calculator.exponents(2,2);
//        Assertions.assertEquals(expected,actual);
//    }
//@org.junit.jupiter.api.Test
//void  checkIfParameterIsNull(){
//    Calculator calculator = new Calculator();
//    Double expected = 0.0;
//    Double actual = calculator.checkIfParameterIsNull(null);
//    Assertions.assertNull(actual);
//}
    @org.junit.jupiter.api.Test
    void  isGreater(){
        Calculator calculator = new Calculator();
       int x = 2, y =5;
        boolean actual = calculator.isGreater(x,y);
        assertFalse(actual);
    }
    @org.junit.jupiter.api.Test
    void  multiplyArrayElementsByNumberGiven(){
        Calculator calculator = new Calculator();
    }
}