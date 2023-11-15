package co.edu.uniquindio.poo;

public class Cliente {
    
    private String numCedula;
    private String nombre;
    private String apellido;
    private String email;


    public Cliente(String numCedula, String nombre, String apellido, String email) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }


    public String getNumCedula() {
        return numCedula;
    }


    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
}
