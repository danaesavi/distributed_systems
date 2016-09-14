<%-- 
    Document   : index
    Created on : 8/04/2016, 05:01:51 PM
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
	servicesclient.WebCalculator_Service service = new servicesclient.WebCalculator_Service();
	servicesclient.WebCalculator port = service.getWebCalculatorPort();
	 // TODO initialize WS operation arguments here
	servicesclient.ComplexNumbers n1 = new servicesclient.ComplexNumbers();
	servicesclient.ComplexNumbers n2 = new servicesclient.ComplexNumbers();
        n1.setI(3);
        n1.setJ(4);
        n2.setI(1);
        n2.setJ(0);
	// TODO process result here
	servicesclient.ComplexNumbers result = port.add(n1, n2);
	out.println("Result = "+result.getI());
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
