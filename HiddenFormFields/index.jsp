<%-- 
    Document   : index
    Created on : 12/02/2016, 04:53:05 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sistema de Cotizacion de Seguros de Auto</h1>
        <BR>
        Datos Personales:
        <BR>
        <form action="pagina2.jsp">
            <table border="1">
                <thead>
                    <tr>
                        <th>Campo</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre:</td>
                        <td><input type="text" name="nombre" value="Danae" /></td>
                    </tr>
                    <tr>
                        <td>Apellidos:</td>
                        <td><input type="text" name="apellidos" value="Sanchez " /></td>
                    </tr>
                    <tr>
                        <td>Genero:</td>
                        <td><input type="radio" name="sexo" value="M" />
                            <input type="radio" name="sexo" value="F" checked="checked" />
                        </td>
                    </tr>
                    <tr>
                        <td>Edad:</td>
                        <td><input type="text" name="edad" value="23" /></td>
                    </tr>
                    <tr>
                        <td>Estado</td>
                        <td><select name="estado">
                                <option>Ciudad de Mexico</option>
                                <option>Morelos</option>
                                <option>Jalisco</option>
                            </select></td>
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
