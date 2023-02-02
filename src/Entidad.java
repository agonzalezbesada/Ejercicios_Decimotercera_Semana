public class Entidad {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;


    Entidad() {

    }

    Entidad(String nombre, int vida, int ataque, int defensa) {
        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;
        this.defensa=defensa;
    }


    Entidad(int vida, int ataque, int defensa) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre=nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida() {
        this.vida=vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque() {
        this.ataque=ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa() {
        this.defensa=defensa;
    }

    public int turno (int accion) {
        int resultado=0;

        return resultado;
    }

    public void info() {

    }

}
