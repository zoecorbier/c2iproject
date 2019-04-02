package fr.um3.C2iprojet.connectionclient;

import java.util.ArrayList;
import java.util.List;



public class nomclient {
	private List<Nom> Noms =new ArrayList<Nom>();
	private Nom e= new Nom();
	

	public void Nomliste(Nom e) {
		for (int i=0;i <= Noms.size();i++){
			if (Noms.get(i)==e) {
				i= Noms.size()+1;}
			else if(i== Noms.size()){
				Noms.add(e);
				
			}
		}
	}

	
	
	
	
	
	
	
	

}
