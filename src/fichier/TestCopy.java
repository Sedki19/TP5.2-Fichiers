package fichier;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestCopy {
	//Exercice 4
	static void cryptage(String CheminSource, String cheminDestination) throws IOException {
		File inputFile = new File(CheminSource);
		File outputFile = new File(cheminDestination);
		BufferedReader in = new BufferedReader(new FileReader(inputFile));
		BufferedWriter out = new BufferedWriter (new FileWriter(outputFile));
		String line;
		String newLine;
		
		
		while ((line = in.readLine()) != null) {
			newLine ="";
			
			for (int i = 0 ; i<line.length() ;i++) {
				newLine += (char)((int)(line.charAt(i))+1); 	
							}
			
			out.write(newLine);
			out.newLine();
		}
		out.close();
		in.close();
	}
	public static void main(String[] args) throws IOException {
		File inputFile = new File("E:\\fichiers\\in.txt");
		File outputFile = new File("E:\\fichiers\\out.txt");
		BufferedReader in = new BufferedReader(new FileReader(inputFile));
//BufferedWriter out = new BufferedWriter (new FileWriter(outputFile));

		String line;
//Exercice 1
		/*
		 * while ((line = in.readLine()) != null) { out.write(line); out.newLine(); }
		 * System.out.println("Copied successfully");
		 */

//out.close();
		
		
//Exercice 2
/*
		BufferedReader newc = new BufferedReader(new InputStreamReader(System.in));
		Scanner c = new Scanner(System.in);

		System.out.println("User : ");
		String user = newc.readLine();
		System.out.println("Password : ");
		String password = c.nextLine();
		boolean test = false;

		while ((line = in.readLine()) != null) {
			String[] word = line.split(" ");
			if (word[0].equals(user.trim()) && word[1].equals(password.trim())) {

				test = true;
				break;
			}
		}
		if (test)
			System.out.println("Authentification réussi");
		else
			System.out.println("PB Authentification");
*/
		
//Exercice 3
		
		int nbrLine = 0;
		int nbrCar = 0;
		int nbrMot = 0;
		while ((line = in.readLine()) != null) {
			nbrLine ++;
			nbrCar += line.length();
			StringTokenizer tokenizer = new StringTokenizer(line);
			nbrMot += tokenizer.countTokens();
		}
		
		 	System.out.println("Nombre de lignes : " + nbrLine);
	        System.out.println("Nombre de mots : " + nbrMot);
	        System.out.println("Nombre de caractères : " + nbrCar);
		
		

	       

	        
	        
	        
		in.close();
		
		//Exercice 4
		cryptage("E:\\fichiers\\in.txt","E:\\fichiers\\out.txt");
		

	}
	

}
