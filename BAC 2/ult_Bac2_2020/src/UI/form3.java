package UI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import Gestion_DB.Faculte;

public class form3 extends JFrame implements ActionListener{

	// un bouton
	JButton btnTest=null;
	Container conteneur=null;

	// le constructeur
	public form3() {

	// titre de la fen�tre
	this.setTitle("Formulaire avec bouton");
	// dimensions de la fen�tre
	this.setSize(new Dimension(300,100));

	// cr�ation d'un gestionnaire d'�v�nements
	WindowAdapter win=new WindowAdapter(){

	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	};//d�finition win

	// ce gestionnaire d'�v�nements va g�rer les �vts de la fen�tre courante
	this.addWindowListener(win);

	// on r�cup�re le conteneur de la fen�tre
	conteneur=this.getContentPane();

	// on choisit un gestionnaire de mise en forme des composants dans ce conteneur
	conteneur.setLayout(new FlowLayout());
	// on cr�e un bouton
	btnTest=new JButton();
	// on fixe son libell�

	btnTest.setText("Test");
	// on ajoute le bouton au conteneur
	conteneur.add(btnTest);
  btnTest.addActionListener(this);
	}//constructeur

	// fonction de test
	public static void main(String[] args) {
  
	// on affiche le formulaire
	new form3().setVisible(true);

	}//main

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//System.out.println("Clic sur le bouton!!!");
		
		Faculte fac=new Faculte("FSEG");
		fac.creer_Faculte();
		System.out.println(fac.getInfo());
		
	}


}
