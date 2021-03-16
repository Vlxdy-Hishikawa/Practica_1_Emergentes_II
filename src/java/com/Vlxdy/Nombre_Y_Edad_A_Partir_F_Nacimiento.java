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
@WebServlet(name = "Nombre_Y_Edad_A_Partir_F_Nacimiento", urlPatterns = {"/Nombre_Y_Edad_A_Partir_F_Nacimiento"})
public class Nombre_Y_Edad_A_Partir_F_Nacimiento extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title>NOMBRE Y EDAD</title>");            
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h2 align='center'>MOSTRAR LA EDAD DE UNA PERSONA A PARTIR DEL AÑO DE NACIMIENTO "
                        + "EL FORMULARIO DEBE SOLICITAR NOMBRE Y AÑO DE NACIMIENTO </h2>");
                out.println("<br>");
                out.println("<form action='' method='post'>");
                  out.println("<h3 align='center'><strong>INGRESE SU NOMBRE Y SU AÑO DE NACIMIENTO</strong></h3>");
                  out.println("NOMBRE");
                  out.println("<input type='text' name='nombre' required>");  
                  out.println("<br>");
                  out.println("AÑO DE NACIMIENTO");
                  out.println("<input type='number' name='anio' min='1000' max='2021' required>");  
                  out.println("<br><br>");
                  out.println("<input type='submit' value='ENVIAR'>");
                  out.println("<br><br>");
                out.println("</form>");
            out.println("</body>");
            out.println("<footer>");
            out.println("<p><br><br><br>");
            out.println("<h3 id='heading' align='center'>DEVELOPED &#x1F497; by <a style='color:white;' ><strong>VLXDY HISHIKAWA</strong></a></h3>");
            out.println("</p>");
            out.println("</footer>");
            out.println("</html>");  
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String nombre = request.getParameter("nombre");
            String anio = request.getParameter("anio");
            int año = Integer.parseInt(anio);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
                out.println("<meta name=author content=VLADIMIR HUANCA>");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title>NOMBRE Y EDAD</title>");            
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h1 align='center'>SEGUN LA INFORMACION RECIBIDA</h1>");
                out.print("<h2> SU NOMBRE ES: <strong style=color:yellow>"+ nombre +"</strong></h2>");
                if(anio != null){
                    int edad=2021-año;
                    out.print("<h2>ACTUALMENTE USTED TIENE: <strong style=color:yellow>"+edad +"</strong> AÑOS</h2>"); 
                }else{
                    out.println("NO HAY DATOS PARA MOSTRAR! ");
                 }
                    out.println("</body>");
                    out.println("<footer>");
                    out.println("<p><br><br><br>");
                    out.println("<h3 id='heading' align='center'>DEVELOPED &#x1F497; by <a style='color:white;' ><strong>VLXDY HISHIKAWA</strong></a></h3>");
                    out.println("</p>");
                    out.println("<br><br>");
                    out.println("<h2 align='center'><a href='Main.jsp'>Volver al Inicio</a></h2>");
                    out.println("</footer>");
                    out.println("</html>");
        }
        finally{
            out.close();
        }  
    }
}
