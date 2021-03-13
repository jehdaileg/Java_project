package Test;
import java.io.*;



public class Test {

	static void somme_element_Diagonal_Matrice(){
		int somme=0;
		int [][] M=new int[][]{{1,2,6},{4,1,9},{7,3,8}};
		
		for(int i=0;i<M[0].length;i++)
			somme+=M[i][i];
		
		System.out.println("La somme :"+somme);
	}
	static int[] ordonner_tableau(){
		
		int t[];
		int n,i,j=0,temp,m=0;
		/*
		 * remplissez le tableau
		 */
		
		while(m<=0)
		   m=saisirEntier("Saisissez la taille du tableau");
		t=new int[m];
		i=t.length;
		
		
		do{
			t[j]=saisirEntier("Tapez la valeur du tableau de l'index:"+j);
			j++;
			
		}while(j<=(i-1));
		System.out.println("Tableau avant de le trier");
		for(i=0;i<t.length;i++)
			System.out.print(t[i]+" ");
		
		//on va ordonner le tableau
		
		i=0; n=t.length;
		
		for(;i<n;i++){
			for(j=i+1;j<n;j++){
				if(t[i]<t[j]){
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
		}
		
	System.out.println("Tableau ordonné");
	for(i=0;i<t.length;i++)
		System.out.print(t[i]+" ");
	
	return t;
	}
	static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
  
	static int saisirEntier(String msg){
	  int result=0,i=0;
	  String entier_saisi;
	  while(i==0)
	  try {
		  System.out.println(msg);
		entier_saisi=in.readLine(); // equivalent de scanf
		
		
		result=Integer.parseInt(entier_saisi);
		i=1;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(NumberFormatException ex){
		System.out.println("Exception a eu lieu car le entier n'est pas un entier!!!");
	}
	  
	  
	  return result;
  }
  static double saisirReel(String msg){
	
	  
	  double result=0,i=0;
	  String entier_saisi="";
	  while(i==0)
	  try {
		  
		  System.out.println(msg);
		  entier_saisi=in.readLine();		
		  result=Double.parseDouble(entier_saisi);
		i=1;
	} 
	 
	  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(NumberFormatException ex){
		System.out.println("Exception a eu lieu car la chaine saisie("+entier_saisi+") n'est pas un reel!!!");
	}
	 
	  
	  
	  
	  return result;
  }
  
  static String saisirChaine_Caracteres(){
	  String result="";
	  
	  return result;
  }
	static void resolution_equation_2nd_degre(){
	
		double a=saisirReel("Tapez la valeur de a"),b=saisirReel("Tapez la valeur de b"),c=saisirReel("Tapez la valeur de c"),x1,x2,delta;
		delta=Math.pow(b,2)-4*a*c;
	  System.out.println("Delta:"+delta);	
		if(delta>=0)
		{
			if(delta==0){
				x1=x2=-b/2*a;
				
			}
			else{
				x1=(-b+Math.sqrt(delta))/2*a;
				x2=(-b-Math.sqrt(delta))/2*a;
				
			}
			System.out.println("x1:"+x1+" x2:"+x2);
		}
		else System.out.println("Solution impossible");
			
		
	}
	
	
	static void calcul_factoriel(){
		
		int f=1,i=1,n=saisirEntier("Tapez n pour le calcul du factoriel");
		
		if(n<0)
			{
			  System.out.println("Pas de solution pour un element negatif("+n+")");
			 return;
			}
		else{
			
			if(n==0)
				;
			else {
				while(i<=n){
					f=f*i;
					i++;
				}
			}
			System.out.println("Factoriel de ("+n+")  est "+f);
		}
	}
	
	
	static void interchange(Entier a,Entier b){
		
		int c=a.getA();
	System.out.println("Valeur de depart: a:"+a.getA()+" b="+b.getB());
		a.setA(b.getB());
		b.setB(c);
	System.out.println("Valeur apres operation: a:"+a.getA()+" b:"+b.getB());	
	}
	public static void main(String[] bt) {
		//System.out.println("Enrier saisi:"+saisirEntier("Saisissez un entier"));
		//resolution_equation_2nd_degre();
		//somme_element_Diagonal_Matrice();
		Entier a=new Entier(),b=new Entier();;
		a.setA(5);
		b.setB(10);
		
		System.out.println("Main avant: a:"+a.getA()+" b:"+b.getB());
		interchange(a, b);
		
		System.out.println("Main apres: a:"+a.getA()+" b:"+b.getB());
		
		
	}

}

class Entier{
	
	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}