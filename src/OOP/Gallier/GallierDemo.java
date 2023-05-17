 
 public class GallierDemo 
 {
   public static void main(String[] args) 
   {
     //Automatix und Verleihnix erzeugen
    
     Gallier ax = new Gallier("Automatix", 32);
    
     Gallier vx = new Gallier("Verleihnix", 41, 4.2);
    
     //den zPegel fuer Automatix auf 6.5 setzen
    ax.setZPegel(6.5);
    
     //Methode pruegeln fuer Verleihnix aufrufen
    vx.pruegeln();
     
   }
 }
