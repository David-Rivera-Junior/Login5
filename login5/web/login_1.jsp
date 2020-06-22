<!DOCTYPE html>
<%@page import="java.sql.*"%>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Login</title>

    <!--JQUERY-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    
    <!-- FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    
    <!-- Los iconos tipo Solid de Fontawesome-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
    <script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>

    <!-- Nuestro css-->
    
    <link href="MISESTILOS.css" rel="stylesheet" type="text/css"/>
</head>
<body style="background-image: url(img/scam.jpg)">
    <div class="modal-dialog text-center">
        <div class="col-sm-8 main-section">
            <div class="modal-content">
                <div class="col-12 user-img">
                    <img src="img/123.jpg" th:src="@{/img/123.jpeg}"/>
                </div>
                <form class="col-12" th:action="@{/login}" method="get">
                    <div class="form-group" id="user-group">
                        <input type="text" class="form-control" placeholder="Nombre de usuario" name="username"/>
                    </div>
                    <div class="form-group" id="contrasena-group">
                        <input type="password" class="form-control" placeholder="Contraseña" name="password"/>
                    </div>
                    <button type="submit" class="btn btn-primary"><i class="fas fa-sign-in-alt"></i>  Ingresar </button>
                </form>

            </div>
        </div>
    </div>
 <% 
    Connection cnx=null;
   Statement sta=null;
   ResultSet rs=null;
   String user=request.getParameter("username");
   String contra=request.getParameter("password");
   try{
   Class.forName("com.mysql.jdbc.Driver");
    cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/scam","root","");
   sta=cnx.createStatement();
    rs=sta.executeQuery("select * from dueño where usuario_emp='"+user+
            "' and contraseña_emp='"+contra+"'");
   
   if(rs.absolute(1)){request.getRequestDispatcher("principal.jsp").forward(request, response);}
   else{System.out.println("Login incorrecto");}
   
              
   }    catch(Exception e){}
 
%>
</body>
</html>
