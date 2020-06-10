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
     * Inializa cada casilla de la ruleta con un valor al azar
     * @param numeroCasillas Número de casillas que tendrá la ruleta
     */
    public void inicializarRueda(int numeroCasillas){
        if(numeroCasillas<4 || numeroCasillas>100){
            System.out.println("Error: número de casillas no válido");
        }

        else{
            casillas = new int[numeroCasillas];
            System.out.println("La ruleta tiene los siguientes números: ");

            // Llena las casillas con números al azar y muestra los números
            for(int i=0; i<numeroCasillas; i++){
                casillas[i] = randomInt();
                System.out.print(casillas[i] + " ");
            }

            System.out.println("");
        }
    }

    /**
     * Retorna un int al azar
     * @return Número al azar
     */
    public int randomInt(){
        Random num = new Random();
        return num.nextInt();
    }

    /**
     * Método para lanzar la rueda y obtener el puntaje de una casilla
     * @return Puntaje obtenido
     */
    public int lanzarRueda(){
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
