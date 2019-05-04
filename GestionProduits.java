import java.util.ArrayList;


public class GestionProduits {

  public static ArrayList<Produit> listeProduits = GestionProduits.intialiserListeProduit();

  private static ArrayList<Produit> intialiserListeProduit(){
    listeProduits = new ArrayList<Produit>();
    Produit product = new Produit("iphone",1499.55,10);
    listeProduits.add(product);
    product = new Produit("sumsung",1299.25,15);
    listeProduits.add(product);
    product = new Produit("nokia",1000.45,28);
    listeProduits.add(product);
    product = new Produit("huweai",999.99,12);
    listeProduits.add(product);
    return listeProduits;
 }

  public static ArrayList<Produit> getListProduits(){
          return GestionProduits.listeProduits ;
  }

  public static void ajouterProduit(Produit P){
          GestionProduits.listeProduits.add(P);    
  }


}