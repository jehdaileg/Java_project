package Exercices;

public class Chef extends Employe {

	private String service;
	public Chef(String no, String pr, String dt, float s,String ser) {
		super(no, pr, dt, s);
		// TODO Auto-generated constructor stub
		this.service=ser;
	}
	
	public String afficher(){
		return "Chef("+super.afficher()+","+this.service+")";
	}

}
