package dev.andreina.ex_bmi_calculator;

import java.util.Scanner;

public class BMIView {
    // 1. Pedir datos al usuario weight y height:
    //askWeight
    //askHeight

    private Scanner scanner = new Scanner(System.in); // scanner muestra en consola

    public double askWeight() {
        System.out.println("Enter your weight in kilograms");
        return scanner.nextDouble(); // netDouble() trae el valor input
    }

    public double askHeight() {
        System.out.println("Enter your height in meters");
        return scanner.nextDouble(); // netDouble() trae el valor input
    }

    //2. Mostrar los resultados: bmi el calculo que esta en BMIModel, clasification es clasificación de la tabla bmi
    public void showResults (double bmi, String classification) {
        //Devuelve el valor del bmi calculado
        System.out.printf("Your BMI is: %.2f\n\n",bmi);

        //Devuelve el rango/la clasificación de la tabla bmi
        System.out.println("Your BMI is:"+ classification);
        
    }

    
}