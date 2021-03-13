/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_Manager;

import Gestion_DB.Niveau;
import UI.NiveauUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Niveau implements ActionListener {

    private NiveauUI p2;
    public Manager_Niveau(NiveauUI win){
      p2=win;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Niveau niv=new Niveau(p2.getNom_niveau().getText());
        niv.creer_Niveau();
    }
    
}
