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
@WebServlet(name = "Matriz_Caracol", urlPatterns = {"/Matriz_Caracol"})
public class Matriz_Caracol extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title>MATRIZ CARACOL</title>");            
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
                out.println("<h2 align='center'>PROGRAMAR UN SERVLET QUE SOLICITE UN VALOR Y "
                          + "PULSANDO EL BOTÓN “PROCESAR” GENERE LA MATRIZ CARACOL</h2>");
                out.println("<form action='' method='post'>");
                    out.println("<h3 align='center'><strong>INGRESE UN NUMERO</strong></h3>");
                    out.println("NUMERO: ");
                    out.println("<input type='number' name='numero' min='1' required>");       
                    out.println("<br>");
                    out.println("<input type='submit' value='PROCESAR'>");
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
            int n = Integer.parseInt(numero);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
            out.println("<html lang='es'>");
            out.println("<head>");
                out.println("<meta name=author content= VLADIMIR HUANCA >");
                out.println("<meta name=viewport content=with=device-width, initial-scale=1.0>");
                out.println("<link rel='shortcut icon' href='Logo.png'>");
                out.println("<title>MATRIZ CARACOL</title>");           
            out.println("</head>");
            out.println("<link rel=StyleSheet href=mystyle.css type=text/css>");
            out.println("<body>");
            out.println("<h1 align='center'>MOSTRANDO LA MATRIZ CARACOL  </h1>");
            out.println("<h2>MATRIZ CARACOL  N= "+n+" </h2>");
            int [][] matriz= new int [n][n];
            int inicio=0;
            int nlimit=n-1;
            int c=1;
            while(c<=(n*n)){
                for(int i=inicio;i<=nlimit;i++){
                    matriz[inicio][i]=c++;
                }
                for(int i=inicio+1;i<=nlimit;i++){
                    matriz[i][nlimit]=c++;
                }
                for(int i=nlimit-1;i>=inicio;i--){
                    matriz[nlimit][i]=c++;
                }
                for(int i=nlimit-1;i>=inicio+1;i--){
                    matriz[i][inicio]=c++;
                }
            inicio = inicio+1;
            nlimit = nlimit-1;
            }
            out.println("<table>");
            for (int i=0;i<n;i++){   
                out.println();
                out.println("<tr>");
                for(int j=0;j<n;j++){ 
                    out.println("<td>");
                    out.print(matriz[i][j]);
                    out.println("</td>");
                }                     
                out.println("</tr>");
            } 
            out.println("</table>");
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
