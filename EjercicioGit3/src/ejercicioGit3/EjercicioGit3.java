package ejercicioGit3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioGit3 {
    public static int contador(String texto) {
    	if(texto == null || texto.isEmpty()) {
    		return 0;
    	}
    	
    	String[] palabras = texto.split("\\s+");
    	
    	return texto.length();
    }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una frase");
		String frase = lector.readLine();
		int numPalabras = contador(frase);
		System.out.println(numPalabras);
		

	}

}
