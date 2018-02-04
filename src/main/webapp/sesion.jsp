<!DOCTYPE html >

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Login para varios usuario</title>
</head>

<body>
    <link rel="stylesheet" href="css/stilesesion.css">
    <link href='https://fonts.googleapis.com/css?family=Poppins:400,500,600' rel='stylesheet' type='text/css'>




    <style>
        body {
            background-image:  url("images/intro-bg2.jpg") ;
            background-size: cover; 


        } 
    </style>




    <form  action="SESION" method="post" name="login" class="login" background="intro-bg2.jpg"> 
        <h1 class="login-title">INICIAR SESION</h1>
        <table width="200" border="0"> 
            <tr> 

                <td><span class="cnt"> 
                        <input name="usuario" type="text"  placeholder="Usuario " class="login-input" value="" size="20" /> 
                    </span></td> 
            </tr> 
            <tr> 

                <td><span class="cnt"> 
                        <input name="password" type="password" placeholder="Contrase&ntilde;a" class="login-input " value="" size="20" /> 
                    </span></td> 
            <tr>
                <td><span class="cnt"> 
                        <input value="Entrar" target="_parent"  type="submit" class="login-button"/>       
                    </span></td> 
            </tr>
            </tr> 
            <tr> 
                <th scope="row"><input type="reset" name="Borrar" id="Borrar" value="Reset" class="login-button" /></th> 
            </tr> 

        </table> 
        <TR>
        <p class="login-lost"><a href="">olvidaste la contrase&ntilde;a?</a></p>
        <%
            if (request.getAttribute("mensaje_alerta") == null) {
            } else {
                out.println("<h1> " + request.getAttribute("mensaje_alerta") + "</h1>");
            }
        %>
    </TR>
</form> 





<script type="text/javascript" src="js/inicio.js">
</script> 
<script type="text/javascript" src="js/inicio.js">
</script> 
</center> 
<script type="text/javascript" src="js/script.js">

</script>
</body>
</html>