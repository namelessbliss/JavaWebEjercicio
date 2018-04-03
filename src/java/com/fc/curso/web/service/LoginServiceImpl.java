/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fc.curso.web.service;

import com.fc.curso.web.dao.DAOException;
import com.fc.curso.web.dao.LoginDAOImpl;
import com.fc.curso.web.dao.domain.Usuarios;
import com.fc.curso.web.util.DateUtil;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class LoginServiceImpl {
    private LoginDAOImpl loginDAO;

    public LoginServiceImpl() {
        this.loginDAO = new LoginDAOImpl();
    }
    
    public boolean autenticarUsuario(String usuario, String pass) throws ServiceException{
        boolean isUsuarioValido = false;
        
        try {
            Usuarios  usuarioValido = this.loginDAO.getUsuario(usuario, pass);
            //Validar si se encontró el usuario
            if (usuarioValido != null) {
                //Validar la vigencia
                Date fchVigencia = usuarioValido.getFchVigencia();
                
                if (DateUtil.esIgualFchActual(fchVigencia) || 
                        DateUtil.esMayorFchActual(fchVigencia)){
                    isUsuarioValido = true;
                } 
                
                
            }
            return isUsuarioValido;
        } catch (DAOException ex) {
        }
        return false;
    }
    
}
