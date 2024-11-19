package dev.andreina.ex_bmi_calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BmiModelTest {
    @Test
    public void testCalculateBMI() {

        Person person = new Person(65, 1.6);

        BmiModel bmiModel = new BmiModel(person);

        double expectedValue = 25.39;
        double actualValue = bmiModel.calculateBMI();

        assertEquals(expectedValue, actualValue, 0.01);



    }

    @Test
    void testGiveResults() {

        Person person = new Person(0, 0);

        BmiModel bmiModel = new BmiModel(person);
        
        assertEquals("Severe thinness", bmiModel.giveResults(15));
        assertEquals("Moderate thinness", bmiModel.giveResults(16));
        assertEquals("Mild thinness", bmiModel.giveResults(17));
        assertEquals("Normal weight", bmiModel.giveResults(24));
        assertEquals("Overweight", bmiModel.giveResults(29));
        assertEquals("Mild obesity", bmiModel.giveResults(34));
        assertEquals("Moderate obesity", bmiModel.giveResults(39));
        assertEquals("Morbid obesity", bmiModel.giveResults(40));

    }

}
