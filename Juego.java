package plataformajuegos;

import java.util.Date;

public class Juego {
    private int idjuego;
    private String nombre;
    private String peso;
    private Date fechaLanzamiento;
    private int idGenero;
    private int idIdioma;
    private int idConsola;
    
    //Constructor
    public Juego(){
    }
    //Getters and Setters
    public int getIdjuego() {
        return idjuego;
    }
    public void setIdjuego(int idjuego) {
        this.idjuego = idjuego;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    public int getIdGenero() {
        return idGenero;
    }
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    public int getIdIdioma() {
        return idIdioma;
    }
    public void setIdIdioma(int idIdioma) {
        this.idIdioma = idIdioma;
    }
    public int getIdConsola() {
        return idConsola;
    }
    public void setIdConsola(int idConsola) {
        this.idConsola = idConsola;
    }
}