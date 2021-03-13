package Inter;

public class notes {
	// attributs
	protected String matière;
	protected élève[] élèves;
	// constructeur

	public notes (String MATIERE, élève[] ELEVES){
	
		// mémorisation élèves & matière
		matière=MATIERE;
		élèves=ELEVES;
	}//notes

	// toString
	public String toString(){

		String valeur="matière="+matière +", notes=(";
		int i;
		
		// on concatène toutes les notes
		for (i=0;i<élèves.length-1;i++){
			valeur+="["+élèves[i].getNom()+","+élèves[i].getNote()+"],";
		};

		//dernière note

		if(élèves.length!=0){ valeur+="["+élèves[i].getNom()+","+élèves[i].getNote()+"]";
			}
			valeur+=")";
		// fin

		return valeur;
	}//toString



}
