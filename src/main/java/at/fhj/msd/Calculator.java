package at.fhj.msd;

public class Calculator {

    public double add (double number1, double number2){
        return number1+number2;
    }
    public double minus (double number1, double number2){
        return number1-number2;
    }
    public double divide (double number1, double number2) throws ArithmeticException{
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return number1 / number2;
    }
    public double multiply (double number1, double number2){
        return number1*number2;
    }

    public int factorial(int number){
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
