package assignment1;
/**
 * do encryption and decryption
 * get the message and how much want to shift from the user
 * then, call the methods from CeaserClass do encryption and decryption
 * 
 * @author jun_july
 *
 */

import java.util.Scanner;

 //

public class Ceaser {

	public static void main(String[] args) {
	
		Scanner Keyboard = new Scanner(System.in);
		
		String Encryption_input;
		int Encryption_shift;
		
		System.out.println("Please enter your message: ");
		Encryption_input= Keyboard.next();
		CeaserClass Ceaser = new CeaserClass();
		
		System.out.println("Please enter how much you want to shift: ");
		Encryption_shift = Keyboard.nextInt();
		
		String afterEncryption = Ceaser.encryption(Encryption_input,Encryption_shift);
		System.out.println("After encryption, the message is " + afterEncryption);
		
		String Decryption_input;
		int Decryption_shift;
		
		System.out.println("Please enter your message: ");
		Decryption_input= Keyboard.next();
		
		System.out.println("Please enter how much you want to shift: ");
		Decryption_shift = Keyboard.nextInt();
		
		
		String afterDecryption = Ceaser.decryption(Decryption_input,Decryption_shift);
		System.out.println("After decryption, the message is " + afterDecryption);
		
		
	}

}
