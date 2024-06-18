package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static at.fhj.msd.Main.logger;

public class Calculator {



    public double add (double number1, double number2){
        logger.debug("Called add() with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1+number2;
    }
    public double minus (double number1, double number2){
        logger.debug("Called minus() with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1-number2;
    }
    public double divide (double number1, double number2) throws ArithmeticException{
        logger.debug("Called divide() with parameters: number1 = {}, number2 = {}", number1, number2);
        if (number2 == 0) {
            logger.error("Division by zero attempted with number1 = {}, number2 = {}", number1, number2);
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return number1 / number2;
    }
    public double multiply (double number1, double number2){
        logger.debug("Called multiply() with parameters: number1 = {}, number2 = {}", number1, number2);
        return number1*number2;
    }

    public int factorial(int number){
        logger.debug("Called factorial() with parameter: number = {}", number);
        int result=1;
        if (number<0){
            return 0;
        }
        if (number==0){
            return 1;
        }

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
