package Gestion_DB;

import java.sql.ResultSet;
import java.sql.SQLException;

import DB.mysqlDB;

public class Niveau {
	
	private int nivID;
	private String nom,info;
	
	public Niveau(String nom){
		this.nom=nom;
	}
	
public Niveau() {
		// TODO Auto-generated constructor stub
	}

public Niveau(String string, int int1) {
	// TODO Auto-generated constructor 
	this.nom = string;
	this.nivID = int1;
	
	
}

public static void print_all_Niveau(javax.swing.JComboBox list){
		
		ResultSet result=mysqlDB.interrogerBD("select *from niveau");
		
		list.removeAllItems();
		list.addItem(new Niveau());
	    if(result!=null){
	    	
	    	try {
				while(result.next())
					list.addItem(new Niveau(result.getString("nom"),result.getInt("nivID")));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
}
		
	public void creer_Niveau(){
		
		if(mysqlDB.updateBD("insert into niveau (nom) values('"+this.nom+"')")>0)
			this.info="Félicitation,cette classe a été enregistrée avec succes";
		else this.info="Désolé, echec pendant l'insertion de la classe";
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
		this.info="Félicitation,cette classe a été modifiée avec succes";
	else this.info="Désolé, echec pendant la modification de la classe";

}
	
}
