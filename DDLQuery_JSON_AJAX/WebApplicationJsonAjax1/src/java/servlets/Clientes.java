/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author sdist
 */
public class Clientes extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try (PrintWriter out = response.getWriter()) {
        response.setContentType("text/html;charset=UTF-8");
        try{
         Class.forName("org.apache.derby.jdbc.ClientDriver");
         Connection con = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/Customers",
                    "hola",
                    "hola") ;
                Statement query = con.createStatement();
                ResultSet rs = query.executeQuery("SELECT * FROM CUSTOMER");
               JSONObject jsonResponse=new JSONObject();
               JSONArray clientes=new JSONArray();
                while(rs.next()){
                    JSONObject client=new JSONObject();
                    client.put("name",rs.getString("name"));
                    client.put("address",rs.getString("address"));
                    client.put("balance",rs.getInt("balance"));
                    client.put("id",rs.getInt("id"));
                    client.put("premium",rs.getString("premium"));
                    
                    clientes.add(client);
                }
               
                
                jsonResponse.put("clientes", clientes);
                response.setContentType("application/json");
                System.out.println(jsonResponse.toString());
                out.write(jsonResponse.toString());
                con.close();
                }catch(Exception e){
                e.getMessage();
                
            }
                    
                    
                
      
            /* TODO output your page here. You may use following sample code. */
         
        }
    }
    
   

                
      

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
