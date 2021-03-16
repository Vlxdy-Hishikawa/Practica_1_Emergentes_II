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
@WebServlet(name = "Juego_De_Dados", urlPatterns = {"/Juego_De_Dados"})
public class Juego_De_Dados extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title>JUEGO DE DADOS</title>");
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h2 align='center'>CREAR UN PROGRAMA UTILIZANDO SERVLETS "
                        + "PARA SIMULAR EL JUEGO CON DOS DADOS. (REGLA PRINCIPAL SI "
                        + "LA SUMA ES 7 U 11 GANA SI ES OTRO NÚMERO PIERDE) </h2>");
                out.println("<br><br>");
                out.print("<form action='' method='POST'>");
                    out.println("<h3 align='center'><strong>LANZAR LOS DADOS</strong></h3>");
                    out.println("<br>");
                    out.println("<input type='submit' value='LANZAR'>");
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
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title>JUEGO DE DADOS</title>");
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h2 align='center'>MOSTRANDO LOS RESULTADOS DE LOS DADOS</h2>");
                out.println("<br>");
                int Dado1=(int) (Math.random()*6 + 1);
                int Dado2=(int) (Math.random()*6 + 1);
                out.println("<h3 style=color:white> PRIMER DADO :  <strong style=color:yellow>"+Dado1+"</strong> </h3>");
                out.println("<h3 style=color:white> SEGUNDO DADO :  <strong style=color:yellow>"+Dado2+"</strong> </h3>");
                out.println("<br>");
                if(Dado1+Dado2==7 || Dado1+Dado2==11){
                    out.println("<h1>GANASTE</h1>");
                }else{
                    out.println("<h1>PERDISTE</h1>");
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
        } finally{
            out.close();
        }
    }
}
