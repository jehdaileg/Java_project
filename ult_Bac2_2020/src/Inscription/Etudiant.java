package Inscription;

public class Etudiant {
	
	private String nom,prenom,matricule;
	private int age;
	
	public Etudiant(String nom,String pre,String mat,int age){
		this.nom=nom;
		this.prenom=pre;
		this.matricule=mat;
		this.age=age;
	}

	public String toString(){
		return nom+" "+prenom+" "+matricule+" "+age;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
