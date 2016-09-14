<%-- 
    Document   : index
    Created on : 8/04/2016, 04:21:29 PM
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
        <h1>Hello World!</h1>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	webserviceclient1.MyWebService_Service service = new webserviceclient1.MyWebService_Service();
	webserviceclient1.MyWebService port = service.getMyWebServicePort();
	 // TODO initialize WS operation arguments here
	int a = 3;
	int b = 5;
	// TODO process result here
	int result = port.add(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
