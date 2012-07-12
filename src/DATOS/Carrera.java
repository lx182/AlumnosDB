package DATOS;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Al3x
 */
public class Carrera implements Bean{
    private String clave;
    private String nombre;
    private int idcarrera;
    
    
    /**
     * @return the clave
     */
    public Carrera(){}
    
    public Carrera(String clave, String nombre){
        this.clave = clave;
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave.toUpperCase();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the idcarrera
     */
    public int getIdcarrera() {
        return idcarrera;
    }

    /**
     * @param idcarrera the idcarrera to set
     */
    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

  
}
