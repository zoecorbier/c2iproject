package fr.um3.c2iproject;

public class Serie implements java.io.Serializable {

    private  static  final  long serialVersionUID =  1350092881346723535L;

    private String nom, prenom ;

    private  int donnees ;

    public Serie(String nom, String prenom) {
       this.nom = nom ;
       this.prenom = prenom ;
   }

    public String toString() {
      StringBuffer sb =  new StringBuffer() ;
       return sb.append(nom).append(" ").append(prenom).toString() ;
   }
}
//////dans une méthode main
////// on simplifie le code en retirant la gestion des exceptions
//File fichier =  new File("tmp/serie.ser") ;

///// ouverture d'un flux sur un fichier
//ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(fichier)) ;
		
/////// désérialization de l'objet
//Serie m = (Serie)ois.readObject() ;
//System.out.println(m) ;

//fermeture du flux dans le bloc finally