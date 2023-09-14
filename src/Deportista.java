public class Deportista {
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String numeroContacto;
    private String tipoDeporte;
    private String posicion;

    public Deportista(String nombre, String apellido, String correoElectronico, String numeroContacto, String tipoDeporte, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.numeroContacto = numeroContacto;
        this.tipoDeporte = tipoDeporte;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }

}
