package at.fhj.msd;

public class Main {



    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add: "+calculator.add(28, 2));
        System.out.println("Distract: "+calculator.minus(28, 2));
        System.out.println("Divide: "+calculator.divide(28, 2));
        System.out.println("Multiply: "+calculator.multiply(28, 2));

    }
}
