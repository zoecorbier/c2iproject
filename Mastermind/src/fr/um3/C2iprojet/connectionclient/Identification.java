package fr.um3.C2iprojet.connectionclient;
import java.io.IOException;
import java.net.*;

public class Identification {

	public static void main(String[] zero){
		
		Socket socket;
		try {
		socket = new Socket("localhost",2009);
		socket.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

