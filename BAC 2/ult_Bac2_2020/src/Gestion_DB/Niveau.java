package Gestion_DB;

import DB.mysqlDB;

public class Niveau {
	
	private int nivID;
	private String nom,info;
	
	public Niveau(String nom){
		this.nom=nom;
	}
	
	public void creer_Niveau(){
		
		if(mysqlDB.updateBD("insert into niveau (nom) values('"+this.nom+"')")>0)
			this.info="F�licitation,cette classe a �t� enregistr�e avec succes";
		else this.info="D�sol�, echec pendant l'insertion de la classe";
	}
	
public String toString(){
	return this.nom;
}

public int getNivID() {
	return nivID;
}

public String getNom() {
	return nom;
}


public void Modify_Niveau(){
	
	if(mysqlDB.updateBD("update niveau set nom='"+this.nom+"' where nivID="+this.nivID)>0)
		this.info="F�licitation,cette classe a �t� modifi�e avec succes";
	else this.info="D�sol�, echec pendant la modification de la classe";

}
	
}
