package Base;

import java.awt.image.SampleModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercices {
	
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
	static void tableau(){
		
		int []t=new int[saisirEntier("Tapez la taille du tableau")];
		//remplir le tableau
		for(int i=0;i<t.length;i++)
			t[i]=saisirEntier("Saisissez la valeur du tableau de l'index "+i);
		
		for(int i=0;i<t.length;i++)
			System.out.print(t[i]+" ");
	}
	
	public static void main(String[] args) {
		tableau();

	}

}
