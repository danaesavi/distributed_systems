<%-- 
    Document   : pagina2
    Created on : 12/02/2016, 04:58:47 PM
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
        
        <% 
         if(request.getParameter("nombre")!=null && request.getParameter("apellidos")!= null)  {
             out.print("Estimada: "+ request.getParameter("nombre")+ request.getParameter("apellidos")+ "<BR>");
         }
         
         if(request.getParameter("sexo")!=null){
             if(request.getParameter("sexo").equals("M")){
                out.print("Genero: Masculino"+ "<BR>");}
             else{
                out.print("Genero: Femenino"+ "<BR>");
             }
             
         }
         if(request.getParameter("edad")!=null){
             out.print("Edad: "+ request.getParameter("edad")+ "<BR>");
         }
         if(request.getParameter("estado")!=null){
             out.print("Estado: "+ request.getParameter("estado")+ "<BR>");
         }
       
        %>
        Datos del auto:
        <form action="pagina3.jsp">
            <table border="1">
                <thead>
                    <tr>
                        <th>Campo</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Marca</td>
                        <td><select name="marca">
                                <option>Chevrolet</option>
                                <option>BMW</option>
                                <option>Volkswagen</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>Modelo</td>
                        <td><input type="text" name="modelo" value="2015" /></td>
                    </tr>
                    <tr>
                        <td>Placas</td>
                        <td><input type="text" name="placas" value="122-HGZ" /></td>
                    </tr>
                    <tr>
                        <td><input type="reset" value="Limpiar" /></td>
                        <td><input type="submit" value="Enviar" /></td>
                    </tr>
                    
                     
                    
                </tbody>
            </table>
            
                    <% out.print("<input type='hidden' name='nombre' value='"+request.getParameter("nombre")+"'/>"); %>
                   
                    <% out.print("<input type='hidden' name='apellidos' value='"+request.getParameter("apellidos")+"'/>"); %>
                   
                    <% out.print("<input type='hidden' name='edad' value='"+request.getParameter("edad")+"'/>"); %>
              
                    <% out.print("<input type='hidden' name='sexo' value='"+request.getParameter("sexo")+"'/>"); %>
                    
                    <% out.print("<input type='hidden' name='estado' value='"+request.getParameter("estado")+"'/>"); %>
                   

        </form>
        
    </body>
</html>
