package puggmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Logic {
	public static void encrypter() throws IOException {
		String key;
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));	
		System.out.println("Input the Key: ");
		System.out.print("To create a random number, write \"random\": ");
		String stringKey = reader.readLine();
		
			if (stringKey.equals("random") ) {
				key = randomNewKey();
				System.out.println("Your key is: " + key);
					
			} else {
				key = stringKey;
			}
		System.out.println("Enter the text, which you want to encrypt");
		String startedText = reader.readLine();
		char [] arrayStartedText = startedText.toCharArray();
		char [] arrayMediumNumbers = new char[startedText.length()];
		char [] arrayKeyChars = key.toCharArray();
		System.out.println(arrayKeyChars);
		int i1 = Character.getNumericValue(arrayKeyChars[0]);
		int i2 = Character.getNumericValue(arrayKeyChars[1]);
		int i3 = Character.getNumericValue(arrayKeyChars[2]);
		int i4 = Character.getNumericValue(arrayKeyChars[3]);
		i2 = i2-9;
		i4 = i4-9;
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
//		System.out.println(i4);
		for(int i=0;i<startedText.length();i++) {
			arrayMediumNumbers[i] = (char) (arrayStartedText[i] + i1);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] + i2);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] + i3);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] + i4);
		}
		startedText = new String(arrayMediumNumbers);
		output(startedText);
		
	}
	
	

	private static String randomNewKey() {	
		
		
		int number1, number2;
		char let1, let2;
		number1 = new Random().nextInt(9);
		number2 = new Random().nextInt(9);
		let1 = (char)('A' + new Random().nextInt(69 - 65));
		let2 = (char)('A' + new Random().nextInt(69 - 65));
		char [] key = {Character.forDigit(number1, 10), let1, Character.forDigit(number2, 10), let2};
		String strkey = new String(key);
		System.out.println(strkey);
		return strkey;
	}



	public static void decrypter() throws IOException {
		String key;
		BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));	
		System.out.println("Input the Key: ");
		String stringKey = reader.readLine();
		
		key = stringKey;

		System.out.println("Enter the text, which you want to decrypt");
		String startedText = reader.readLine();
		char [] arrayStartedText = startedText.toCharArray();
		char [] arrayMediumNumbers = new char[startedText.length()];
		char [] arrayKeyChars = key.toCharArray();
		System.out.println(arrayKeyChars);
		int i1 = Character.getNumericValue(arrayKeyChars[0]);
		int i2 = Character.getNumericValue(arrayKeyChars[1]);
		int i3 = Character.getNumericValue(arrayKeyChars[2]);
		int i4 = Character.getNumericValue(arrayKeyChars[3]);
		i2 = i2-9;
		i4 = i4-9;
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
//		System.out.println(i4);
		for(int i=0;i<startedText.length();i++) {
			arrayMediumNumbers[i] = (char) (arrayStartedText[i] - i1);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] - i2);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] - i3);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] - i4);
		}
		startedText = new String(arrayMediumNumbers);
		output(startedText);
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
