package Gestion_DB;

import java.sql.ResultSet;
import java.sql.SQLException;

import DB.mysqlDB;

public class Departement {
	
	private int departID=-1;
	private String nom,info;
	private Faculte faculID;
	
	public Departement(String nom,Faculte fac){
		this.nom=nom;
		this.faculID=fac;
	}
	
public Departement() {
		// TODO Auto-generated constructor stub
	}

public Departement(String string, int int1) {
	// TODO Auto-generated constructor stub
	this.nom = string;
	this.departID = int1;
}

public static void print_all_Departements(javax.swing.JComboBox list){
		
		ResultSet result=mysqlDB.interrogerBD("select *from departement");
		
		list.removeAllItems();
		list.addItem(new Departement());
	    if(result!=null){
	    	
	    	try {
				while(result.next())
					list.addItem(new Departement(result.getString("nom"),result.getInt("departID")));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }	
		
		
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
		//controler les données à enregistrer
		if(this.faculID==null)
		{
			this.info="Désolé car pas de Faculté dans laquelle votre future departemet se trouve";
			return;
		}
		
		if(this.nom==null||this.nom.trim().equalsIgnoreCase(""))
		{
			this.info="Désolé car le nom de departement est invalide";
			return;
		}
		
		if(mysqlDB.updateBD("insert into Departement(nom,faculID) values('"+this.nom+"',"+this.faculID.getFaculID()+")")>0)
			info="Félicitation, votre departement a été enregistré avec succes";
		else info="Désolé, votre departement n'a pas été enregistré";
		
	}
    public void delete_Departement(){
    	
    	if(mysqlDB.updateBD("delete from departement where departID="+this.departID)>0)
    		info="Félicitation, votre departement a été supprimé avec succes";
		else info="Désolé, votre departement n'a pas été supprimé";
	
    }
	public String toString(){
		return this.nom;
	}
}
