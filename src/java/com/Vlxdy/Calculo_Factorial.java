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
@WebServlet(name = "Calculo_Factorial", urlPatterns = {"/Calculo_Factorial"})
public class Calculo_Factorial extends HttpServlet {

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
                out.println("<title>FACTORIAL</title>");           
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h2 align='center'>CON SERVLETS CREAR UN PROGRAMA PARA LEER UN NÚMERO Y CALCULAR SU FACTORIAL</h2>");
                out.println("<br>");
                out.println("<form action='' method='POST'>");
                   out.println("<h3 align='center'><strong>INGRESE UN NUMERO</strong></h3>");
                   out.println("<br>");
                   out.println("NUMERO: ");
                   out.println("<input type='number' name='numero' min='1' required>");  
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
            String numero = request.getParameter("numero");
            int Numero = Integer.parseInt(numero);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title>FACTORIAL</title>");             
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h1 align='center'> SEGUN LA INFORMACION RECIBIDA </h1>");
                if(numero  != null){
                    int Factorial = 1;
                    for (int i = 1; i <= Numero; i++) {
                    Factorial *= i;   
                    }
                out.print("<h2>EL NUMERO QUE INGRESO ES: "+Numero+"</h2>"); 
                out.print("<h2>EL FACTORIAL DE ESE NUMERO ES: <strong style=color:yellow>"+Factorial +"</strong> </h2>"); 
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
