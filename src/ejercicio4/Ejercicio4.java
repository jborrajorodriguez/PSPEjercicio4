
package ejercicio4;

/**
 *
 * @author Juan Borrajo Rodriguez
 */
public class Ejercicio4 {

    
    public static void main(String[] args) {
        HiloPar hp=new HiloPar("Pares");
        hp.start();
        HiloImpar hi=new HiloImpar("Impares");
        hi.start();
        Hilo2y3 h23=new Hilo2y3("H2-3");
        h23.start();
    }

}
