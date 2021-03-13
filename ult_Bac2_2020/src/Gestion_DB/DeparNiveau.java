package Gestion_DB;

import DB.mysqlDB;

public class DeparNiveau {
	
	private int depNivID;
	private Niveau nivID;
	private String info;
	private Departement departID;
	
	public DeparNiveau(Niveau nivID,Departement depar){
		this.departID=depar;
		this.nivID=nivID;
	}
	
	public String getInfo() {
		return info;
	}

	public void creer_Dep_Niv(){
		if(mysqlDB.updateBD("insert into DeparNiveau (nivID,departID) values("+nivID.getNivID()+","+departID.getDepartID()+")")>0)
			this.info="Félicitation, l'association de depart et Niveau  été effectuée avec succes";
		else this.info="Désolé, l'association de part et Niveau a échoué";
	}
	
	public String toString(){
		return departID.toString()+" "+nivID.toString();
	}

}
