package fr.um3.C2iprojet.connectionclient;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class Nomclient {
		private String NomJoueur;
		private List<String> Noms = new ArrayList<String>();
		public List<String> getNoms() {
			return Noms;
		}
		public void setNoms(List<String> noms) {
			Noms = noms;
		}
		public String getNomJoueur() {
			return NomJoueur;
		}
		public void setNomJoueur(String nomJoueur) {
			NomJoueur = nomJoueur;
		}
		public void NomListe(Scanner s ) {
			System.out.println("Veuillez saisir votre nom:");
			String c= s.nextLine();
			int i=0;
			boolean var=false;
			while((i<Noms.size()) && (var==false)) {
				if(Noms.get(i).equals(c)) {
					System.out.println("Avez-vous deja joue ?");
					c=s.nextLine();
					if(c.equals("oui")) {
						NomJoueur=Noms.get(i);
						var=true;
						System.out.println("Nom saisis avec succes");
						}
					else {
						System.out.println("Ce nom est deja utilise ;(");
						this.NomListe(s);
						}
					}
			else{
				i++;
					}}
			if(i==Noms.size()) {
				Noms.add(c);
				NomJoueur=c;
				System.out.println("Nom saisis avec succes");
			}
			
			
			
	
			
		}
		
		
		public static void main(String[] args) {
			
			
			
		}

	
	
	
	
	
	
	
	

}
