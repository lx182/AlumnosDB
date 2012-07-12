package DATOS;


import DAO.AlumnoDAO;
import DAO.CarreraDAO;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Al3x
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CarreraDAO carreraDAO= new CarreraDAO();
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        

        Carrera car = new Carrera("LANIs","Negosios");
        Alumno obj = new Alumno("UP100706","Alejandro","Varela","Llamas","4499068607","1991-03-07",car);
        carreraDAO.insert(car);
        alumnoDAO.insert(obj);
    
    }
}
