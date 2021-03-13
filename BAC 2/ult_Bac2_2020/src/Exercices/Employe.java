package Exercices;

public class Employe extends Personne{

	private float salaire;
	public Employe(String no, String pr, String dt,float s) {
		
		super(no, pr, dt);//representer la classe Mere qui est Personne
		// TODO Auto-generated constructor stub
		this.salaire=s;
	}
	
	public String afficher(){
	  return "Employe("+super.afficher()+","+this.salaire+")";	
		
	}
	
	

}
