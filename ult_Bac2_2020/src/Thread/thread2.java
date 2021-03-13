package Thread;

import java.util.Calendar;

public class thread2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// init thread courant
		Thread main=Thread.currentThread();

		// on donne un nom au thread courant
		main.setName("myMainThread");

		// d�but de main
		System.out.println("d�but du thread " +main.getName());

		// cr�ation de threads d'ex�cution
		Thread[] t�ches=new Thread[5];

		for(int i=0;i<t�ches.length;i++){

		// on cr�e le thread i
		t�ches[i]=new Thread() {

		public void run() {
			affiche();
		}
		};//d�f t�ches[i]

		// on fixe le nom du thread
		t�ches[i].setName(""+i);

		// on lance l'ex�cution du thread i
		t�ches[i].start();

		}//for

		// fin de main
			System.out.println("fin du thread " +main.getName());
		}//Main

		public static void affiche() {

		// on r�cup�re l'heure
		Calendar calendrier=Calendar.getInstance();
		String H=calendrier.get(Calendar.HOUR_OF_DAY)+":"+calendrier.get(Calendar.MINUTE)+":"
		+calendrier.get(Calendar.SECOND);

		// affichage d�but d'ex�cution
		System.out.println("D�but d'ex�cution de la m�thode affiche dans le Thread " +
		Thread.currentThread().getName()+ " : " + H);

		// mise en sommeil pendant 1 s
		try{

			Thread.sleep(1000);

		}catch (Exception ex){}

		// on r�cup�re l'heure
		calendrier=Calendar.getInstance();
		H=calendrier.get(Calendar.HOUR_OF_DAY)+":"+calendrier.get(Calendar.MINUTE)+":"
		+calendrier.get(Calendar.SECOND);

		// affichage fin d'ex�cution
		System.out.println("Fin d'ex�cution de la m�thode affiche dans le Thread "
		+Thread.currentThread().getName()+ " : " + H);

		}// affiche


}
