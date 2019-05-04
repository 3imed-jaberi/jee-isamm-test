import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsererProduit")
public class InsererProduit extends HttpServlet {
          

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
          String nameP = request.getParameter("nameP");
          double priceP = Double.parseDouble(request.getParameter("priceP"));
          int qteP = Integer.parseInt(request.getParameter("qteP"));

          Produit product = new Produit(nameP,priceP,qteP);

          response.setContentType("text/html");
          PrintWriter Write = response.getWriter();

          try {
                 GestionProduits.ajouterProduit(product);
                 Write.print("<h1> Success ! </h1>");
                 Write.print("<a href='/AffichageProduits'> Display All Prodcuts </a>");
          }catch (Exception e) {
             System.out.println("The errors is : \n"+e);
             Write.print("<h1> Failed ! </h1>");
             Write.print("<a href='/AffichageProduits'> Display All Prodcuts </a>");
          }
   }

}