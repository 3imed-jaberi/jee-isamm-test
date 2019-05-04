import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AffichageProduits")
public class AffichageProduits extends HttpServlet {
          

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
          ArrayList<Produit> myData = GestionProduits.getListProduits();
          
          response.setContentType("text/html");
          PrintWriter Write = response.getWriter();
          
          Write.print("<h2> I have "+ myData.size() +" product(s) .. </h2>");
          Write.print("<table border='1'><tr><td> nom de produit </td><td> prix unitaire </td><td> quantitÃ© </td><td> prix global </td></tr>");
          
          for (Produit piece : myData) {
                Write.print("<tr>");
                Write.print("<td> "+piece.getNomProduit()+" </td>");
                Write.print("<td> "+piece.getPrixUnitaire()+" </td>");
                Write.print("<td> "+piece.getQuantite()+" </td>");
                Write.print("<td> "+(piece.getPrixUnitaire()*piece.getQuantite())+" </td>");
                Write.print("</tr>");
          }

          Write.print("</table>");

   }

}