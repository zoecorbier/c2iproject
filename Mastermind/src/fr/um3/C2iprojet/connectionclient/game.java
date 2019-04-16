package fr.um3.C2iprojet.connectionclient;

import java.util.Scanner;

public class game {

	 public static void main(String[] args) {
		 
		 Menu Game= new Menu();
		 Scanner s = new Scanner(System.in);
		Game.creerPartie(s);
		Game.findepartie(s);
		
		
	 }
}
