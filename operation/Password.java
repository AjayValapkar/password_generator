package passwordgenerator.operation;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Password implements passwordInterface{
	private static String numbers = "0123456789";
	private static String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String smallLetter = "abcdefghijklmnopqrstuvwxyz";
	private static String symbols = "!@#$%^&*_=+-/.?<>)";
	static String password = numbers + capitalLetter + smallLetter;
	static String charpass = capitalLetter + smallLetter;
	static String combinePassword = numbers + capitalLetter + smallLetter + symbols;
	Random random = new Random();

	public String generateNumberPassword(int lenght) {
		int pincode[] = new int[lenght];
		StringBuilder strbulid = new StringBuilder();
		for (int i = 0; i < lenght / 2; i++) {
			pincode[i] = numbers.charAt(random.nextInt(numbers.length()));
			strbulid.append(pincode[i]);
		}
		return strbulid.toString();
	}

	public String generateCharPassword(int length) {
		char[] password = new char[length];
		for (int i = 0; i < length; i++)
			password[i] = charpass.charAt(random.nextInt(charpass.length()));
		String newpass = new String(password);
		return newpass;
	}

	public String generateCombinePassword(int length) {
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			password[i] = combinePassword.charAt(random.nextInt(combinePassword.length()));
		}
		String combinepassword = new String(password);
		return combinepassword;
	}

}
