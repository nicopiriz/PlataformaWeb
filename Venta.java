package plataformajuegos;

import java.util.Date;

public class Venta {
    private int idVenta;
    private Date fechaVenta;
    private float precio;
    private int usuarioIdUsuario;
    private int tipoPagoIdTipoPago;
    private int juegosIdJuegos;
    
    //Constructor
    public Venta(){        
    }
    //Getters and Setters
    public int getIdVenta(){
        return this.idVenta;
    }
    public void setIdVenta(int idVenta){
        this.idVenta=idVenta;
    }
    public Date getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }
    public void setUsuarioIdUsuario(int usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }
    public int getTipoPagoIdTipoPago() {
        return tipoPagoIdTipoPago;
    }
    public void setTipoPagoIdTipoPago(int tipoPagoIdTipoPago) {
        this.tipoPagoIdTipoPago = tipoPagoIdTipoPago;
    }
    public int getJuegosIdJuegos() {
        return juegosIdJuegos;
    }
    public void setJuegosIdJuegos(int juegosIdJuegos) {
        this.juegosIdJuegos = juegosIdJuegos;
    }
}