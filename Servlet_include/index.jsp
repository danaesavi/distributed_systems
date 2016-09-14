<%-- 
    Document   : index
    Created on : 19/02/2016, 04:46:02 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="windows-1258"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>¡Bienvenido CineMas!</h1>
        Permítenos recomendarte una película <BR>
        <form action="GetSuggestion">
            Zona: <select name="zona">
                <option>Centro</option>
                <option>Sur</option>
                <option>Norte</option>
                
            </select><BR>
            Tipo de película: <select name="tipo">
                <option>Comedia</option>
                <option>Acción</option>
                <option>Terror</option>
            </select><BR>
            <input type="reset" value="Limpiar" /> <input type="submit" value="Ver Recomendación" />
            
                        
        </form>
    </body>
</html>
