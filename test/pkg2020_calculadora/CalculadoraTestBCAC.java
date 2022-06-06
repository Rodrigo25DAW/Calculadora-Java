package pkg2020_calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTestBCAC {

    private static Calculadora calculadora;
    private int resultado;

    @BeforeClass
    public static void creaCalculadora() {
        calculadora = new Calculadora(20, 10);
    }

    @AfterClass
    public static void borraCalculadora() {
        calculadora = null;
    }

    @Test
    public void testSuma() {
        resultado = calculadora.suma();
        assertEquals(30, resultado);
    }

    @Test
    public void testResta() {
        resultado = calculadora.resta();
        assertEquals(10, resultado);
    }

    @Test
    public void testMultiplica() {
        resultado = calculadora.multiplica();
        assertEquals("Fallo en la multiplicación: ", 200, resultado);
    }

    @Test
    public void testDivide() {
        resultado = calculadora.divide();
        assertEquals(2, resultado);
    }
}


