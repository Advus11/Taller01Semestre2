import java.util.ArrayList;
import java.util.List;
public class Equipo {
    private String nombre;
    private List<Deportista> jugadores;
    private Entrenador entrenador;
    private List<Partido> historialPartidos;

    public Equipo(String nombre, Entrenador entrenador) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.entrenador = entrenador;
        this.historialPartidos = new ArrayList<>();
    }

}