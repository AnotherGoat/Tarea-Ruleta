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
     * Muestra los errores en caso de ingresar un numero de casillas mayor que 100 o menor que 4
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

    /**
     * Revisa en caso de que por algún motivo el arreglo de casillas sea nulo (lanzar rueda retorna -1 en ese caso)
     */
    @Test
    public void lanzarRueda1(){
        assertEquals(-1, rf.lanzarRueda());
    }

    /**
     * Revisa que el puntaje obtenido pertenece al arreglo de casillas
     */
    @Test
    public void lanzarRueda2() {
        boolean funciona = false;
        rf.inicializarRueda(4); // Inicia la rueda
        int resultado = rf.lanzarRueda();

        // Revisa que coincida con una de las casillas de la ruleta
        for(int i=0; i<rf.getCasillas().length; i++) {
            if (resultado == rf.getCasillas()[i]) {
                funciona = true;
                break;
            }
        }
        assertTrue(funciona);
    }

    /**
     * Revisa que el int aleatorio esté entre el rango ingresado (lo repite varias veces para asegurarse)
     */
    @Test
    public void randomEntre1() {
        for(int i=0; i<100; i++){
            int num = rf.randomEntre(1, 100);
            System.out.print(num + " ");
            assertTrue(num>=1 && num <= 100);
        }
    }
}