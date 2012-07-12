/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DATOS.Bean;
import DATOS.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Al3x
 */
public class CarreraDAO implements OperacionesDAO{
    private String hola;
    private int h;
    private Carrera carrera = null;

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
//        throw new UnsupportedOperationException("Not supported yet.");
        PreparedStatement ps = null;
        Carrera car = (Carrera) bean;
        ResultSet rs = null;
        int op = 0;
        Connection conexion = DAOFactory.getConexion();
        try {

            ps = conexion.prepareStatement(SQL.insertarCarrera);
            ps.setString(1, car.getClave());
            ps.setString(2, car.getNombre());
            ps.executeUpdate();
            
 
            
        } catch (SQLException ex) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public int getIdcarreraByClave(String Clave){

        PreparedStatement ps = null;
        int op = 0;
        Connection conexion = DAOFactory.getConexion();
        ResultSet rs = null;
        try {
            ps = conexion.prepareStatement(SQL.getIdcarreraByMatricula);
            ps.setString(1, Clave);
            rs = ps.executeQuery();
            rs.next();
            op = rs.getInt(1);
            
        }
             catch (SQLException ex) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }


        return op;
        
        
    }
    
}
