package fr.um3.C2iprojet.connectionclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Clients {
	
	static final int port= 12;
	
	public static void main(String[] args) throws Exception {
		
		Socket socket= new Socket(args[0],port);
		System.out.println("SOCKET= "+socket);
		BufferedReader ins = new BufferedReader(
				new InputStreamReader(socket.getInputStream()) );
		PrintWriter outs = new PrintWriter( new BufferedWriter(	new OutputStreamWriter(socket.getOutputStream())), true);
		
		String str= "bonjour";
		
		for(int i=0; i<10; i++) {
			
			str= str+Integer.toString(i);
			outs.println(str);
			str= ins.readLine();
		}
		
		System.out.println("END");
		outs.println("END");
		ins.close();
		outs.close();
		socket.close();
		
		
		
		
		
		
	}

}
