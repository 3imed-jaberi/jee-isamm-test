<!DOCTYPE html>
<html>
<head>
<title> Insert POST </title>
</head>
<body>

  <form method="POST" action="InsererProduit">
     Nom de Produit : <input name="nameP" required/> <br/>
     Prix Unitaire : <input name="priceP" required/> <br/>
     Quantity : <select name="qteP"> 
          <% 
              for( int index = 0 ; index < 10 ; index++ ){ 
          %>
                    <option> <%= index+1 %> </option>  
          <%   
              }
          %> 
     </select> <br/>
     <button type="submit"> Ajouter </button>
  </form>
  
</body>
</html>