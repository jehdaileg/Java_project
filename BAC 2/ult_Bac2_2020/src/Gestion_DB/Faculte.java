package Gestion_DB;

import java.sql.ResultSet;
import java.sql.SQLException;

import DB.mysqlDB;

public class Faculte {
	private int faculID=-1;
	private String info;
	private String nom;
	public Faculte(){
		
	}
	public Faculte(String no){
		this.nom=no;
	}
	public Faculte(String no,int facID){
		this.nom=no;
		this.faculID=facID;
	}
public static void print_all_Facultes(javax.swing.JComboBox list){
		
		ResultSet result=mysqlDB.interrogerBD("select *from faculte");
		
		list.removeAllItems();
		list.addItem(new Faculte());
	    if(result!=null){
	    	
	    	try {
				while(result.next())
					list.addItem(new Faculte(result.getString("nom"),result.getInt("faculID")));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }	
		
		
	}
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


