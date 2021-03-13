package Inscription;

import java.util.ArrayList;

public class Test {

	static void Menu(){
		
		System.out.println("1.Pour cr�er une classe");
		System.out.println("2.Inscrire les �tudiants");
		System.out.println("3.Chercher les �tudiants d'une meme classe");
		System.out.println("4.Ordonner la liste des �tudiant d'une meme classe");
		System.out.println("5.Pour quitter");
		
		switch(Base.Base.saisirEntier("Choisissez une des op�ration ci-haut affich�e")){
		
		case 1:
			System.out.println (new Classe(Base.Base.saisirChaine_Caracteres("Saisissez le D�partement"),Base.Base.saisirChaine_Caracteres("Saisissez l facult�"),Base.Base.saisirChaine_Caracteres("Tapez le niveau de classe")));
			  
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
			    	   System.out.println("Nouvel etudiant bien enregistr�");
			    	   break;
			    case 2:
			    	System.out.println("On arrete d'inscrire le nouvel �tudiant");
			    	break;
			    }
			    break;
		case 3:   
			
		    Classe.afficher_Toutes_les_Classes();
		    cl=(Classe)Classe.getBd_cl().elementAt(Base.Base.saisirEntier("Choisissez la classe(index) dans laquelle sont inscrits les �tudiants � chercher"));
		   
		    ArrayList<Etudiant> list=Inscription.rechercher_Etudiant_By_Classe(cl,Base.Base.saisirChaine_Caracteres("Tapez l'ann�e academique"));
			if(list==null || list.size()==0)
				System.out.println("Aucun �tudiant n'est inscrit en "+cl);
			else {
				System.out.println("");
				System.out.println("Voici la liste des �tudiants inscrits en"+cl);
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
