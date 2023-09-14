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
    public void setJugadores(List<Deportista> jugadores) {
        this.jugadores = jugadores;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEntrenador() {
        return entrenador.getNombre() + " " + entrenador.getApellido();
    }
    public List<Deportista> getJugadores() {
        return jugadores;
    }

}