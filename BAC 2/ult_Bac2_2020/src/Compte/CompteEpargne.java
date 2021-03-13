package Compte;


public class CompteEpargne extends Compte {
	
	private static final float taux_interet=(float)0.06;
	
	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(float sol) {
		super(sol);
		// TODO Auto-generated constructor stub
	}
	
	public  void calculInteret(){
		this.depot((float)(this.getSolde()*taux_interet));
		
	}

}
