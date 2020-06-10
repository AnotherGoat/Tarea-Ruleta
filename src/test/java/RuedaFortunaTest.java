import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RuedaFortunaTest {

    /**
     * Objeto de clase RuedaFortuna para realizar los test
     */
    RuedaFortuna rf;

    @Before
    public void setUp() throws Exception {
        rf = new RuedaFortuna(); // Crea una nueva instancia
    }

    @After
    public void tearDown() throws Exception {
        rf = null; // Libera memoria
    }

    /**
     * Muestra los errores en caso de ingresar un numero de casillas mayor que 100 o mmenor que 4
     */
    @Test
    public void inicializarRueda1() {
        rf.inicializarRueda(3);
        rf.inicializarRueda(101);
    }

    /**
     * Verifica que funciona bien cuando se ingresa un número válido
     */
    @Test
    public void inicializarRueda2(){
        rf.inicializarRueda (5);
        rf.inicializarRueda (20);
    }

    @Test
    public void randomInt() {
    }

    /**
     * Revisa que el puntaje obtenido pertenece al arreglo de casillas
     */
    @Test
    public void lanzarRueda1() {
        rf.inicializarRueda(4);
        boolean funciona = false;
        int resultado = rf.lanzarRueda();

        // Revisa que coincida con una de las casillas de la ruleta
        for(int i=0; i<rf.getCasillas().length; i++) {
            if (resultado == rf.getCasillas()[i]) {
                funciona = true;
            }
        }

        assertTrue(funciona);
    }

    @Test
    public void randomEntre() {
    }
}