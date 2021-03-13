package Exercices;
import Base.*;
public class Test {

	
	static Enfant[] children_belong_ToManan(){
		Enfant [] t=null;
		
		System.out.println("1.Tapez (1) si la mama a au moins un enfant!");
		System.out.println("2.Tapez 0 si la maman n'a pas d'enfant");
		
		switch(Base.saisirEntier("")){
		case 0:
			return t;
			
		case 1:
			t=new Enfant[Base.saisirEntier("Combien d'enfants a -t-elle?")];
			for(int i=0;i<t.length;i++)
				{
				  t[i]=new Enfant();
				  t[i].ajouter(Base.saisirChaine_Caracteres("Saisissez le nom de l'efant"), Base.saisirChaine_Caracteres("Saisissez le preno de l'enfant"),Base.saisirChaine_Caracteres("Saisissez le genre de l'enfant"),Base.saisirEntier("saisissez l'age de l'enfant"));
				}break;
	
		}
		return t;
	}
	static Mama[] Famille_Des_Maman(){		
		Mama [] mam=new Mama[2];
		
		for(int i=0;i<mam.length;i++){
			//mam[i]=new Mama();
			mam[i]=new Mama(Base.saisirChaine_Caracteres("Tapez le nom de Mama"), Base.saisirChaine_Caracteres("Tapez le prenom de Mama"), Base.saisirChaine_Caracteres("Tapez l'adresse de Mama"), Base.saisirChaine_Caracteres("Tapez la nationalite de Maman"),Base.saisirEntier("Tapez l'age de la Mama"),null);
		
			mam[i].setChildren(children_belong_ToManan());
		}
		
		//Affiche les Mamans		
		for(int i=0;i<mam.length;i++)
			mam[i].afficher_Mama();
		
		return mam;
	}
	
	static void Test_Polymorphe(){
		
		Personne []empl=new Personne[8];
		
		//on construit le tableau d'employés
		for(int i=0;i<empl.length;i++){
			
			if(i<5){//employés
				empl[i]=new Employe(Base.saisirChaine_Caracteres("Tapez le nom de la Personne"),Base.saisirChaine_Caracteres("Tapez le prenom de la Personne"),Base.saisirChaine_Caracteres("Tapez la date de naissance de la Personne"),Base.saisirReel("Tapez le salaire de la Personne"));
				//(String no, String pr, String dt,float s)
			}
			else if(i<7)//Chefs
			{
				empl[i]=new Chef(Base.saisirChaine_Caracteres("Tapez le nom de la Personne"),Base.saisirChaine_Caracteres("Tapez le prenom de la Personne"),Base.saisirChaine_Caracteres("Tapez la date de naissance de la Personne"),Base.saisirReel("Tapez le salaire de la Personne"),Base.saisirChaine_Caracteres("Tapez le service du Chef"));
				
			}
			else //Directeur
				empl[i]=new Directeur(Base.saisirChaine_Caracteres("Tapez le nom de la Personne"),Base.saisirChaine_Caracteres("Tapez le prenom de la Personne"),Base.saisirChaine_Caracteres("Tapez la date de naissance de la Personne"),Base.saisirReel("Tapez le salaire de la Personne"),Base.saisirChaine_Caracteres("Tapez le service du Chef"),Base.saisirChaine_Caracteres("Tapez la societe du Directeur"));
			
		}
		Personne p=null;
		//afficher les 8 employés
		for(int i=0;i<empl.length;i++)
		{
			p=(Personne)empl[i];
			System.out.println(empl[i].afficher());
		}
		
		
	}
	public static void main(String[] args) {
	
		//Famille_Des_Maman();
		Test_Polymorphe();

	}

}
