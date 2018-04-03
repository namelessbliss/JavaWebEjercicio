/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fc.curso.web.service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class LoginServiceImplTest {
    
    public LoginServiceImplTest() {
    }

    /**
     * Test of autenticarUsuario method, of class LoginServiceImpl.
     */
    @Test
    public void testAutenticarUsuario() throws Exception {
        System.out.println("autenticarUsuario");
        String usuario = "admin";
        String pass = "12345";
        
        LoginServiceImpl instance = new LoginServiceImpl();
        boolean expResult = true;
        
        boolean result = instance.autenticarUsuario(usuario, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
