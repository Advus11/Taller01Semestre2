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
        if (!existeCorreoElectronico(deportista.getCorreoElectronico())) {
            deportistas.add(deportista);
            return true;
        }
        return false;
    }

    public boolean registrarEntrenador(Entrenador entrenador) {
        if (!existeCorreoElectronico(entrenador.getCorreoElectronico())) {
            entrenadores.add(entrenador);
            return true;
        }
        return false;
    }

    public void crearEquipo(Equipo equipo, List<Deportista> jugadores, Entrenador entrenador) {
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
                System.out.println("Estadísticas del jugador: " + deportista.getNombre() + " " + deportista.getApellido() + " " + deportista.getPosicion() + " " + deportista.getTipoDeporte() + " " + deportista.getNumeroContacto() + " " + deportista.getCorreoElectronico());
                return;
            }
        }
        System.out.println("No se encontró un jugador con el correo electrónico proporcionado.");
    }

    public void estadisticasEquipo(String nombreEquipo) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombreEquipo)) {
                System.out.println("Estadísticas del equipo: " + equipo.getNombre() + " " + equipo.getEntrenador() + " " + equipo.getJugadores());
                return;
            }
        }
        System.out.println("No se encontró un equipo con el nombre proporcionado.");
    }

    public void mostrarTodosDeportistas() {
        System.out.println("Lista de todos los deportistas:");
        for (Deportista deportista : deportistas) {
            System.out.println("Nombre: " + deportista.getNombre());
            System.out.println("Apellido: " + deportista.getApellido());
            System.out.println("Correo: " + deportista.getCorreoElectronico());
            System.out.println("Número de contacto: " + deportista.getNumeroContacto());
            System.out.println("Tipo de deporte: " + deportista.getTipoDeporte());
            System.out.println("Posición: " + deportista.getPosicion());
            System.out.println();
        }
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

