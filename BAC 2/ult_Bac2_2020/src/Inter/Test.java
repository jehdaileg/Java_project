package Inter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		

		// qqs �l�ves & notes
		�l�ve[] ELEVES=new �l�ve[] { new �l�ve("paul",14),new �l�ve("nicole",16), new 			�l�ve("jacques",18)};
		
		// qu'on enregistre dans un objet notes
		notes anglais=new notes("anglais",ELEVES);

		// et qu'on affiche
		System.out.println(""+anglais);

		// idem avec moyenne et �cart-type

		anglais=new notesStats("anglais",ELEVES);
		System.out.println(""+anglais);

	}

}
