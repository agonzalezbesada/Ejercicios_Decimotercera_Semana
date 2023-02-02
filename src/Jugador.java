public class Jugador extends Entidad{
    private int experiencia;
    private int nivel;

    Jugador() {

    }



    Jugador(String nombre, int vida, int ataque, int defensa, int experiencia, int nivel) {
        super(nombre, vida, ataque, defensa);
        this.experiencia=experiencia;
        this.nivel=nivel;
    }


    @Override
    public int turno(int accion) {
        int resultado = 0;
        switch (accion) {
            case 0:
                resultado = getAtaque()*nivel;
                return resultado;

            case 1:
                resultado = getDefensa()*nivel;
                return resultado;

            default:
                return resultado;
        }
    }
}
