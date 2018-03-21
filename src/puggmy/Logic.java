package puggmy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Logic {
	public static String encrypter(String startedText , String key)  {
		
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

		for(int i=0;i<startedText.length();i++) {
			arrayMediumNumbers[i] = (char) (arrayStartedText[i] + i1);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] + i2);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] + i3);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] + i4);
		}
		startedText = new String(arrayMediumNumbers);

		return startedText;
	}
	
	

	public static String randomNewKey() {	
		
		
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



	public static String decrypter(String startedText , String key) {



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

		for(int i=0;i<startedText.length();i++) {
			arrayMediumNumbers[i] = (char) (arrayStartedText[i] - i1);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] - i2);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] - i3);
			arrayMediumNumbers[i] = (char) (arrayMediumNumbers[i] - i4);
		}
		startedText = new String(arrayMediumNumbers);

		return startedText;
	}


}
