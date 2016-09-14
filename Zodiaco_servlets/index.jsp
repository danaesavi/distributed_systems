f <%-- 
    Document   : index
    Created on : 16/02/2016, 09:17:25 PM
    Author     : hca
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Zodiaco</h1>
        <form action="ServletZodiaco">
            <table border="1">
                <thead>
                    <tr>
                        <th>¿Cual es tu fecha de nacimiento?</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Dia</td>
                        <td><input type="text" name="dia" value="22" /></td>
                    </tr>
                    <tr>
                        <td>Mes</td>
                        <td><input type="text" name="mes" value="11" /></td>
                    </tr>
                    <tr>
                        <td>Año</td>
                        <td><input type="text" name="año" value="1992" /></td>
                    </tr>
                    <tr>
                        <td><input type="reset" value="Limpiar" /></td>
                        <td><input type="submit" value="Enviar" /></td>
                    </tr>
                   
                </tbody>
            </table>
           
            
        </form>
        
    </body>
</html>
