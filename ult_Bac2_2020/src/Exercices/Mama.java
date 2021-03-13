package Exercices;

public class Mama {
	
	private String nom,prenom,adresse,nationalite;
	private int age;
	private Enfant [] children;
	
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Enfant[] getChildren() {
		return children;
	}
	public Mama(int age,String nom){
		
	}
public Mama(){
		
	}
	public void setChildren(Enfant[] children) {
		
		this.children = children;
	}

	public Mama(String no,String pre,String adr,String nat,int age,Enfant[]t){
		
		this.nom=no;
		this.prenom=pre;
		adresse=adr;
		this.nationalite=nat;
		this.age=age;
		children=t;
		
	}
	
	public void afficher_Mama(){
	   
		System.out.println("Nom:"+nom+" prenom:"+this.prenom+" Age:"+age+" Adresse:"+adresse);
		
		System.out.println();System.out.println("Enfant(s) de la Maman précédente");
		if(children!=null){
			for(int i=0;i<children.length;i++){
				children[i].afficher_Enfant();
			}
		}
		
	}

}
