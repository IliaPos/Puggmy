package puggmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;

public class Display extends Graphic {
	
	
	public static void begin() throws IOException{
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
		System.out.println("To encrypt the message, press 1. " + "To decrypt the message, press 2");
		String numa = reader.readLine();
		int choosedWay = Integer.parseInt(numa);
		if(choosedWay == 1) {
			Logic.encrypter();
		} else if(choosedWay == 2) {
			Logic.decrypter();
		} else {
			System.err.println("Error");
		}
		
		
	}
	
	
	

	public static void main(String[] args) throws IOException {
	//	Graphic.init();
		begin();
		

	}

}