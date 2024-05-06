package AudioModelos;

public class Canciones extends Audio {
    private String genero;
    private String album;
@Override
    public int getCalificacion() {
        if (getMeGusta() > 5000) {
            return 8;
    }else{
        return 3;
    }  
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }   

    public void setAlbum(String album) {    
        this.album = album;
    }

}
