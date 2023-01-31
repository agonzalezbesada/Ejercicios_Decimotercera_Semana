public class Jugador extends Entidad{
    private int experiencia = 50;
    private int nivel = 6;

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
