package Gestion_DB;

import java.sql.ResultSet;

import DB.mysqlDB;

public class Etudiant {
	
	private int etudID;
	private String nom,prenom,genre,matricule,info;
	
	public Etudiant(String no,String pre,String genr,String matr){
		this.nom=no;
		this.prenom=pre;
		this.genre=genr;
		this.matricule=matr;
	}
	
	public int getEtudID() {
		return etudID;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getGenre() {
		return genre;
	}
	
	

	public String getMatricule() {
		return matricule;
	}

	public void creer_etudiant(){
		
		if(mysqlDB.updateBD("insert into etudiant (nom,prenom,genre,matricule) values('"+this.nom+"','"+this.prenom+"','"+this.genre+"','"+matricule+"')")>0)
		info="Félicitation, l'étudiant a été enregistré avec succes";
		else info="Désolé, echec pendant l'enregistrement de l'étudiant";
	}
public String toString(){
	 return nom+" "+prenom+" "+matricule;
}

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}

public void setEtudID(int etudID) {
	this.etudID = etudID;
}

public void setNom(String nom) {
	this.nom = nom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public void setMatricule(String matricule) {
	this.matricule = matricule;
}
	
}
