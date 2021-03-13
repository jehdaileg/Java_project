/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_Manager;

import Gestion_DB.Etudiant;
import UI.EtudiantUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Etudiant implements ActionListener {

    private EtudiantUI win;
    public Manager_Etudiant(EtudiantUI el){
       win=el;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Etudiant et=new Etudiant(win.getNom().getText(),win.getPrenom().getText(),(String)win.getGenre().getSelectedItem(),win.getMatricule().getText());
        et.creer_etudiant();
        
        System.out.println(et.getInfo());
    }
    
}
