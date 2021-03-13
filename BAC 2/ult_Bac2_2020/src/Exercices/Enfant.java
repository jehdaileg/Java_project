package Exercices;

public class Enfant { 
	
	private String nom,prenom,genre;
	private int age;
	
	public void ajouter(String nom,String prenom,String genre,int age){
		
	      this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.genre=genre;
	}
	public void afficher_Enfant(){
		
		System.out.println("Nom:"+nom+" Prenom:"+prenom+" genre:"+genre+" age:"+age);
		
	}

}
