package co.edu.uniquindio.poo;

public class ClienteProfesor extends Cliente{

    private TipoProfesor tipoProfesor;

    public ClienteProfesor(String numCedula, String nombre, String apellido, String email, TipoProfesor tipoProfesor) {
        super(numCedula, nombre, apellido, email);

        this.tipoProfesor = tipoProfesor;
    }

    public TipoProfesor getTipoProfesor() {
        return tipoProfesor;
    }

    
    

}
