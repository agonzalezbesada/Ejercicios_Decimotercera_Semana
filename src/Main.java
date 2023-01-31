import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner (System.in);


        Jugador jugador1 = new Jugador();
        Enemigo enemigo1 = new Enemigo();

        Entidad [] entidad1 = new Entidad[2];

        entidad1[0] = jugador1;
        entidad1[1] = enemigo1;

        int accion = 0;
        boolean control = true;
        for (int i = 0; i<4;i++) {
            do {
                try {
                    control = true;
                    System.out.println("Jugador, elija sabiamente:"+"\n1. Ataque"+"\n2. Defensa"+"\n3. Pasar");
                    accion = guardar.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Debe elegir una de las opciones"+"\n");
                    control = false;
                }
            } while (!control);

            entidad1[0].turno(accion);

            do {
                try {
                    control = true;
                    System.out.println("Jugador 2 (enemigo), elija sabiamente:"+"\n1. Ataque"+"\n2. Defensa"+"\n3. Pasar");
                    accion = guardar.nextInt();
                } catch (InputMismatchException ex) {
                    System.out.println("Debe elegir una de las opciones");
                    control = false;
                }
            } while (!control);

            entidad1[1].turno(accion);
        }
        /*
        Este tipo de construcciones puede ahorrar una gran cantidad de código, espacio en memória y tiempo del procesador, ya que heredando se reutilizan datos para
        distintos objetos, y no hay que instanciar tantas cosas. Además de que sigue contando con la necesaria encapsulación.
         */

    }
}
