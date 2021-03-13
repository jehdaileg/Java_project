package Inter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		

		// qqs élèves & notes
		élève[] ELEVES=new élève[] { new élève("paul",14),new élève("nicole",16), new 			élève("jacques",18)};
		
		// qu'on enregistre dans un objet notes
		notes anglais=new notes("anglais",ELEVES);

		// et qu'on affiche
		System.out.println(""+anglais);

		// idem avec moyenne et écart-type

		anglais=new notesStats("anglais",ELEVES);
		System.out.println(""+anglais);

	}

}
