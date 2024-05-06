package AudioModelos;

public class MisFavoritos {
   public void adiciones(Audio audio) {
        if(audio.getCalificacion() >= 8) {
            System.out.println(audio.getNombre() + " Es recomendado para ser Agregado a favoritos");
        }else if (audio.getCalificacion() < 8 && audio.getCalificacion() >= 3) {
            System.out.println(audio.getNombre() + " No es popular pero vale la pena escuchar");
        }else {
            System.out.println(audio.getNombre() + " No es recomendado para ser agregado a favoritos");
        }
    }
}
