import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class test{

    @Test
    @DisplayName("la multiplicacion de 2x2 es 4")
    public void test2x2(){
        calculadora calc = new calculadora();
        int resultado = calc.multiplicacion(2,2);
        assertEquals(4, resultado, "2x2=4");
    }

    @Test
    @DisplayName("la division de 2/2 es 1")
    public void test2entre2(){
        calculadora calc=new calculadora();
        int resultado2 = calc.division(2,2);
        assertEquals(1, resultado2, "2/2=1");
    }

}