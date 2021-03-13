package Compte;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte cb=new Compte(1000);  //code 1
		CompteEpargne cbE=new CompteEpargne(1200);//poly code 2
		ComptePayant cbP=new ComptePayant(1300); //code 3
		
		//on depose l'argent
		cb.depot(500);//code 1 -- 1500
		cbE.depot(200);//code 2-- 1400
		cbP.depot(200);//code 3 -- 1495;
		
		//on retranche une quelconque somme 
		cb.retrait(100);//code 1-- 1400
		cbE.retrait(50); //code 2 -- 1350;
		cbP.retrait(45); //code 3 -- 1445;
		
		//on calcul l'interet et met à jour son solde
		cbE.calculInteret();//code 2 -- 1431
		
		//on affiche les soldes
		System.out.println(cb);
		
		System.out.println(cbE);
		System.out.println(cbP);
	}

}
