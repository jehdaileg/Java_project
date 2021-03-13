package Exercices;

public class Directeur extends Chef {

	private String societe;
	public Directeur(String no, String pr, String dt, float s, String ser,String soc) {
		super(no, pr, dt, s, ser);
		// TODO Auto-generated constructor stub
		this.societe=soc;
	}

	public String afficher() {
		return "Directeur("+super.afficher()+","+societe+")";
	}
}
