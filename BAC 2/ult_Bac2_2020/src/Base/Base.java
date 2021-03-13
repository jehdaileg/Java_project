package Base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Base {

	static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	  
	public static int saisirEntier(String msg){
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
 public static float saisirReel(String msg){
	
	  
	  float result=0,i=0;
	  String entier_saisi="";
	  while(i==0)
	  try {
		  
		  System.out.println(msg);
		  entier_saisi=in.readLine();		
		  result=Float.parseFloat(entier_saisi);
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
  
  public static String saisirChaine_Caracteres(String msg){
	  String result="";
	  
	  try {
		  System.out.println(msg);
		result=in.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  return result;
  }
	static void test(){
		int a;
		String l="";
		System.out.println("Saisissez l'entier de a");
		
		try {
			l=in.readLine();
			a=Integer.parseInt(l);
			System.out.println("La valeur saisie de A est "+a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test();
	}

	
	
}


