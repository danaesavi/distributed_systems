<%-- 
    Document   : scroll
    Created on : 3/03/2016, 08:28:34 PM
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
        <form action="scroll.jsp">
            <h1>Scrolling database records</h1>
            
        <%
            
            HttpSession mySession= request.getSession();
            Integer row = (Integer)mySession.getAttribute("row");
            Object [][] myResultSet = null;
                    
            myResultSet= (Object [][])mySession.getAttribute("rs");
           
           
            if(request.getParameter("izq") != null){
                row = row-1;
                 out.println("ID: "+ myResultSet[row][0]);
                out.println("NAME: "+ myResultSet[row][1]);
                
            }else{
              
                if(request.getParameter("der") != null){
                    row = row+1;
                     out.println("ID: "+ myResultSet[row][0]);
                    out.println("NAME: "+ myResultSet[row][1]);
                }else{
                     out.println("ID: "+ myResultSet[0][0]);
                    out.println("NAME: "+ myResultSet[0][1]);
                }
            }
            if(row>0){
                out.println("<input type='submit' value='<' name='izq'/>");
                
            }else{
                out.println("<input type='submit' value='<' name='izq' disabled='disabled'/>");
            }
            
            if(row<myResultSet[0].length){
                out.println("<input type='submit' value='>' name='der'/>");
                
                
            }else{
                out.println("<input type='submit' value='>' name='der' disabled='disabled'/>");
            }
            
            mySession.setAttribute("row",row);
            

        %>
        <hr>
        
        
        </form>
        
        
    </body>
</html>
