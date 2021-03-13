package Compte;

public class ComptePayant extends Compte {
  
	private static final int frais_transactionel=5;
	public ComptePayant() {
		// TODO Auto-generated constructor stub
	}

	public ComptePayant(float sol) {
		super(sol);
		// TODO Auto-generated constructor stub
	}
	
	public void depot(float sol_dep){
		 float dep=sol_dep-frais_transactionel;
		 System.out.println(this.getCode()+" "+dep);
		super.depot(dep);
	  }
	  
	  public void retrait(float solde_retr){
		  float dep=solde_retr+frais_transactionel;
			 System.out.println(this.getCode()+" "+dep);
		  super.retrait(dep);
	  }

}
