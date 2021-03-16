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
@WebServlet(name = "Operacion_De_Numeros", urlPatterns = {"/Operacion_De_Numeros"})
public class Operacion_De_Numeros extends HttpServlet {

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
                out.println("<title> OPERACIONES </title>"); 
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
            out.println("<h2 align='center'>CREAR UN SERVLET PARA SOLICITAR DOS NÚMEROS Y "
                    + "UN OPERADOR (SUMA, RESTA, PRODUCTO, DIVISIÓN) EN UN CUADRO DESPLEGABLE "
                    + "COMBOBOX Y UN BOTÓN CON EL TEXTO PROCESAR. AL PULSAR EL BOTÓN DEBE "
                    + "APARECER EL RESULTADO DE LA OPERACIÓN </h2>");
            out.println("<br><br>");
            out.print("<form action='' method='POST'>");
                out.println("<h3 align='center'><strong> REALIZAR OPERACION CON DOS NUMEROS</strong></h3>");
                out.println("<small><b> INTRODUCE EL PRIMER NUMERO: <b></small>");
                out.println("<input type='number' name='number1' min='1' required >");
                out.println("<br>");
                out.println("<small><b> INTRODUCE EL SEGUNDO NUMERO: <b></small>");
                out.println("<input type='number' name='number2' min='1' required >");
                out.println("<br><br>");
                out.println("<small><b> ELIGE UNA OPERACION: <b></small>");
                out.print("<select name='operador' id='operador' min='1' class='custom-select' required>");
                  out.print("<option value='0' disabled selected >Elija una opcion</option>");
                  out.print("<option value='1'>SUMA</option>");
                  out.print("<option value='2'>RESTA</option>");
                  out.print("<option value='3'>MULTIPLICACION</option>");
                  out.print("<option value='4'>DIVISION</option>");
                out.print("</select>");
                out.print("<br><br>");
                out.println("<input type='submit' value='Enviar'>");
                out.println("</form>");
                out.println("<footer>");
                out.println("<p><br><br>");
                out.println("<h3 style='color:black;' align='center'>DEVELOPED &#x1F497; by <a style='color:black;' ><strong>VLXDY HISHIKAWA</strong></a></h3>");
                out.println("</p>");
                out.println("</footer>");
                out.println("</body>");
                out.println("</html>");
        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String Operador = request.getParameter("operador");
            String Number1 = request.getParameter("number1");
            String Number2 = request.getParameter("number2");
            int Operadores=Integer.parseInt(Operador);
            int Numero1=Integer.parseInt(Number1);
            int Numero2=Integer.parseInt(Number2);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html><html>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title> OPERACIONES </title>"); 
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h1 align='center'> SEGUN LA INFORMACION RECIBIDA </h1>");
                out.println("<br>");
                if((Operadores != 0) && (Operador != null)){
                    if(Operadores==1){
                        int Suma = Numero1+Numero2;
                        out.print("<h2>LA SUMA DE "+Numero1+" Y "+Numero2+" ES: <strong style=color:yellow>"+Suma +"</strong> </h2>");
                    }
                    if(Operadores==2){
                        int Resta = Numero1-Numero2;
                        out.print("<h2>LA RESTA DE "+Numero1+" Y "+Numero2+" ES: <strong style=color:yellow>"+Resta +"</strong> </h2>");
                    }
                    if(Operadores==3){
                        int Multiplicacion = Numero1*Numero2;
                        out.print("<h2>LA MULTIPLICACION DE "+Numero1+" Y "+Numero2+" ES: <strong style=color:yellow>"+Multiplicacion +"</strong> </h2>");
                    }
                    if(Operadores==4){
                        int Division = Numero1/Numero2;
                        out.print("<h2>LA DIVISION DE "+Numero1+" Y "+Numero2+"  ES: <strong style=color:yellow>"+Division +"</strong> </h2>");
                    }
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
        } finally {
            out.close();
        }
    }
}
