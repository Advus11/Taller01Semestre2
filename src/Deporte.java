import java.util.ArrayList;
import java.util.List;
public class Deporte {
    private String nombre;
    private List<Equipo> equipos;

    public Deporte(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

}
