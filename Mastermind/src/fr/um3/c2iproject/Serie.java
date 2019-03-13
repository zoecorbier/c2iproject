package fr.um3.c2iproject;

public class Serie implements java.io.Serializable {

    private  static  final  long serialVersionUID =  1350092881346723535L;

    private String nom, prenom ;

   

    public Serie(String nom, String prenom) {
       this.nom = nom ;
       this.prenom = prenom ;
   }

    public String toString() {
      StringBuffer sb =  new StringBuffer() ;
       return sb.append(nom).append(" ").append(prenom).toString() ;
   }
}
