package dev.andreina.ex_bmi_calculator;

public class BmiModel {
    // Calcular el IMC en función de los datos de la persona
    private Person person; // instancia: creo un objeto a partir de una clase (la clase Person)

    // Cear el constructor
    public BmiModel (Person person) {
        this.person= person;

    }

    //Dos metodos
    //1. calculateBMI()
    public double calculateBMI() {
    double weight = person.getWeight();
    double height= person.getHeight();
    double bmi = weight / Math.pow(height,2);

    return  bmi; // Mat.pow calcula la potencia peso/altura b:2 es elevado a la dos : BMI = weight / height2

}


    //2. giveResults()
    public String giveResults(double bmi) {

        if (bmi <16) {
            return "Severe thinness";
        }

        else if  (bmi <17) {
            return "Moderate thinness";

        }

        else if  (bmi <18.5) {
            return "Mild thinness";

        } else if  (bmi <25) {
            return "Normal weight";

        }
        else if  (bmi <30) {
            return "Overweight";

        }
        else if  (bmi <35) {
            return "Mild obesity";

        }

        else if  (bmi <40) {
            return "Moderate obesity";

        }
        else {
            return "Morbid obesity";

        }
        
        

        


    }



}
