package project5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;

import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Bobby
 */
public class Decoder implements DecoderInterface {
	private String text = "";

	public Decoder() {

	}

	public Decoder(File dataFile) throws FileNotFoundException {
		Scanner file = new Scanner(dataFile);
		while (file.hasNextLine()) {

			String line = file.nextLine();
			text += line;

		}
	}

	@Override
	public boolean add(String data) {
		text = data;
		return true;
	}

	@Override
	public boolean add(File dataFile) throws FileNotFoundException {
		Scanner file = new Scanner(dataFile);
		while (file.hasNextLine()) {
			String line = file.nextLine();
			text += line;
		}
		return true;
	}

	@Override
	public String getCode() {
		return text;
	}

	@Override
	public int getErrorCount() {
		int errorCount = 0;
		int oneCount = 0;
		int zeroCount = 0;
		int i = 0;
		while (i < text.length()) {
			if (text.charAt(i) == '1') {
				oneCount += 1;
			}
			if (text.charAt(i) == '0') {
				zeroCount += 1;
			} else {

			}

			if (i % 3 == 0) {
				if (oneCount == 2 || zeroCount == 2) {
					errorCount += 1;
				}

				oneCount = 0;
				zeroCount = 0;
			}
			i++;
		}
		return errorCount;
	}

	@Override
	public String getErrorMessage() {
		if (text.length() % 24 != 0) {
			return "String is incomplete";
		}
		return "";
	}

	@Override
	public String toString() {
		if (this.getErrorMessage() == "String is incomplete") {
			return "Error: String is incomplete";
		}
		int oneCount = 0;
		int zeroCount = 0;
		int i = 0;
		String message = "";
		String Character = "";
		while (i < text.length()) {
			if (text.charAt(i) == '1') {
				oneCount += 1;
			} else if (text.charAt(i) == '0') {
				zeroCount += 1;
			} else {
				return "Error: Symbol is binary digit";
			}

			if (i % 3 == 2) {
				if (oneCount >= 2) {
					Character = Character + "1";
				} else if (zeroCount >= 2) {
					Character = Character + "0";
				}
				oneCount = 0;
				zeroCount = 0;
			}
			if (i % 24 == 23) {
				String reversed = new StringBuilder(Character).reverse().toString();
				byte letter = (byte) Integer.parseInt(reversed, 2);
				//byte letter = new Byte(new StringBuilder(Character).reverse().toString());
				message += (char) letter;
				Character = "";
			}
			i++;
		}
		return message;
	}
    
    public  void main(String args[]) throws FileNotFoundException{
        
        Decoder test = new Decoder(new File ("ECCtest.txt"));
        System.out.println(test);

}
 
    }
   

