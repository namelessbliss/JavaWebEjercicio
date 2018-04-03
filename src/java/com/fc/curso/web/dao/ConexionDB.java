
package com.fc.curso.web.dao;

import com.fc.curso.web.util.PropertiesUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NB
 */
public class ConexionDB {
    private Connection conn;
    private final String driver;
    private final String url;
    private final String usuario;
    private final String pass;

    public ConexionDB() {
        this.driver = PropertiesUtil.getPropiedad("db.driver");
        this.url = PropertiesUtil.getPropiedad("db.url");
        this.usuario = PropertiesUtil.getPropiedad("db.usuario");
        this.pass = PropertiesUtil.getPropiedad("db.pass");
    }
    
    public Connection getConexion() throws SQLException{
        try {
            Class.forName(this.driver);
            conn = DriverManager.getConnection(this.url, this.usuario, this. pass);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error" + ex.getMessage());
        }
        return conn;
    }
    
    public void desconectar() throws SQLException{
        if (conn != null){
            conn.close();
        }
    }
}
