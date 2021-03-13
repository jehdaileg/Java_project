package OOP;

public class Personne {

	// attributs
	private String prenom;
	private String nom;
	private int age;
	public Personne(){}
	public Personne(String P, String N, int age){

		this.prenom=P;
		this.nom=N;
		this.age=age;
	}
	// méthode
	public  void initialise(String P, String N, int age){

	this.prenom=P;
	this.nom=N;
	this.age=age;
	}

	// méthode
	public void identifie(){

	System.out.println(prenom+","+nom+","+age);

	}

	public String toString(){
		return prenom+" "+nom+" "+age;
	}
static void test(){
	
	Personne p=null;
	p.initialise("Dupont"," N", 12);
	
	System.out.println(p.age);
	
}



public static void main(String [] args){
	
	
	test();
}

}
