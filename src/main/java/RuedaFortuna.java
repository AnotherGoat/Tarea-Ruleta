import java.util.Random;

public class RuedaFortuna {

    //// Atributos
    /**
     * Casillas de la ruleta
     */
    private int[] casillas;

    //// Constructores
    public RuedaFortuna() {
    }

    //// Métodos
    /**
     * <p>Inicializa cada casilla de la ruleta con un valor al azar</p>
     * <p>Este valor será un múltiplo de 100 entre 100 y 10000</p>
     * @param numeroCasillas Número de casillas que tendrá la ruleta
     */
    public void inicializarRueda(int numeroCasillas){
        if(numeroCasillas<4 || numeroCasillas>100){
            System.out.println("Error: número de casillas debe estar entre 4 y 100");
        }

        else{
            casillas = new int[numeroCasillas];
            System.out.println("La ruleta tiene "+numeroCasillas+" números: ");

            // Llena las casillas con números al azar y muestra los números
            for(int i=0; i<numeroCasillas; i++){
                casillas[i] = randomEntre(1, 100)*100; // Múltiplo de 100 entre 100 y 10000
                System.out.print("["+casillas[i]+"] ");
            }

            System.out.print("\n");
        }
    }

    /**
     * Método para lanzar la rueda y obtener el puntaje de una casilla
     * @return Puntaje obtenido
     */
    public int lanzarRueda(){
        if(casillas == null){
            return -1;
        }

        int puntajeObtenido = casillas[randomEntre(0 , casillas.length-1)];
        System.out.println("Ha obtenido "+puntajeObtenido+" puntos");
        return puntajeObtenido;
    }

    /**
     * Retorna un número al azar entre el rango ingresado
     * @param min Valor mínimo del número al azar
     * @param max Valor máximo del número al azar
     * @return Número al azar
     */
    public int randomEntre(int min, int max){
        Random num = new Random();
        return min + num.nextInt(max-min);
    }

    // Getters y Setters
    public int[] getCasillas() {
        return casillas;
    }
}
