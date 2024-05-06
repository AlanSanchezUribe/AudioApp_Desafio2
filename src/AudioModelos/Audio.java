package AudioModelos;

public class Audio {
    private String nombre;
    private String autor;
    private int duracion;
    private int calificacion;
    private int totalMeGusta;
    private int totalReproducciones;

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void meGusta() {
        this.totalMeGusta++;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public int getMeGusta() {
        return totalMeGusta;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }   

    public void reproduce() {
        this.totalReproducciones++;
    }

}
