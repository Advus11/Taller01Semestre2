public class Entrenador extends Deportista {
    private int experiencia;
    private String especialidadDeportiva;

    public Entrenador(String nombre, String apellido, String correoElectronico, String numeroContacto, String tipoDeporte, String posicion, int experiencia, String especialidadDeportiva) {
        super(nombre, apellido, correoElectronico, numeroContacto, tipoDeporte, posicion);
        this.experiencia = experiencia;
        this.especialidadDeportiva = especialidadDeportiva;
    }

}
