package Inter;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2 implements Comparator{

	// une classe privée interne
	private class personne{
		
	private String nom;
	private int age;

	public personne(String nom, int age){

		this.nom=nom; // nom de la personne
		this.age=age; // son âge

	}

	// récupérer l'âge
	public int getAge(){

		return age;
	}


	// identité de la personne
	public String toString(){

		return ("["+nom+","+age+"]");
	}
}
	// constructeur
	public Sort2() {

		// un tableau de personnes
		personne[] amis=new personne[]{new personne("tintin",100),new personne("milou",80),
		new personne("tournesol",40)};
		
		// tri du tableau de personnes
		Arrays.sort(amis,this);
		// vérification
		
		for(int i=0;i<3;i++)
			System.out.println(amis[i]);
	}//constructeur


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sort2();
		//33240656537149576123
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		// doit rendre
		// -1 si o1 "plus petit que" o2
		// 0 si o1 "égal à" o2
		// +1 si o1 "plus grand que" o2
		personne p1=(personne)o1;
		personne p2=(personne)o2;
		int age1=p1.getAge();
		int age2=p2.getAge();
		if(age1<age2) return (-1);
			else if (age1==age2) return (0);
		else return +1;

		
		
	}

}
