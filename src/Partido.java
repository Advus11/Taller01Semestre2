import java.util.Date;
public class Partido {
    private Equipo equipoOponente;
    private String resultado;
    private Date fecha;
    private String lugarJugado;

    public Partido(Equipo equipoOponente, String resultado, Date fecha, String lugarJugado) {
        this.equipoOponente = equipoOponente;
        this.resultado = resultado;
        this.fecha = fecha;
        this.lugarJugado = lugarJugado;
    }

}
