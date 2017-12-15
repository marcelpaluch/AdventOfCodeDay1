package AdventOfCodeDay1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		String outString, suba, subb;
		int wynik;
		Scanner in = new Scanner(new FileReader("cyfry.txt"));
		StringBuilder sb = new StringBuilder();
		while(in.hasNext()) {
		    sb.append(in.next());
		}
		in.close();
		outString = sb.toString();
		wynik = 0;
		for (int i = 0; i < outString.length()-1; i++) {
			suba = outString.substring(i, i+1);
			subb = outString.substring(i+1, i+2);
			if (Integer.parseInt(suba) == Integer.parseInt(subb))
				wynik += Integer.parseInt(suba);
		}
		suba = outString.substring(0, 1);
		subb = outString.substring(outString.length()-1, outString.length());
		if (Integer.parseInt(suba) == Integer.parseInt(subb))
			wynik += Integer.parseInt(suba);
		 System.out.println(wynik);
	}

}
