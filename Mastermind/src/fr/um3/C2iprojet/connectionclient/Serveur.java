package fr.um3.C2iprojet.connectionclient;
import java.io.IOException;
import java.net.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	


		
	public static void main(String[] args) throws Exception {
			
			
		ServerSocket s = new ServerSocket(3); // 6020 => port de l'application
		System.out.println("START");
		Socket soc = s.accept(); // accepte connexion
		BufferedReader ins = new BufferedReader(
												new InputStreamReader(soc.getInputStream()) );
		PrintWriter outs = new PrintWriter( new BufferedWriter(
												new OutputStreamWriter(soc.getOutputStream())), true);
			// insertion de la boucle du serveur ici
			
		while(true) {
				
			String str= ins.readLine();
			if(str.equals("END")) break;
			System.out.println("ECHO = "+str);
			outs.println(str);
				
			
			}
			
		ins.close();
		outs.close();
		soc.close();
		}

	}
	/*public static void main(String[] zero){
		
		ServerSocket socket;
		try {
		socket = new ServerSocket(2009);
		Thread t = new Thread(new Accepter_clients(socket));
		t.start();
		System.out.println("Mes employeurs sont prêts !");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

class Accepter_clients implements Runnable {

	   private ServerSocket socketserver;
	   private Socket socket;
	   private int nbrclient = 1;
		public Accepter_clients(ServerSocket s){
			socketserver = s;
		}
		
		public void run() {

	        try {
	        	while(true){
			  socket = socketserver.accept(); // Un client se connecte on l'accepte
	                  System.out.println("Le client numero "+nbrclient+ " est connecte !");
	                  nbrclient++;
	                  socket.close();
	        	}
	        
	        } catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		

	



