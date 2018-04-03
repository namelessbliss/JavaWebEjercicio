
package com.fc.curso.web.dao;

import com.fc.curso.web.dao.domain.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class LoginDAOImpl extends ConexionDB{
    
    public Usuarios getUsuario(String usuario, String pass) throws DAOException{
        try {
            String sql = "SELECT USUARIO, FCH_VIGENCIA FROM USUARIOS " 
                               +"WHERE USUARIO = ?  " 
                               +"AND pass = ? ";
            
            PreparedStatement ps = this.getConexion().prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            Usuarios usuarioValido = null;
            if (rs.next()){
                usuarioValido = new Usuarios();
                usuarioValido.setUsuario(rs.getString(1));
                usuarioValido.setFchVigencia(rs.getDate(2));
            }
            this.desconectar();
            return usuarioValido;
        } catch (SQLException ex) {
                throw new DAOException(ex);
        }
        
    }
    
}
