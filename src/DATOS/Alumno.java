package DATOS;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Al3x
 */
public class Alumno extends Persona{
    private String Matricula;
    private Carrera carrera = new Carrera();

    public Alumno(String Matricula, String nombre, String paterno, String materno, String telefono, String fecha, Carrera carrera) {
        this.Matricula = Matricula;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.telefono = telefono;
        this.fecha = fecha;
        this.carrera = carrera;
    }

    public Alumno() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * @return the Matricula
     */
    public String getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    /**
     * @return the carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
