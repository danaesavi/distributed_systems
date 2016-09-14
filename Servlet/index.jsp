<%-- 
    Document   : index
    Created on : 16/02/2016, 08:37:22 PM
    Author     : hca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Por favor de su opinion de los Servlets: </h1><BR>
        <form action="ServletDeOpinion">
            Nombre <input type="text" name="nombre" value="Gustavo" /><BR>
            Apellidos <input type="text" name="apellidos" value="Rodriguez" /><BR>
            Opinion que le merecen los Servlets <BR>
            <input type="radio" name="opinion" value="mala" />mala <input type="radio" name="opinion" value="regular" checked="checked" /> regular <input type="radio" name="opinion" value="buena" /><BR>
            Comentarios<BR>
            <textarea name="comentarios" rows="4" cols="20">
Desde mi punto de vista, los servlets son una tecnologia sorprendente
            </textarea><BR>
            <input type="reset" value="Limpiar" /><input type="submit" value="Enviar" />
         
            
         </form>
    </body>
</html>
