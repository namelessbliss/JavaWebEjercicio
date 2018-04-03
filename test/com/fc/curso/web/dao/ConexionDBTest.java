/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fc.curso.web.dao;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class ConexionDBTest {
    
    public ConexionDBTest() {
    }

    /**
     * Test of getConexion method, of class ConexionDB.
     */
    @Test
    public void testGetConexion() throws Exception {
        System.out.println("getConexion");
        ConexionDB instance = new ConexionDB();
        
        Connection result = instance.getConexion();
   
        assertNotNull(result);
    }

    /**
     * Test of desconectar method, of class ConexionDB.
     */
    @Test
    public void testDesconectar() throws Exception {
        System.out.println("desconectar");
        ConexionDB instance = new ConexionDB();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
