package fr.um3.C2iprojet.connectionclient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classement {
	    private List<Integer> Score=new ArrayList<Integer>();
		
		public List<Integer> getScore() {
			return Score;
		}
		
		public void setScore(List<Integer> score) {
			Score = score;
		}
		
		
		
		
		 public void classeScore(int score) {
	        	
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
	                        tab_en_ordre = false;
	                    }
	                }
	                taille--;
	            }
	    }
	
		
	
}
			
	
	


