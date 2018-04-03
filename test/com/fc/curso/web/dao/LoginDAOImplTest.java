/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fc.curso.web.dao;

import com.fc.curso.web.dao.domain.Usuarios;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class LoginDAOImplTest {
    
    public LoginDAOImplTest() {
    }

    /**
     * Test of getUsuario method, of class LoginDAOImpl.
     */
    @Test
    public void testGetUsuario() throws Exception {
        System.out.println("getUsuario");
        String usuario = "admin";
        String pass = "12345";
        LoginDAOImpl instance = new LoginDAOImpl();

        Usuarios result = instance.getUsuario(usuario, pass);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
