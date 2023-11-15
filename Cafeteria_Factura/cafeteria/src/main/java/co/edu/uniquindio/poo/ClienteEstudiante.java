package co.edu.uniquindio.poo;

public class ClienteEstudiante extends Cliente{
    
    private double semestre;

    public ClienteEstudiante(String numCedula, String nombre, String apellido, String email, double semestre) {
        super(numCedula, nombre, apellido, email);
        
        this.semestre = semestre;
    }

    public double getSemestre() {
        return semestre;
    }
}
