package Inscription;

import java.util.Vector;

public class Classe {
	
	private String nom_dep;
	private String nom_faculte;
	private String niveau;
	private static Vector bd_cl;
	
	
	public Classe(String dep,String facu,String niv)
	{
		this.nom_dep=dep;
		this.nom_faculte=facu;
		this.niveau=niv;
		
		if(Classe.bd_cl==null)
			Classe.bd_cl=new Vector();//crreer une liste
		if(!verifier_existance_Classe_in_Tbl())
			Classe.bd_cl.addElement(this);
	}
    
	public static void afficher_Toutes_les_Classes(){
		
		if(Classe.bd_cl==null || Classe.bd_cl.size()==0)
			System.out.println("Pas de Classes enregistrée");
		else {
			System.out.println("Liste des Classes déjà enregistrées");
		  	for(int i=0;i<Classe.bd_cl.size();i++)
		  		System.out.println(i+"-"+(Classe)Classe.bd_cl.elementAt(i));
		}
		
	}
	private boolean verifier_existance_Classe_in_Tbl(){
		boolean val=false;
		if(bd_cl==null)
			return val;
		else {
			Classe cl=null;
			for(int i=0;i<bd_cl.size();i++){
				cl=(Classe)bd_cl.elementAt(i);
				
				if(cl.niveau.trim().equalsIgnoreCase(this.niveau.trim()) && cl.nom_dep.trim().equalsIgnoreCase(this.nom_dep.trim())&&cl.nom_faculte.trim().equalsIgnoreCase(this.nom_faculte.trim()) )
				{
					val=true;
					break;
				}
			}
		}
		
		return val;
	}
	
	public static Vector getBd_cl() {
		return bd_cl;
	}

	public static void setBd_cl(Vector bd_cl) {
		Classe.bd_cl = bd_cl;
	}

	public String getNom_dep() {
		return nom_dep;
	}

	public void setNom_dep(String nom_dep) {
		this.nom_dep = nom_dep;
	}

	public String getNom_faculte() {
		return nom_faculte;
	}

	public void setNom_faculte(String nom_faculte) {
		this.nom_faculte = nom_faculte;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
  public String toString(){
	  return "Classe ("+nom_faculte+" "+nom_dep+" "+niveau+")";
  }
	
}
