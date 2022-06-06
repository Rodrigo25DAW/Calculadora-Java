package pkg2020_calculadora;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTestBA {

    public CalculadoraTestBA() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    public class CalculadoraTest {

        private Calculadora calculadora;
        private int resultado;

        @Before
        public void creaCalculadora() {
            calculadora = new Calculadora(20, 10);
        }

        @After
        public void borraCalculadora() {
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
}
