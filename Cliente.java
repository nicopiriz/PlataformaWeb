package plataformajuegos;

import java.util.Date;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private int dni;
    private String localidad;
    private String direccion;
    private Date fechaNacimiento;
    private String mail;
    private int detalleTarjetaIdDetalleTarjeta;
    
    //Constructor
    public Cliente(){
    }
    //Getters and Setters
    public int getIdCliente(){
        return this.idCliente;
    }
    public void setIdCliente(int idCliente){
        this.idCliente=idCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public int getDetalleTarjetaIdDetalleTarjeta() {
        return detalleTarjetaIdDetalleTarjeta;
    }
    public void setDetalleTarjetaIdDetalleTarjeta(int detalleTarjetaIdDetalleTarjeta) {
        this.detalleTarjetaIdDetalleTarjeta = detalleTarjetaIdDetalleTarjeta;
    }
    
}