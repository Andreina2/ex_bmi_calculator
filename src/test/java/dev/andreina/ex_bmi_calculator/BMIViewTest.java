package dev.andreina.ex_bmi_calculator;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

public class BMIViewTest {
    @Test
    void testAskHeight() {
        String heightValue= "1.7\n"; // simula que el usuario ingresa 1.7 de altura
        System.setIn(new ByteArrayInputStream(heightValue.getBytes())); // se utiliza para simular la entrada de datos por teclado(consola) en un programa que usa un Scanner para leer desde System.in

        BMIView bmiView = new BMIView();
        double height= bmiView.askHeight();

        assertEquals(1.7, height);


    }

    @Test
    void testAskWeight() {
        String weightValue= "72\n";
        System.setIn(new ByteArrayInputStream(weightValue.getBytes()));

        BMIView bmiView = new BMIView();
        double weight= bmiView.askWeight();

        assertEquals(72, weight);

    }


}
