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

	// titre de la fenêtre
	this.setTitle("Formulaire avec bouton");
	// dimensions de la fenêtre
	this.setSize(new Dimension(300,100));

	// création d'un gestionnaire d'événements
	WindowAdapter win=new WindowAdapter(){

	public void windowClosing(WindowEvent e){
	System.exit(0);
	}
	};//définition win

	// ce gestionnaire d'événements va gérer les évts de la fenêtre courante
	this.addWindowListener(win);

	// on récupère le conteneur de la fenêtre
	conteneur=this.getContentPane();

	// on choisit un gestionnaire de mise en forme des composants dans ce conteneur
	conteneur.setLayout(new FlowLayout());
	// on crée un bouton
	btnTest=new JButton();
	// on fixe son libellé

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
