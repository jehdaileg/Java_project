package Gestion_DB;

import java.sql.ResultSet;
import java.sql.SQLException;

import DB.mysqlDB;

public class Faculte {
	private int faculID ;
	private String info;
	private String nom;
	public String toString(){
		return this.nom;
	}
	public int getFaculID() {
		return faculID;
	}

	public String getInfo() {
		return info;
	}

	public String getNom() {
		return nom;
	}

	public void creer_Faculte(){
		if(mysqlDB.updateBD("insert into faculte(nom) values('"+this.nom+"')")>0)
			info="Félicitation, l'insertion a été effectuée avec succes!";
		else info="Désolé, échec pendant l'insertion";
	}
	
	public static void afficher_Faculte(){
		
		ResultSet result=mysqlDB.interrogerBD("select * from faculte");
		
		try {
			while(result.next()){
				System.out.println(result.getInt("faculID")+"-"+result.getString("nom"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String [] rgs){
		
		afficher_Faculte();
		
	}
}


