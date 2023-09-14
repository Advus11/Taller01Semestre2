public class Tenis extends Deporte {
    private String tipoSuperficie;
    private String tipoPartido;

    public Tenis(String nombre, String tipoSuperficie, String tipoPartido) {
        super(nombre);
        this.tipoSuperficie = tipoSuperficie;
        this.tipoPartido = tipoPartido;
    }

}
