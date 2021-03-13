package Fichier;

import java.io.BufferedReader;
import java.io.FileReader;

import OOP.Personne;

public class lire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personne p=null;
		// ouverture du fichier
		BufferedReader IN=null;
		try{
			IN=new BufferedReader(new FileReader("out"));
		} catch (Exception e){

			Erreur(e,1);
		}
		// données
		String ligne=null;
		String[] champs=null;
		String prenom=null;
		String nom=null;
		int age=0;

		// gestion des éventuelles erreurs
		try{

		while((ligne=IN.readLine())!=null){
		champs=ligne.split(",");
		prenom=champs[0];
		nom=champs[1];
		age=Integer.parseInt(champs[2]);
		System.out.println(""+new Personne(prenom,nom,age));
		}// fin while
		} catch (Exception e){
		Erreur(e,2);
		}
		// fermeture fichier
		try{
		IN.close();
		} catch (Exception e){
		Erreur(e,3);
		}
		}// fin main

		// Erreur
		public static void Erreur(Exception e, int code){

		System.err.println("Erreur : "+e);
		System.exit(code);
		}

}
