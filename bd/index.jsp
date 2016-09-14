<%-- 
    Document   : index
    Created on : 1/03/2016, 08:30:50 PM
    Author     : sdist
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>


<%
    try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
         Connection con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/MyFirstDatabase",
                    "root",
                    "root") ;
                Statement query = con.createStatement();
                if(request.getParameter("btnAdd")!=null){
                    
                    String id, name, balance;
                    id=request.getParameter("idAdd");
                    name=request.getParameter("name");
                    balance=request.getParameter("balanceAdd");
                    query.executeUpdate("INSERT INTO ROOT.BDSTAFF VALUES ('"+id+"', '"+ name+"', "+ balance+")");
                }
                if(request.getParameter("btnUpdate")!=null){
                    String id, balance;
                    id=request.getParameter("idUpdate");
                    balance=request.getParameter("balanceUpdate");
                    query.executeUpdate("UPDATE BDSTAFF SET balance="+balance+"*2 where id='"+id+"'");
                  }
                if(request.getParameter("btnDelete")!=null){
                    String id;
                    id=request.getParameter("idAdd");
                    query.executeUpdate("DELETE FROM BDSTAFF where ID='"+id+"'");
                    
                }
                
                
                ResultSet rs = query.executeQuery("SELECT * FROM ROOT.BDSTAFF");
                
                
                while(rs.next()) {
                    out.println(" Id: "+ rs.getInt("ID"));
                    out.println(" Name: "+ rs.getString("NAME"));
                    out.println(" Balance: "+ rs.getString("BALANCE"));
                }
                con.commit();
                con.close();
            }catch(Exception e){
                e.getMessage();
                
            }
    %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Staff</h1>
        <form action="index.jsp">
            
            Add a record<BR>
            <table border="1">
                <thead>
                    <tr>
                        <th>Id:</th>
                        <th><input type="text" name="idAdd" value="" /></th>
                        <th>Name:</th>
                        <th><input type="text" name="name" value="" /></th>
                        <th>Balance:</th>
                        <th><input type="text" name="balanceAdd" value="" /></th>
                    </tr>
                </thead>
               </table>
            <input type="submit" value="OK" name="btnAdd" />
            </form>
            <BR>
            <form action="index.jsp">
            Delete a record <BR>
            <table border="1">
                <thead>
                    <tr>
                        <th>Id:</th>
                        <th><input type="text" name="idDelete" value="" /></th>
                    </tr>
                </thead>
                            </table>
            <input type="submit" value="OK" name="btnDelete" />
            </form>
            <BR>
            <form action="index.jsp">
            Update a record <BR>
             <table border="1">
                <thead>
                    <tr>
                        <th>Id:</th>
                        <th><input type="text" name="idUpdate" value="" /></th>
                         <th>Balance:</th>
                        <th><input type="text" name="balanceUpdate" value="" /></th>

                    </tr>
                </thead>
                            </table>
            <input type="submit" value="OK" name="btnUpdate" />

            

        </form>
    </body>
</html>
