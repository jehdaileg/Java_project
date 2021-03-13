package Fichier;

import java.io.FileWriter;
import java.io.PrintWriter;

public class ecrire {

	public static void main(String[] arg){
	// ouverture du fichier
	PrintWriter fic=null;
	try{

		fic=new PrintWriter(new FileWriter("out"));

	} catch (Exception ex){

		Erreur(ex,1);
	}
	// écriture dans le fichier
	try{

	fic.println("Jean,Dupont,27");
	fic.println("Pauline,Garcia,24");
	fic.println("Gilles,Dumond,56");

	} catch (Exception e){

			Erreur(e,3);

	}

	// fermeture du fichier

	try{

		fic.close();

	} catch (Exception e){


	   	Erreur(e,2);
	}
	}// fin main

	private static void Erreur(Exception e, int code){

			System.err.println ("Erreur : "+e);
			System.exit(code);

	}//Erreur


}
