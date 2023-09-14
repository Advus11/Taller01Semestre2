public class Baloncesto extends Deporte {
    private String tipoCancha;
    private int numTiempoJugado;

    public Baloncesto(String nombre, String tipoCancha, int numTiempoJugado) {
        super(nombre);
        this.tipoCancha = tipoCancha;
        this.numTiempoJugado = numTiempoJugado;
    }

}
