public class Enemigo extends Entidad{
    private int dificultad = 12;

    @Override
    public int turno(int accion) {
        int resultado = 0;
        switch (accion) {
            case 0:
                resultado = getAtaque()*dificultad;
                return resultado;

            case 1:
                resultado = getAtaque()/2;
                return resultado;

            default:
                return resultado;
        }
    }
}
