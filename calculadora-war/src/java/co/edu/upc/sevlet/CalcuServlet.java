/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.upc.sevlet;

import co.edu.upc.calduladora.CalcuBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcuServlet extends HttpServlet {

    @EJB
    private CalcuBeanLocal calcuBean;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcuServlet</title>");
            out.println("</head>");
            out.println("<body>");
            String st1 = request.getParameter("t1");
            String st2 = request.getParameter("t2");
            String signo = request.getParameter("action");
            int t1 = Integer.parseInt(st1);
            int t2 = Integer.parseInt(st2);

            out.println("<h1>Solucion</h1>");
            out.println("<p><strong>Valores: " + st1 + " " + signo + " " + st2 + "</p>");
            if (signo.equals("+")) {
                out.println("<p><strong>La respuesta es: " + calcuBean.suma(t1, t2) + "</p>");
            } else if (signo.equals("-")) {
                out.println("<p><strong>La respuesta es: " + calcuBean.resta(t1, t2) + "</p>");
            } else if (signo.equals("X")) {
                out.println("<p><strong>La respuesta es: " + calcuBean.multiplicacion(t1, t2) + "</p>");
            } else if (signo.equals("/")) {
                out.println("<p><strong>La respuesta es: " + calcuBean.divicion(t1, t2) + "</p>");
            } else if (signo.equals("%")) {
                out.println("<p><strong>La respuesta es: " + calcuBean.modulo(t1, t2) + "</p>");
            } else {
                out.println("<p><strong>Error en alguno de estos parametros: " + st1 + " " + signo + " " + st2 + "</p>");
            }

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
