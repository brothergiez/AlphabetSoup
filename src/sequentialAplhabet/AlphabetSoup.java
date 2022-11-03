package sequentialAplhabet;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabetSoup {
	public static void main(String[] args) {

		//FOR DEFAULT SAMPLE 
		System.out.println(sortTheString("hello"));
		System.out.println(sortTheString("coderbyte"));
		System.out.println(sortTheString("hooplah"));

		//FOR INTERACTIVE CONSOLE
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sortTheString(in);
	}

	static String sortTheString(String str) {
		char[] strArray = str.toCharArray();
		Arrays.sort(strArray);
		String result = String.valueOf(strArray);
		return result;
	}

	static void sendResult(String result) {
		System.out.println(result);
	}
}
