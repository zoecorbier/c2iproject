package fr.um3.c2iproject;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
 
    private static final char OK = 'O';
    private static final char FAUX = 'X';
 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        final int NB_CHIFFRES = 4; // Ce sont les param�tres par d�faut du mastermind
        final int MAX = 4;         // On pourrait aussi demander � l'utilisateur de les modifier
        final int ESSAIS_MAX = 12; // Nb chiffre et MAX sont le nombre de chiffres � trouver, Essais MAX est le nombre d'essais maximum avant de perdre une partie
 
        final int[] solution = new int[NB_CHIFFRES];
 
        Random r = new Random(); 				//Ce sont les chiffre � trouver, g�n�r�s al�atoirement � chaque partie gr�ce � Random
        for(int i=0 ; i<NB_CHIFFRES ; i++) {
            solution[i] = r.nextInt(MAX+1); 	//MAX correspondants au nombre de chiffres � trouver
        }
 
        int count = 0;
        				// On d�crit le fonctionnement du jeu au joueur
        System.out.println("Mastermind, trouve la combinaison des " + NB_CHIFFRES + " chiffres entre 0 et " + MAX + "."); 
        System.out.println ( " O signifie que c'est le bon chiffre � la bonne place et X signifie que c'est le mauvais chiffre.");
        System.out.println ( "Vous devez rentrer les combinaisons de chiffres sous la forme d'une suite de 4 chiffres, exemple : 2019 ");       
        System.out.println("Attention, vous avez droit a " + ESSAIS_MAX + " essais");
        System.out.println("----------------------------");
 
 
        int[] chiffres = new int[NB_CHIFFRES];   // On cr�er un tableau contenant les chiffres � trouver
        boolean victoire = false;				 // On se servira du boolean plus tard
        do {
            System.out.println("Essai n� " + (count+1) + "/" + ESSAIS_MAX + " :"); // Cette ligne permet de compter et de montrer au joueur son nombre d'essais restant
            int nombreSaisi = sc.nextInt(); 									   // On d�tecte le nombre saisi par le joueur avec le scanner

            for(int i=0 ; i<NB_CHIFFRES ; i++)
                chiffres[i] = (int) (nombreSaisi / (Math.pow(10, (NB_CHIFFRES-i-1)) ))%10;	  // On r�cup�re les chiffres � la position i dans nombreSaisies 
            																				 // Math.pow �leve 10 � la puissance NBChiffres - i - 1 et modulo 10, ce qui nous permet de s�parer les 4 chiffres du nombre rentr� par le joueur
            for(int i=0 ; i<NB_CHIFFRES ; i++)
                System.out.print(chiffres[i] + " ");				// On renvoie les 4 chiffres donn�s par le joueur et on les s�pare d'un espace pour plus de clart�
            System.out.println();									// On passe � la ligne
 

            victoire = true; 										// On met vrai pour ce boolean pour l'instant
            for(int i=0 ; i<NB_CHIFFRES ; i++) {
                boolean bonChiffre = chiffres[i] == solution[i];	// Second boolean Bonchiffre, si le chiffre rentr� par le joueur est �gal au chiffre du jeu g�n�r� par Random
                System.out.print( (bonChiffre ? OK : FAUX) + " ");  // Condition ternaire Bonchiffre si True renvoyer apr�s le ? "OK" sinon renvoyer apr�s le : "FAUX"
                												    // OK correspondant � un O dans la console et FAUX � un X (en dessous des 4 chiffres rentr�s par l'utilisateur et renvoy�s par le jeu)
             
                victoire = victoire && bonChiffre; 					// Victoire sera vrai UNIQUEMENT si bonChiffre vaut vrai a CHAQUE tour de boucle
            }
            System.out.println(); 									// On passe � la ligne
 
            count++;
 
            
        }while(!victoire && count < ESSAIS_MAX);
        if(count == ESSAIS_MAX)													// Le compteur compte chaque essai et arr�te le jeu si l'on arrive au nombre d'essais max
            System.out.println("Malheuresement vous avez �puis�s vos " + ESSAIS_MAX + " essais, la partie est termin�e");
        else
        	System.out.println("Victoire En seulement "+count+ " coups");		// Le jeu donne le nombre d'essai qu'il aura fallu au joueur pour r�ussir la partie
        sc.close();
    }
}
