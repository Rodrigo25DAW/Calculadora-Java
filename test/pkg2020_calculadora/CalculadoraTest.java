package pkg2020_calculadora;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest {

    private int numero1;
    private int numero2;
    private int resultado;

    public CalculadoraTest(int numero1, int numero2, int resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado; //resultado de la operación
    }

    @Parameters
    public static Collection<Object[]> numeros() {
        return Arrays.asList(new Object[][]{
            {20, 10, 2}, {30, -2, -15}, {5, 2, 3}});
    }

    @Test
    public void testDivide() {
        Calculadora calcu = new Calculadora(numero1, numero2);
        int resultadoCalculo = calcu.divide();
        assertEquals(resultado, resultadoCalculo);
    }
}
