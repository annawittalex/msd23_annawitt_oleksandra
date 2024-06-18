package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    public static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.debug("It is a debug logger.");
        logger.info("It is a info logger.");
        logger.error("It is an error logger.");

        Calculator calculator = new Calculator();
        System.out.println("Add: "+calculator.add(28, 2));
        System.out.println("Distract: "+calculator.minus(28, 2));
        System.out.println("Divide: "+calculator.divide(28, 2));
        System.out.println("Multiply: "+calculator.multiply(28, 2));
        System.out.println("Oleksandra Annawitt");

    }
}
