package AudioModelos;

public class Podcast extends Audio {
    private String episodio;
    private String descripcion;

    @Override
    public int getCalificacion() {
        if (getTotalReproducciones() > 2000) {
            return 10;
        } else {
            return 3;
        }
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
