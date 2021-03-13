package Inscription;

import java.util.ArrayList;

public class Test {

	static void Menu(){
		
		System.out.println("1.Pour créer une classe");
		System.out.println("2.Inscrire les étudiants");
		System.out.println("3.Chercher les étudiants d'une meme classe");
		System.out.println("4.Ordonner la liste des étudiant d'une meme classe");
		System.out.println("5.Pour quitter");
		
		switch(Base.Base.saisirEntier("Choisissez une des opération ci-haut affichée")){
		
		case 1:
			System.out.println (new Classe(Base.Base.saisirChaine_Caracteres("Saisissez le Département"),Base.Base.saisirChaine_Caracteres("Saisissez l faculté"),Base.Base.saisirChaine_Caracteres("Tapez le niveau de classe")));
			  
			  break;
		case 2:
			    Classe cl=null;
			    Classe.afficher_Toutes_les_Classes();
			    System.out.println("1 pour continuer l'inscription");
			    System.out.println("0 Pour arreter les demarcher d'inscription");
			    switch(Base.Base.saisirEntier("")){
			    case 1:
			    	  
			    	    cl=(Classe)Classe.getBd_cl().elementAt(Base.Base.saisirEntier("Choisissez la classe(index) dans laquelle on va te faire inscrire"));
			    	   new Inscription(new Etudiant(Base.Base.saisirChaine_Caracteres("Tapez le nom de l'etudiant"),Base.Base.saisirChaine_Caracteres("Tapez le prenom de l'etudiant"),Base.Base.saisirChaine_Caracteres("Tapez le matricule de l'etudiant"),Base.Base.saisirEntier("Tapez l'age de l'etudiant")),Base.Base.saisirChaine_Caracteres("Tapez l'annee academique"),cl);
			    	   System.out.println("Nouvel etudiant bien enregistré");
			    	   break;
			    case 2:
			    	System.out.println("On arrete d'inscrire le nouvel étudiant");
			    	break;
			    }
			    break;
		case 3:   
			
		    Classe.afficher_Toutes_les_Classes();
		    cl=(Classe)Classe.getBd_cl().elementAt(Base.Base.saisirEntier("Choisissez la classe(index) dans laquelle sont inscrits les étudiants à chercher"));
		   
		    ArrayList<Etudiant> list=Inscription.rechercher_Etudiant_By_Classe(cl,Base.Base.saisirChaine_Caracteres("Tapez l'année academique"));
			if(list==null || list.size()==0)
				System.out.println("Aucun étudiant n'est inscrit en "+cl);
			else {
				System.out.println("");
				System.out.println("Voici la liste des étudiants inscrits en"+cl);
				for(Etudiant e:list)
					System.out.println(e);
				System.out.println("");
				}
		    break;
		case 4:
			break;
		case 5:
			  System.exit(0);
			break;
		}
	} 
	
	static void Implements(){
		while(true)
			Menu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implements();
	}

}
