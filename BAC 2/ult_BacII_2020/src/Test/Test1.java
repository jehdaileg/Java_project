package Test;

public class Test1 {
	
	static void rechercher_element_tableau(){
		int m=0,i=0,n,ta[],v;
		ta=Test.ordonner_tableau();
		n=ta.length;
		v=Test.saisirEntier("entre element a chercher");
		while(i<n){
			if(v==ta[i])
				m++;
			i++;
		}
		if(m==0){
			System.out.println("element("+v+")n est pas present");
		}
		else
			System.out.println("element ("+v+")est apparu "+m+"fois");
	}
	
	public static void main(String t[]){
		
		Test1 tt=null;
		
		Test.ordonner_tableau();
	   
	}
	

}
