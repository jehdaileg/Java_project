package Inter;

public class notesStats extends notes implements Istats {

	// attributs
	private double _moyenne;
	private double _�cartType;

	public notesStats(String MATIERE, �l�ve[] ELEVES) {
		super(MATIERE, ELEVES);
		// TODO Auto-generated constructor stub
		// calcul moyenne des notes
		double somme=0;
		for (int i=0;i<�l�ves.length;i++){
			somme+=�l�ves[i].getNote();
		}
		
		if(�l�ves.length!=0) _moyenne=somme/�l�ves.length;
		else _moyenne=-1;
		
		// �cart-type
		double carr�s=0;
		for (int i=0;i<�l�ves.length;i++){

			carr�s+=Math.pow((�l�ves[i].getNote()-_moyenne),2);

		}//for

		if(�l�ves.length!=0) _�cartType=Math.sqrt(carr�s/�l�ves.length);
		else _�cartType=-1;

	}

	@Override
	public double moyenne() {
		// TODO Auto-generated method stub
		return _moyenne;
	}

	@Override
	public double �cartType() {
		// TODO Auto-generated method stub
		return this._�cartType;
	}

	// ToString
	public String toString(){

		return super.toString()+",moyenne="+_moyenne+",�cart-type="+_�cartType;
	}//ToString


	

}
