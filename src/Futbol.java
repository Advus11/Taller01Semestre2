public class Futbol extends Deporte {
    private String tipoCampo;
    private String tipoPartido;

    public Futbol(String nombre, String tipoCampo, String tipoPartido) {
        super(nombre);
        this.tipoCampo = tipoCampo;
        this.tipoPartido = tipoPartido;
    }

}
