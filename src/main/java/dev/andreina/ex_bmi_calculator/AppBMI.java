package dev.andreina.ex_bmi_calculator;

/**
 * Hello world!
 */
public final class AppBMI {
    public static void main(String[] args) {
        System.out.println("                         ");
        System.out.println("Welcome to BMI calculator");
        System.out.println("-------------------------");
        System.out.println("                         ");

         //Instancias necesarias
        BMIView bmiView= new BMIView();
        
        //Lanzamos el método que activa el flujo de la aplicación
        double weight= bmiView.askWeight();
        double height= bmiView.askHeight();
        Person person= new Person(weight, height);

        BmiModel bmiModel= new BmiModel(person);

        BMIController bmiController= new BMIController(person, bmiModel, bmiView);
        bmiController.makeCalculate();
        
        
    }
}

