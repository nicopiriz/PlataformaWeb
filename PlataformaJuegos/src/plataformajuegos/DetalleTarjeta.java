package plataformajuegos;

import java.util.Date;

public class DetalleTarjeta {
    private int idDetalleTarjeta;
    private String nombreTitular;
    private Date fechaVencimiento;
    private String numero;
    private int codigoSeguridad;
    
    //Constructor
    public DetalleTarjeta(){
    }
    //Getters and Setters
    public int getIdDetalleTarjeta(){
        return this.idDetalleTarjeta;
    }
    public void setIdDetalleTarjeta(int idDetalleTarjeta){
        this.idDetalleTarjeta=idDetalleTarjeta;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }
    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
}