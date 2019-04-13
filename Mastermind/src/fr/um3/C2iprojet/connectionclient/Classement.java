package fr.um3.C2iprojet.connectionclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classement {
	    private List<Integer> Score=new ArrayList<Integer>();
	    //private Nomclient N;
	    
		
		public List<Integer> getScore() {
			return Score;
		}
		
		public void setScore(List<Integer> score) {
			Score = score;
		}
		
		public void AfficheClassement(Nomclient N) {
			
			
			System.out.println("Voici le classement du jeu : ");
			System.out.println("Noms   Scores");
			for(int i=0; i<Score.size(); i++) {
				
				System.out.println(N.getNoms().get(i)+"   "+Score.get(i));
				
				
			}
		}
		
		
		 public void classeScore(int score, Nomclient N) {
	        	
	        	this.Score.add(score);
	        	
	        	boolean tab_en_ordre = false;
	            int taille = Score.size();
	            while(!tab_en_ordre)
	            {
	                tab_en_ordre = true;
	                for(int i=0 ; i < taille-1 ; i++)
	                {
	                    if(Score.get(i) > Score.get(i+1))
	                    {
	                        
	                        int x;
	                        Collections.swap(Score, i, i+1);
	                        Collections.swap(N.getNoms(), i, i+1);
	                        tab_en_ordre = false;
	                    }
	                }
	                taille--;
	            }
	    }
	
		
	
}
			
	
	


