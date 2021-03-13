package Exercices;

public class Personne {
	
	//données ou proprietes
	private String nom,prenom,dt_naissance;
	
	public Personne(String no,String pr,String dt){
		
		this.nom=no;
		this.prenom=pr;
		dt_naissance=dt;
	}
	
	public String afficher(){
		
		return "Personne("+nom+","+prenom+","+dt_naissance+")";
	}

}
