package Inter;

public class élève {
	// des attributs publics
	private String nom;
	private double note;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

	// constructeur
	public élève(String NOM, double NOTE){

	nom=NOM;
	note=NOTE;

	}//constructeur


}
