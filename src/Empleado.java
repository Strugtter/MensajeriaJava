public class Empleado extends Usuario {

    private int antiguedad;
    private String rh;
    private String tipo;

    public Empleado(long cedula, String nombre, String apellido, long celular, String email, String direccionResidencia, String ciudad, int antiguedad, String rh, String tipo) {
        super(cedula, nombre, apellido, celular, email, direccionResidencia, ciudad);
        this.antiguedad = antiguedad;
        this.rh = rh;
        this.tipo = tipo;
    }


}
