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

		// début de main
		System.out.println("début du thread " +main.getName());

		// création de threads d'exécution
		Thread[] tâches=new Thread[5];

		for(int i=0;i<tâches.length;i++){

		// on crée le thread i
		tâches[i]=new Thread() {

		public void run() {
			affiche();
		}
		};//déf tâches[i]

		// on fixe le nom du thread
		tâches[i].setName(""+i);

		// on lance l'exécution du thread i
		tâches[i].start();

		}//for

		// fin de main
			System.out.println("fin du thread " +main.getName());
		}//Main

		public static void affiche() {

		// on récupère l'heure
		Calendar calendrier=Calendar.getInstance();
		String H=calendrier.get(Calendar.HOUR_OF_DAY)+":"+calendrier.get(Calendar.MINUTE)+":"
		+calendrier.get(Calendar.SECOND);

		// affichage début d'exécution
		System.out.println("Début d'exécution de la méthode affiche dans le Thread " +
		Thread.currentThread().getName()+ " : " + H);

		// mise en sommeil pendant 1 s
		try{

			Thread.sleep(1000);

		}catch (Exception ex){}

		// on récupère l'heure
		calendrier=Calendar.getInstance();
		H=calendrier.get(Calendar.HOUR_OF_DAY)+":"+calendrier.get(Calendar.MINUTE)+":"
		+calendrier.get(Calendar.SECOND);

		// affichage fin d'exécution
		System.out.println("Fin d'exécution de la méthode affiche dans le Thread "
		+Thread.currentThread().getName()+ " : " + H);

		}// affiche


}
