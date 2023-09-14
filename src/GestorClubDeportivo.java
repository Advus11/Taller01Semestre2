import java.util.ArrayList;
import java.util.List;

public class GestorClubDeportivo {
    private List<Deportista> deportistas;
    private List<Entrenador> entrenadores;
    private List<Equipo> equipos;
    private List<Partido> partidos;

    public GestorClubDeportivo() {
        this.deportistas = new ArrayList<>();
        this.entrenadores = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
    }

    public boolean registrarDeportista(Deportista deportista) {
        // Validar que el correoElectronico no esté repetido
        if (!existeCorreoElectronico(deportista.getCorreoElectronico())) {
            deportistas.add(deportista);
            return true;
        }
        return false;
    }

    public boolean registrarEntrenador(Entrenador entrenador) {
        // Validar que el correoElectronico no esté repetido
        if (!existeCorreoElectronico(entrenador.getCorreoElectronico())) {
            entrenadores.add(entrenador);
            return true;
        }
        return false;
    }

    public void crearEquipo(Equipo equipo, List<Deportista> jugadores, Entrenador entrenador) {
        // Asignar jugadores y entrenador al equipo
        equipo.setJugadores(jugadores);
        equipo.setEntrenador(entrenador);
        equipos.add(equipo);
    }

    public void registrarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void estadisticasJugador(String correoElectronico) {
        for (Deportista deportista : deportistas) {
            if (deportista.getCorreoElectronico().equals(correoElectronico)) {
                // Mostrar estadísticas del jugador
                // Implementa la lógica según tus necesidades
                System.out.println("Estadísticas del jugador: " + deportista.getNombre() + " " + deportista.getApellido());
                return;
            }
        }
        System.out.println("No se encontró un jugador con el correo electrónico proporcionado.");
    }

    public void estadisticasEquipo(String correoEntrenador) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreoElectronico().equals(correoEntrenador)) {
                // Mostrar estadísticas del equipo del entrenador
                // Implementa la lógica según tus necesidades
                System.out.println("Estadísticas del equipo del entrenador: " + entrenador.getNombre() + " " + entrenador.getApellido());
                return;
            }
        }
        System.out.println("No se encontró un entrenador con el correo electrónico proporcionado.");
    }

    private boolean existeCorreoElectronico(String correoElectronico) {
        for (Deportista deportista : deportistas) {
            if (deportista.getCorreoElectronico().equals(correoElectronico)) {
                return true;
            }
        }
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreoElectronico().equals(correoElectronico)) {
                return true;
            }
        }
        return false;
    }
}

