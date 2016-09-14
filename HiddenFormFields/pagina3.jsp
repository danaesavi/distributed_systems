<%-- 
    Document   : pagina3
    Created on : 12/02/2016, 04:59:03 PM
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
        <form>
       
        <BR>
        <% 
         if(request.getParameter("nombre")!=null && request.getParameter("apellidos")!= null)  {
             out.print("Estimada: "+ request.getParameter("nombre")+ request.getParameter("apellidos")+ "<BR>");
         }
         out.print("En funcion de los datos proporcionados:"+ "<BR>");
         
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
         if(request.getParameter("marca")!=null){
             out.print("Marca: "+ request.getParameter("marca")+ "<BR>");
         }
         if(request.getParameter("modelo")!=null){
             out.print("Modelo: "+ request.getParameter("modelo")+ "<BR>");
         }
         if(request.getParameter("placas")!=null){
             out.print("Placas: "+ request.getParameter("placas")+ "<BR>");
         }
         out.print("La cotizacion de su seguro es: ");
        int var=5*Integer.valueOf(request.getParameter("edad"));
        out.print(var);
        %>
        
         </form>
        
    </body>
</html>
