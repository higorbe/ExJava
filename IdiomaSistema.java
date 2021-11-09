package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {
	public static void main(String[] args) {
		Locale local = Locale.getDefault();
		System.out.print("A linguagem do seu computador é: ");
		System.out.println(local.getDisplayLanguage());
	}
}
