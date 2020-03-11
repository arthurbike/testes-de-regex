package testesRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SegundoTeste {

	public static void main(String[] args) {

		// Encontrar um padra� de 3 d�gitos e escreve-lo na tela.

		String regex = "\\d{3}";
		String texto = "Um de voc�s dois encontrou o n�mero 999";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		System.out.println("Texto: " + texto);
		
		while (matcher.find()) {
			System.out.println("Valor encontrado: " + texto.substring(matcher.start(), matcher.start()+3));
			System.out.println("�ndice de in�cio do valor encontrado: " + matcher.start());
		}

	}

}
