package lab5p2_víctorromero;

public class Personajes {

    private String nombre;
    private String poder;
    private String debilidad;
    private String universo;
    private int fuerza;
    private int agilidadFisica;
    private int agilidadMental;
    private int vida;

    public Personajes() {
    }

    public Personajes(String nombre, String poder, String debilidad, String universo, int fuerza, int agilidadFisica, int agilidadMental, int vida) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return ">> " + nombre + " <<\n"
                + "Poder -> " + poder + "\n"
                + "Debilidad -> " + debilidad + "\n"
                + "Universo -> " + universo + "\n"
                + "Fuerza -> " + fuerza + "\n"
                + "Agilidad Fisica -> " + agilidadFisica + "\n"
                + "Agilidad Mental -> " + agilidadMental + "\n"
                + "Vida=" + vida + "\n"
                + "____________________________________________________";
    }

}
