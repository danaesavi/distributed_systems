<%-- 
    Document   : welcome
    Created on : 26/02/2016, 04:34:37 PM
    Author     : sdist
--%>

<%@page import="org.jboss.weld.context.http.Http"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% 
        
       
            if(request.getParameter("password").equals("123456")){
                HttpSession mySession = request.getSession();
                mySession.setAttribute("username",request.getParameter("name"));
                out.println("<h1>Welcome"+ request.getParameter("name")+"!</h1>");
                out.println("<a href='profile.jsp'> Visit your profile! </a>");
            
            }else{
                RequestDispatcher r1= getServletContext().getRequestDispatcher("/index.jsp");
                r1.forward(request, response);
            }
        
         
        %>
    </body>
</html>
