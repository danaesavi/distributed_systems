/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hca
 */
public class ServletZodiaco extends HttpServlet {

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
        response.setContentType("text/html;charset=windows-1252");
         String signo=null; 
         String compatibles=null;
         
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          try{
             
              int año=Integer.parseInt(request.getParameter("año"));
               int mes=Integer.parseInt(request.getParameter("mes"));
               int dia=Integer.parseInt(request.getParameter("dia"));
               switch (mes){
                   case 1:
                   signo="Aries";
                   compatibles="Piscis";
                   break;
                   case 2:
                   signo="Sagitario";
                    compatibles="Cáncer";
                   break;
                   case 3:
                   signo="Piscis";
                   compatibles="Aries";
                   break;
                   case 4:
                   signo="Acuario";
                   compatibles="Virgo";
                   break;
                   case 5:
                   signo="Capricornio";
                   compatibles="Acuario";
                   break;
                   default:
                   signo="Calamardo";
                   compatibles="Patricio";
                   break;
               }
               
                             
          }
          catch(Exception e){
           response.sendRedirect("http://localhost:8080/Zodiaco/"); 
           out.println("Hubo un error en la captura");

          }
            GregorianCalendar cal= new GregorianCalendar();
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletZodiaco</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Zodiaco</h1><BR>");
            

            out.println("<h1>Tu signo es:"+signo+" </h1><BR>");
            out.println(" <form action=\"Zodiaco2\">");
            out.println(" <input type=\"hidden\" name=\"signo\" value="+signo+" />");
            out.println(" <input type=\"hidden\" name=\"compatibles\" value="+compatibles+" />");
            out.println("<input type=\"submit\" value=\"Ver signos compatibles\" /> </form>");
            
            
            //out.println("<a href="\submit\"><button> Ver signos Compatibles</button></a>");
            out.println("</body>");
            out.println("</html>");
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
