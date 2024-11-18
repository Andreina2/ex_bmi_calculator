package dev.andreina.ex_bmi_calculator;

public class Person {
    //1 Atributos de la clase: weight and height; los datos son privados, por lo tanto creo los métodos getter y setter
    private double weight;
    private double height;

    
    //Creamos el constructor
    //Construir un objeto de tipo Persona, con los atributos weight and height
    public Person (double weight, double height) {
        this.weight= weight;
        this.height= height;


    }

    //Getters and setters

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }


}
