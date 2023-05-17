
 public class Gallier
 { 
   //Attribute name, alter und zPegel
   String name;
   int alter;
   double zPegel;
  
  
   //Konstruktor
   
   public Gallier() {}
  
   public Gallier(String derName){
	  name = derName;
   }
  
   public Gallier (String derName, int dasAlter)
   {                             
     name = derName;
     alter = dasAlter;
   }
  
  public Gallier (String derName, int dasAlter, double zPegel)
   {                             
     name = derName;
     alter = dasAlter;
     this.zPegel = zPegel;
   }
  
   //Methode pruegeln
  
   void pruegeln()
   {
    
     if (zPegel > 5)
     {
		 zPegel = zPegel/2;	
	 }
	else
	
	 {
		 System.out.print(name + " ruft: \"Ich brauche Zaubertrank!\"");
	 }
   }
  
   //Methode zPegelSetzen
  public void setZPegel(double zPegel){
	  this.zPegel = zPegel;
  }
 }
