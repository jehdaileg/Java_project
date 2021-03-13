package Gestion_DB;

import DB.mysqlDB;

public class Departement {
	
	private int departID;
	private String nom,info;
	private Faculte faculID;
	
	public Departement(String nom,Faculte fac){
		this.nom=nom;
		this.faculID=fac;
	}
	/*public String toString(){
		return nom;
	}*/
	public int getDepartID() {
		return departID;
	}

	public String getNom() {
		return nom;
	}

	public String getInfo() {
		return info;
	}

	public Faculte getFaculID() {
		return faculID;
	}

	public void creer_Departement(){
		//controler les donn�es � enregistrer
		if(this.faculID==null)
		{
			this.info="D�sol� car pas de Facult� dans laquelle votre future departemet se trouve";
			return;
		}
		
		if(this.nom==null||this.nom.trim().equalsIgnoreCase(""))
		{
			this.info="D�sol� car le nom de departement est invalide";
			return;
		}
		
		if(mysqlDB.updateBD("insert into Departement(nom,faculID) values('"+this.nom+"',"+this.faculID.getFaculID()+")")>0)
			info="F�licitation, votre departement a �t� enregistr� avec succes";
		else info="D�sol�, votre departement n'a pas �t� enregistr�";
		
	}
    public void delete_Departement(){
    	
    	if(mysqlDB.updateBD("delete from departement where departID="+this.departID)>0)
    		info="F�licitation, votre departement a �t� supprim� avec succes";
		else info="D�sol�, votre departement n'a pas �t� supprim�";
	
    }
	public String toString(){
		return this.nom;
	}
}
