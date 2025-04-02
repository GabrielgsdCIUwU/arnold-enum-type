package edu.estatuas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArnoldMain {
    public static void main(String[] args) {

        System.out.println("Welcome to the Arnold Schwarzenegger weight calculator!");
        System.out.println("You will be able to calculate your weight on different planets in the solar system.");


        System.out.println("Please enter your weight on Earth in kg: ");
        
        double peso = tryGetPeso();        


        for (Planeta planeta : Planeta.values()) {
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
        
        System.out.println("\nYour weight only on the terrestrial planets: ");
        for (Planeta planeta : Planeta.getPlanetasTerrestres()) {
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }

        System.out.println("\nYour weight only on the gas giant planets: ");
        for (Planeta planeta : Planeta.getGigantesGaseosos()) {
            System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
        }
        
    }
    private static double tryGetPeso() {
        Scanner in = new Scanner(System.in);
        try {
            return in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            return tryGetPeso();
        } finally {
            in.close();
        }
    }
}
