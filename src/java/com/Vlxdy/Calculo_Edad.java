package com.Vlxdy;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vlxdy Hishikawa
 */
@WebServlet(name = "Calculo_Edad", urlPatterns = {"/Calculo_Edad"})
public class Calculo_Edad extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{    
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title>CALCULO EDAD</title>");            
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h2 align='center'>UTILIZANDO UN SOLO SERVLET CALCULAR LA EDAD DE "
                        + "UNA PERSONA A PARTIR DE SU AÑO DE NACIMIENTO "
                        + "DOGET(HTTPSERVLETREQUEST REQUEST, HTTPSERVLETRESPONSE RESPONSE) </h2>");
                out.println("<br><br>");
                out.println("<form action='' method='GET'");
                  out.println("<h3 align='center'><strong>INGRESE SU AÑO DE NACIMIENTO</strong></h3>");
                  out.println("<br><br>");
                  out.println("AÑO DE NACIMIENTO:");
                  out.println("<input type='text' name='Nacimiento' min='1000' max='2021' /required >");
                  out.println("<br><br>");
                  out.println("<input type='submit' value='CALCULAR' >");
                out.println("</form>");
            out.println("<br><br>");
            int Nacimiento = Integer.parseInt(request.getParameter("Nacimiento"));
            int edad = 2021 - Nacimiento; 
            out.print("<h2>ACTUALMENTE USTED TIENE: <strong style=color:yellow>"+edad +"</strong> AÑOS</h2>"); 
            out.println("</body>");
            out.println("<br><br><br>");
            out.println("<footer>");
            out.println("<p>");
            out.println("<h3 id='heading' align='center'>DEVELOPED &#x1F497; by <a style='color:white;' ><strong>VLXDY HISHIKAWA</strong></a></h3>");
            out.println("</p>");
            out.println("<br><br>");
            out.println("<h2 align='center'><a href='Main.jsp'>Volver al Inicio</a></h2>");
            out.println("</footer>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
}
