package testesRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrimeiroTeste {

	public static void main(String[] args) {

		String texto = "ababaaaba";
		String regex = "aba";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		while(matcher.find()) {
			System.out.println("Índice do início: " + matcher.start());
		}
		
	}

}
