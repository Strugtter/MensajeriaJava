public class Usuario {
    private long cedula;
    private String nombre;
    private String apellido;
    private long celular;
    private String email;
    private String direccionResidencia;
    private String ciudad;

    public Usuario(long cedula, String nombre, String apellido, long celular, String email, String direccionResidencia, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.email = email;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
    }



}
