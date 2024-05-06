import AudioModelos.Canciones;
import AudioModelos.MisFavoritos;
import AudioModelos.Podcast;

public class App {
    public static void main(String[] args) throws Exception {
        
        Canciones cancion = new Canciones();
        cancion.setNombre("Holyday");
        cancion.setGenero("Rock");

        Podcast podcast = new Podcast();
        podcast.setNombre ("Anyone can build wealth");
        podcast.setEpisodio("Episodio 1");
        podcast.setDescripcion("Cualquier persona puede construir la riqueza");
        podcast.setAutor("Dave Ramsey");

        for (int i = 0; i < 100; i++) {
            cancion.meGusta();
    }
        for (int i = 0; i < 5000; i++) {
            cancion.reproduce();
    }

    for (int i = 0; i < 1000; i++) {
        podcast.meGusta();
    }
        for (int i = 0; i < 6000; i++) {
            podcast.reproduce();
    }

    System.out.println("Nombre de la Cancion: " + cancion.getNombre());
    System.out.println("Genero de la Cancion: " + cancion.getGenero());
    System.out.println("Total de Reproducciones: " + cancion.getTotalReproducciones());
    System.out.println("Total de Likes: " + cancion.getMeGusta());

    System.out.println("**************************");
    System.out.println("Episodio: " + podcast.getEpisodio());
    System.out.println("Nombre del Podcast: " + podcast.getNombre());
    System.out.println("Descripcion: " + podcast.getDescripcion());
    System.out.println("Autor: " + podcast.getAutor());
    System.out.println("Total de Reproducciones: " + podcast.getTotalReproducciones());
    System.out.println("Total de Likes: " + podcast.getMeGusta());

    MisFavoritos favoritos = new MisFavoritos();
    favoritos.adiciones(cancion);
    favoritos.adiciones(podcast);


    
    }}
