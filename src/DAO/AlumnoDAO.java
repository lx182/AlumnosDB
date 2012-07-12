/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DATOS.Alumno;
import DATOS.Bean;
import DATOS.Carrera;
import DAO.CarreraDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Al3x
 */
public class AlumnoDAO implements OperacionesDAO {

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
//        throw new UnsupportedOperationException("Not supported yet.");
        
          PreparedStatement ps = null;
        Alumno al = (Alumno) bean;
        CarreraDAO car = new CarreraDAO();
        Connection conexion = DAOFactory.getConexion();
        try {
            ps = conexion.prepareStatement(SQL.insertarAlumno);
            ps.setString(1, al.getMatricula());
            ps.setString(2, al.getNombre());
            ps.setString(3, al.getPaterno());
            ps.setString(4, al.getMaterno() );
            ps.setString(5, al.getTelefono());
            ps.setString(6, al.getFecha());
            ps.setInt(7, car.getIdcarreraByClave(al.getCarrera().getClave()));
            
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
    
}
