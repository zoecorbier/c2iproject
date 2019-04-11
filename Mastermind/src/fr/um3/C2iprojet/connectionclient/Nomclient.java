package fr.um3.C2iprojet.connectionclient;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class Nomclient {
		//private List<Nom> Noms =new ArrayList<Nom>();
		/*private Nom e= new Nom();*/
		// prend en compte un nom rentr√© par un client 
		
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


		private String NomJoueur;
		
		
		
		
		public void NomListe() {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Veuillez saisir votre nom:");
			String c= s.nextLine();
			
			int i=0;
			boolean var=false;
			
			while((i<Noms.size()) && (var==false)) {
				
				
				if(Noms.get(i).equals(c)) {
					System.out.println("Avez-vous dÈj‡ jouÈ ?");
					c=s.nextLine();
					
					if(c.equals("oui")) {
						
						NomJoueur=Noms.get(i);
						var=true;
						System.out.println("Nom saisis avec succËs");
						
						
					}
					else {
						
						System.out.println("Ce nom est dÈj‡ utilisÈ ;(");
						this.NomListe();
						
					}
					
				}
				
				
				
				else{
					
					
					i++;
					
					
				}
			}
			
			if(i==Noms.size()) {
				Noms.add(c);
				NomJoueur=c;
				System.out.println("Nom saisis avec succËs");
			}
			
			
			
			
			
		}
		
		


	
	
	
	
	
	
	
	

}
