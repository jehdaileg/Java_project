package Inscription;

import java.util.ArrayList;

public class Inscription {
	
	private Etudiant et;
	private String anneeacademique;
	private Classe cl;
	
	private static ArrayList<Inscription> db_inscr;
	
	public static ArrayList<Etudiant> rechercher_Etudiant_By_Classe(Classe cl,String ann){
		
		ArrayList<Etudiant> db_et=null;
		  if(db_inscr==null)
			  return db_et;
		  else {
			  db_et=new ArrayList<Etudiant>();
			  for(Inscription in:db_inscr)
				  if(in.getCl()==cl && in.anneeacademique.equalsIgnoreCase(ann))
					  db_et.add(in.getEt());
			  
			 // db_et.			  
		  }
		
		
		return db_et;
	}
	
	public Inscription(Etudiant et,String anne,Classe cl){
		this.et=et;
		this.anneeacademique=anne;
		this.cl=cl;
		
		if(db_inscr==null)
			db_inscr=new ArrayList<Inscription>();
		db_inscr.add(this);
			
	}

	public Etudiant getEt() {
		return et;
	}

	public void setEt(Etudiant et) {
		this.et = et;
	}

	public String getAnneeacademique() {
		return anneeacademique;
	}

	public void setAnneeacademique(String anneeacademique) {
		this.anneeacademique = anneeacademique;
	}

	public Classe getCl() {
		return cl;
	}

	public void setCl(Classe cl) {
		this.cl = cl;
	}

	public static ArrayList getDb_inscr() {
		return db_inscr;
	}

	public static void setDb_inscr(ArrayList db_inscr) {
		Inscription.db_inscr = db_inscr;
	}

	
}
