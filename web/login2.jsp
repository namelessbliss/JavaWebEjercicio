<%-- 
    Document   : login2
    Created on : 05/04/2018, 06:27:10 PM
    Author     : Administrador
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Login 2</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
      <form id="frmLogin" action="login" method="POST">
          <!-- Usamos Bootstrap-->
          <div  class="container">
              <div class="page-header">
                  <h1>Acceso al sistema</h1>
              </div>
              
              <!--Uso de scriplet para mostrar mensaje de error-->
              <%
                  String  msg = (String) request.getAttribute("mensaje");
                  if (msg != null){
                      %>
                      <div class="alert alert-danger"><%= msg%></div>
                      <% } %>
                      <div class="form-group">
                          <label for="usuario">Usuario</label>
                          <input type="text" class="form-control" id="usuario" name="usuario"
                                 placeholder="Introduce tu nombre de usuario">
                      </div>
                      <div class="form-group">
                          <label for="pass">Contraseña</label>
                          <input type="password" class="form-control" id="pass" name="pass"
                                 placeholder="Contraseña">
                      </div>
                      
                      <div class="checkbox">
                          <label>
                              <input type="checkbox"> No cerrar sesi&oacute;n
                          </label>
                      </div>
                      <button id="btnEntrar" type="submit" class="btn btn-primary">Entrar</button>
          </div>
      </form>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    
    <!-- Agregamos funcionalidad para trabajar con jquery -->
    <script>
        function entrar(){
            $("#btnEntrar").click(function()    {
                        $("#frmLogin").submit();
            });
        }
        $(document).ready(function()    {
            
        });
        </script>
  </body>
</html>