package fr.um3.C2iprojet.connectionclient;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class Nomclient {
	private List<Nom> Noms =new ArrayList<Nom>();
	private Nom e= new Nom();// prend en compte un nom rentré par un client 
	

	public void Nomliste(Nom e) {
		for (int i=0;i <= Noms.size();i++){//parsours la liste des noms déjà utlisé 
			if (Noms.get(i)==e) {//vérifie si le nomexiste déjà
				Scanner s = new Scanner(System.in);
				System.out.println("Avez-vous déjà joué?");
				String n=s.nextLine();
				if (n=="oui") {
					i= Noms.size()+1;}
				else {
					Scanner k= new Scanner (System.in);
					System.out.println("Veuillez saisir un autre nom, ce nom est déjà utilisé");
					//Nom o=s.nextLine();
					//e=o;
				}
				}
			else if(i== Noms.size()){
				Noms.add(e);
				
			}
		}
	}

	
	
	
	
	
	
	
	

}
