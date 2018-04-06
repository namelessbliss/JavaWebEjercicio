
package com.fc.curso.web.controller;

import com.fc.curso.web.service.LoginServiceImpl;
import com.fc.curso.web.service.ServiceException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            response.setContentType("text/html;charset=UTF-8");
            String usuario = request.getParameter("usuario");
            String pass = request.getParameter("pass");
            
            // Integrando la capa de servicio
            LoginServiceImpl loginService = new  LoginServiceImpl();
            
            boolean isValido = loginService.autenticarUsuario(usuario, pass);
            String mapping = "/login2.jsp";
            //Mensaje de login incorrecto
            request.setAttribute("mensaje", "Nombre de usuario y contraseña incorrecto, intente de nuevo");
            if (isValido){
                mapping = "/portal.jsp";
            }
            //redirige hacia la direccion del valor de mapping
            this.getServletContext().getRequestDispatcher(mapping).forward(request, response);
            
            System.out.println("Usuario " + isValido);
      
    }   catch (ServiceException ex) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
