package puggmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Logic {
	public static void encrypter() throws IOException {
		String key;
		String hkey;
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));	
		System.out.println("Input the Key: ");
		System.out.print("To create a random number, write \"random\": ");
		String stringKey = reader.readLine();
		
			if (stringKey == "random") {
				key = randomNewKey();
				System.out.println("Your key is: " + key);
			} else {
				key = hkey;
			}
		System.out.println("Enter the text, which you want to encrypt");
		String startedText = reader.readLine();
		char [] arrayStartedText = startedText.toCharArray();
		char [] arrayMediumText = new char[startedText.length()];
		//System.out.println(arrayStartedText);
		
		for(int i=0;i<startedText.length();i++) {
			int i1 = arrayStartedText[i];
			i1 = i1 + key;
			arrayMediumText[i] = (char) i1;
		}
		startedText = new String(arrayMediumText);
		output(startedText);
		
	}
	
	

	private static String randomNewKey() {	
		
		
		int number1, number2;
		char let1, let2;
		number1 = new Random().nextInt(9);
		number2 = new Random().nextInt(9);
		let1 = (char)('A' + new Random().nextInt(26));
		let2 = (char)('A' + new Random().nextInt(26));
		char [] key = {Character.forDigit(number1, 10), let1, Character.forDigit(number2, 10), let2};
		String strkey = new String(key);
		System.out.println(strkey);
		return strkey;
	}



	public static void decrypter() throws IOException {
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));	
		System.out.print("Input the Key: ");
		String stringKey = reader.readLine();
		int key = Integer.parseInt(stringKey);
		System.out.println("Enter the word, which you want to encrypt");
		String decrypteredText = reader.readLine();
		char [] arrayDecrypteredText = decrypteredText.toCharArray();
		char [] arrayMediumText = new char[decrypteredText.length()];
		
		for(int i=0;i<decrypteredText.length();i++) {
			int i1 = arrayDecrypteredText[i];
			i1 = i1 - key;
			arrayMediumText[i] = (char) i1;
		}
		decrypteredText = new String(arrayMediumText);
		output(decrypteredText);
		
	}

	private static void output(String actualText) {
		
		System.out.println("Successful!");
		for (int i=0;i<actualText.length();i++) {
			System.out.print("-");
		}
		System.out.println("-");
		System.out.println(actualText);
		for (int i=0;i<actualText.length();i++) {
			System.out.print("-");
		}
		System.out.println("-");
		
	}

}
