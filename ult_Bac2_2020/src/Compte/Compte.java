package Compte;

public class Compte {
	
	private float solde;
	private int code;
	private static int pre_code;
	
	public float getSolde() {
		return solde;
	}
	public int getCode() {
		return code;
	}
	
	public Compte(){
		
		solde=0;
		code=++pre_code;
	}
  public Compte(float sol){
		
		solde=sol;
		code=++pre_code;
	}
	
  public void depot(float sol_dep){
	  solde+=sol_dep;
  }
  
  public void retrait(float solde_retr){
	  solde-=solde_retr;
  }
	
  public String toString(){
	return "Code:"+code+" solde:"+this.solde;  
  }
}
