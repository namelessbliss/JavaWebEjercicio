<%-- 
    Document   : login
    Created on : 05/04/2018, 05:29:42 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <!-- Creamos el formulario-->
        <h1>Acceso al portal</h1>
        <!-- Definimos el Servlet  a utulizar  con el atributo action y utilizamos el metodo POST,
        para que no se muestren los valores en el navegador -->
        <form action="login" method="POST">
            <table>
                <tr>
                    <td>Usuario: </td>
                    <td> <input type="text" name="usuario"/> </td>
                </tr>
                <tr>
                    <td>Contraseña: </td>
                    <td> <input type="password" name="pass"/> </td>
                </tr>
                <tr>
                    <td> <input type="submit" name="Entrar"/> </td>
                    <td> <input type="reset" name="Cancelar"/> </td>
                </tr>
            </table>
        </form>
    </body>
</html>
