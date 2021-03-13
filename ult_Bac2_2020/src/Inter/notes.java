package Inter;

public class notes {
	// attributs
	protected String mati�re;
	protected �l�ve[] �l�ves;
	// constructeur

	public notes (String MATIERE, �l�ve[] ELEVES){
	
		// m�morisation �l�ves & mati�re
		mati�re=MATIERE;
		�l�ves=ELEVES;
	}//notes

	// toString
	public String toString(){

		String valeur="mati�re="+mati�re +", notes=(";
		int i;
		
		// on concat�ne toutes les notes
		for (i=0;i<�l�ves.length-1;i++){
			valeur+="["+�l�ves[i].getNom()+","+�l�ves[i].getNote()+"],";
		};

		//derni�re note

		if(�l�ves.length!=0){ valeur+="["+�l�ves[i].getNom()+","+�l�ves[i].getNote()+"]";
			}
			valeur+=")";
		// fin

		return valeur;
	}//toString



}
