package calculadoratesting;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author matte
 */
public class Testcalculadoratesting {


    @Test
    public void testSuma(){
        double resultado = Calculadoratesting.suma(2,3);
        double esperado = (double)5.0;               //2 + 3 = 5 pasa
        assertEquals(esperado,resultado,5.0);
    }
    
    @Test
    public void testSuma2(){
        double resultado = Calculadoratesting.suma(-10,-10);
        double esperado =(double) 0.0; //-10 + -20 = -0 pasa
        assertEquals(esperado,resultado,0.0);
    }
    
    @Test
    public void testResta(){
        double resultado = Calculadoratesting.resta(3,2);
        double esperado =(double) 1.0; //3 - 2 = 1 pasa
        assertEquals(esperado,resultado,1.0);
    }
    
    @Test
    public void testResta2(){
        double resultado = Calculadoratesting.resta(4,4);
        double esperado =(double) 0.0; //4 - 6 = -2 pasa
        assertEquals(esperado,resultado,0.0);
    }
    
    @Test
    public void  multiplicacion(){
        double resultado = Calculadoratesting. multiplicacion(3,3);
        double esperado =(double) 9.0; // 3 * 3 = 9 Pasa
        assertEquals(esperado,resultado,9.0);
    }
    @Test
    public void  multiplicacion2(){
        double resultado = Calculadoratesting.multiplicacion(10,0);
        double esperado =(double) 0.0; // 10 * 10 = 100 Pasa
        assertEquals(esperado,resultado,0.0);
    }
    
    @Test
    public void testDivision(){
        float resultado = Calculadoratesting.division(2,2);
        float esperado = (float)1; // 2 / 2 = 1 pasa
        assertEquals(esperado,resultado,1.0);
    }
    
    @Test
    public void testDivision2(){
        float resultado = Calculadoratesting.division(2,4);
        float esperado = (float) 0.5; // 1 / 2 = 0.5 pasa
        assertEquals(esperado,resultado,0.5);
    }
    
    //los casos de pruebas erroneos
    /*
    
    @Test
    public void testDivisionError(){
        float resultado = Calculadoratesting.division(1,2);
        float esperado = 2; // Tiene que tirar Error
        assertEquals(esperado,resultado,0.0);
    }
    
    @Test
    public void multiplicaError(){
        double resultado = Calculadoratesting.multiplicacion(2,2);
        double esperado = 10; // Tiene que tirar error
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testRestaError(){
        double resultado = Calculadoratesting.resta(4,3);
        double esperado = 2; // Tiene que tirar error
        assertEquals(esperado,resultado);
    }
    
    @Test
    public void testSumaError(){
        double resultado = Calculadoratesting.suma(3,4);
        double esperado = 6; // Tiene que tirar Error
        assertEquals(esperado,resultado);
    }
     */
 
    
}
