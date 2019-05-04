public class Produit {
  // Attributs .. 
  private String nomProduit ;
  private double prixUnitaire ; 
  private int Quantite ; 
  
  // Constructor .. 
  public Produit( String product_name , double price_per_piece , int qte  ){
                    this.nomProduit = product_name ;
                    this.prixUnitaire = price_per_piece ;
                    this.Quantite = qte ;
  }

  // Getters ..

  public String getNomProduit() {
            return nomProduit;
  }

  
  public double getPrixUnitaire() {
            return prixUnitaire;
  }

  
  public int getQuantite() {
            return Quantite;
  }
  

  // Setters .. 

  public void setNomProduit(String nomProduit) {
            this.nomProduit = nomProduit;
  }
  

  public void setPrixUnitaire(double prixUnitaire) {
            this.prixUnitaire = prixUnitaire;
  }
  
  public void setQuantite(int quantite) {
            this.Quantite = quantite;
  }

}