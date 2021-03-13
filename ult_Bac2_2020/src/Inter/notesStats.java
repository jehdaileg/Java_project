package Inter;

public class notesStats extends notes implements Istats {

	// attributs
	private double _moyenne;
	private double _écartType;

	public notesStats(String MATIERE, élève[] ELEVES) {
		super(MATIERE, ELEVES);
		// TODO Auto-generated constructor stub
		// calcul moyenne des notes
		double somme=0;
		for (int i=0;i<élèves.length;i++){
			somme+=élèves[i].getNote();
		}
		
		if(élèves.length!=0) _moyenne=somme/élèves.length;
		else _moyenne=-1;
		
		// écart-type
		double carrés=0;
		for (int i=0;i<élèves.length;i++){

			carrés+=Math.pow((élèves[i].getNote()-_moyenne),2);

		}//for

		if(élèves.length!=0) _écartType=Math.sqrt(carrés/élèves.length);
		else _écartType=-1;

	}

	@Override
	public double moyenne() {
		// TODO Auto-generated method stub
		return _moyenne;
	}

	@Override
	public double écartType() {
		// TODO Auto-generated method stub
		return this._écartType;
	}

	// ToString
	public String toString(){

		return super.toString()+",moyenne="+_moyenne+",écart-type="+_écartType;
	}//ToString


	

}
