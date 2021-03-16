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
@WebServlet(name = "Conversor_De_Divisas", urlPatterns = {"/Conversor_De_Divisas"})
public class Conversor_De_Divisas extends HttpServlet {

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
                out.println("<title>CONVERSOR DE DIVISAS</title>");  
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<style>");
            out.println(".hidden{display:none;}");
            out.println("</style>");
            out.println("<body>");
                out.println("<h2 align='center'>USANDO SERVLETE REALIZAR UN PROGRAMA QUE "
                        + "+PERMITA REALIZAR EL CAMBIO TE BOLIVIANOS A DÓLARES Y VICEVERSA </h2>");
            out.println("<br><br>");
            out.print("<form action='' method='POST'>");
                out.println("<h3 align='center'><strong> CONVERSOR DE DIVISAS</strong></h3>");
                out.println("<small><b> ELIGE UNA OPCION: <b></small>");
                out.print("<select name='divisa' id='divisa' onchange='a()' required>");
                out.print("<option value='0' disabled selected >Elija una opcion</option>");
                out.print("<option value='1'>Dolares a Bolivianos</option>");
                out.print("<option value='2'>Bolivianos a Dolares</option>");
                out.print("</select>");
                out.print("<br><br>");
                out.print("<div id='dol' class='hidden'>");
                out.println("<small><b> INTRODUCIR CANTIDAD DE DOLARES: <b></small>");
                out.println("<input type='number' name='dolares' min='1' required value='1'> ($)");
                out.println("<br>");
                out.print("</div>");
                out.print("<div id='bol' class='hidden'>");
                out.println("<small><b> INTRODUCIR CANTIDAD DE BOLIVIANOS: <b></small>");
                out.println("<input type='number' name='bolivianos' min='1' required value='1'> (Bs)");
                out.println("<br>");
                out.print("</div>");
                out.println("<input type='submit' value='CALCULAR'>");
            out.println("</form>");
            out.println("<script>function a(){"
                    + "if(document.getElementById('divisa').value==1){"
                    + "var elemento = document.getElementById('dol');elemento.className ='';"
                    + "var elemento2 = document.getElementById('bol');elemento2.className ='hidden';"
                    + "}else{"
                    + "var elemento = document.getElementById('bol');elemento.className ='';"
                    + "var elemento2 = document.getElementById('dol');elemento2.className ='hidden';"
                    + "}"
                    + "}");
            out.println("</script>");
            out.println("<footer>");
            out.println("<p><br><br><br>");
            out.println("<h3 style='color:black;' align='center'>DEVELOPED &#x1F497; by <a style='color:black;' ><strong>VLXDY HISHIKAWA</strong></a></h3>");
            out.println("</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String Divisa = request.getParameter("divisa");
            String Dolar = request.getParameter("dolares");
            String Boliviano = request.getParameter("bolivianos");
            int TipoDivisa=Integer.parseInt(Divisa);
            float Dolares=Float.parseFloat(Dolar);
            float Bolivianos=Float.parseFloat(Boliviano);
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            try{
                out.println("<!DOCTYPE html><html lang='es'>");
                out.println("<head>");
                    out.println("<meta name=author content= VLADIMIR HUANCA >");
                    out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                    out.println("<link rel='shortcut icon' href='Logo.png'>");
                    out.println("<title>CONVERSOR DE DIVISAS</title>");  
                out.println("</head>");
                out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
                out.println("<body>");
                out.println("<h1 align='center'> SEGUN LA INFORMACION RECIBIDA </h1>");
                out.println("<br>");
                double CantBoliviano = 3.33d;
                double CantDolar = 3.33d;
                if(Divisa != null){
                    if(TipoDivisa==1){
                        CantDolar = Dolares * 6.90;
                        CantDolar = Math.round(CantDolar * 100) / 100d;
                        out.print("<h2>LA CANTIDAD CALCULADA EN BOLIVIANOS ES:    <strong style=color:yellow>"+CantDolar+"</strong> (Bs)</h2>");
                    }else{
                        CantBoliviano = Bolivianos / 6.90;
                        CantBoliviano = Math.round(CantBoliviano * 100) / 100d;
                        out.print("<h2>LA CANTIDAD CALCULADA EN DOLARES ES:    <strong style=color:yellow>"+CantBoliviano+"</strong> ($$)</h2>");
                    }
                }else{
                    out.println("NO HAY DATOS PARA MOSTRAR!");
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
