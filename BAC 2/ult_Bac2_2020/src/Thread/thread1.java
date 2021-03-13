package Thread;

import java.util.Calendar;

public class thread1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// init thread courant
		Thread main=Thread.currentThread();

		// affichage
		System.out.println("Thread courant : " + main.getName());
		// on change le nom
		main.setName("myMainThread");

		// vérification
		System.out.println("Thread courant : " + main.getName());

		// boucle infinie
		while(true){

		// on récupère l'heure
		Calendar calendrier=Calendar.getInstance();
		String H=calendrier.get(Calendar.HOUR_OF_DAY)+":"
		+calendrier.get(Calendar.MINUTE)+":"
		+calendrier.get(Calendar.SECOND);
		// affichage
		System.out.println(main.getName() + " : " +H);
		// arrêt temporaire
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}//while
		}//main


}
