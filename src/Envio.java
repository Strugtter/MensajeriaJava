import java.util.Date;

public class Envio {

    private int numeroGuia;
    private Cliente cliente;
    private String ciudadOrigen;
    private String ciudadDestino;
    private String direccionDestino;
    private String nombrePersonRecibe;
    private long numeroCelularRecibidor;
    private Date horaEntrega;
    private String estadoEnvio;
    private double valorEnvio;
    private Paquete paquete;

    public Envio(int numeroGuia, Cliente cliente, String ciudadOrigen, String ciudadDestino, String direccionDestino, String nombrePersonRecibe, long numeroCelularRecibidor, Date horaEntrega, String estadoEnvio, double valorEnvio, Paquete paquete) {
        this.numeroGuia = numeroGuia;
        this.cliente = cliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.nombrePersonRecibe = nombrePersonRecibe;
        this.numeroCelularRecibidor = numeroCelularRecibidor;
        this.horaEntrega = horaEntrega;
        this.estadoEnvio = estadoEnvio;
        this.valorEnvio = valorEnvio;
        this.paquete = paquete;
    }
}
