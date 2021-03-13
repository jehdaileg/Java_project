package Gestion_DB;

import DB.mysqlDB;

public class DeparNiveau {
	
	private int depNivID
	private Niveau nivID;
	private String info;
	private Departement departID;
	
	public DeparNiveau(Niveau nivID,Departement depar){
		this.departID=depar;
		this.nivID=nivID;
	}
	
	
	public int getStatus() {
		return status;
	}


	public String getInfo() {
		return info;
	}

	public void creer_Dep_Niv(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(mysqlDB.updateBD("insert into DeparNiveau (nivID,departID) values("+nivID.getNivID()+","+departID.getDepartID()+")")>0)
		
			
			this.info="Félicitation, l'association été effectuée avec success";
		
		
		
		else 
			this.info="Echec d'association ";
		
	}
	
	public String toString(){
		return departID.toString()+" "+nivID.toString();
	}

}
