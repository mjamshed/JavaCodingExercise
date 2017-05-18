package javacodingexercise;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author mjamshed
 * Question 1
 * Write a class called IPValidationRegex which will use regular expression to
 * validate
 * input IP addresses according to the following criteria:
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and
 * D may range
 * from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't
 * be greater than 3.
 * Prepare a text file with a list of IP addresses and have your class read in
 * the file then
 * filter out any invalid IP address(es).
 */
public class IPValidationRegex {

	private static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	private static final String FILENAME = "c:\\tmp\\ipList.txt";
	private Pattern pattern;
	private Matcher matcher;

	IPValidationRegex() {
		pattern = Pattern.compile(IPADDRESS_PATTERN);
	}

	private boolean validate(String ipaddress) {
		matcher = pattern.matcher(ipaddress);
		return matcher.matches();
	}

	private void readIpFile() {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) {
				if (!validate(sCurrentLine))
					System.out.println("Invalid IP Address : " + sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPValidationRegex ipvr = new IPValidationRegex();
		ipvr.readIpFile();
	}

}
