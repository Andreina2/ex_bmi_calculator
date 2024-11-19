package dev.andreina.ex_bmi_calculator;



// El controller hará de intermedio entre el modelo y la vista. Controlará el flujo de datos

public class BMIController {
    private Person person;
    private BmiModel bmiModel;
    private BMIView bmiView;




    public BMIController (Person person, BmiModel bmiModel, BMIView bmiView ) {
        this.person= person;
        this.bmiModel= bmiModel;
        this.bmiView= bmiView;



    }

    public void makeCalculate() {

        double bmi= bmiModel.calculateBMI();

        String classification= bmiModel.giveResults(bmi);

        bmiView.showResults(bmi, classification);


    }

}