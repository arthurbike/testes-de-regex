package testesRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TerceiroTeste {

	public static void main(String[] args) {
		
		String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
		String texto = "Um cliente possui cpf: 023.165.631-19, o outro possui o cpf: 012.321.456-27.";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		System.out.println("Dado um texto, extrair os cpfs: ");
		System.out.println("Texto:" + texto);
		System.out.println("__________________________________________________________________________________");
		System.out.println("Extração: ");
		
		while(matcher.find()) {
			System.out.println("cpf: " + texto.substring(matcher.start(), matcher.end()));

		}
	}

}
