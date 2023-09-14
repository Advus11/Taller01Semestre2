import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorClubDeportivo gestor = new GestorClubDeportivo();

        // Crear deportistas y entrenadores
        Deportista deportista1 = new Deportista("Adonis", "Subiabre", "correo1@example.com", "123456789", "Fútbol", "Delantero");
        Deportista deportista2 = new Deportista("Ana", "Perez", "correo2@example.com", "987654321", "Baloncesto", "Base");
        Entrenador entrenador1 = new Entrenador("Marcelo", "Bielsa", "entrenador1@example.com", "555555555", "Fútbol", "Entrenador", 10, "Táctica");

        // Registrar deportistas y entrenadores
        boolean registrado1 = gestor.registrarDeportista(deportista1);
        boolean registrado2 = gestor.registrarDeportista(deportista2);
        boolean registradoEntrenador = gestor.registrarEntrenador(entrenador1);

        if (registrado1) {
            System.out.println("Deportista 1 registrado correctamente.");
        }
        if (registrado2) {
            System.out.println("Deportista 2 registrado correctamente.");
        }
        if (registradoEntrenador) {
            System.out.println("Entrenador registrado correctamente.");
        }

        // Crear equipo
        Equipo equipo1 = new Equipo("Equipo1", entrenador1);
        gestor.crearEquipo(equipo1, List.of(deportista1, deportista2), entrenador1);

        // Registrar partido
        Partido partido1 = new Partido(equipo1, "Ganado", new Date(), "Estadio A");
        gestor.registrarPartido(partido1);

        // Estadísticas de jugador
        gestor.estadisticasJugador("correo1@example.com");

        // Estadísticas de equipo
        gestor.estadisticasEquipo("Equipo1");

        // Mostrar todos los deportistas
        gestor.mostrarTodosDeportistas();
    }
}
