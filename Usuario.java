package plataformajuegos;

public class Usuario {
    private int idUsuario;
    private String nickname;
    private String contrasenia;
    private int clienteIdCliente;
    
    //Constructor
    public Usuario(){        
    }
    //Getters and Setters
    public int getidUsuario(){
        return this.idUsuario;
    }
    public void setIdUsuario(int idUsuario){
        this.idUsuario=idUsuario;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public int getClienteIdCliente() {
        return clienteIdCliente;
    }
    public void setClienteIdCliente(int clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }
}