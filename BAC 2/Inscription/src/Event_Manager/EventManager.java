/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_Manager;

import Gestion_DB.Faculte;
import UI.FaculteUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author utilisateur
 */
public class EventManager implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        Faculte fac=new Faculte(w.getNom_UI().getText());
        fac.creer_Faculte();
       
     
    }
    private FaculteUI w=null;
    public EventManager(FaculteUI win){
        w=win;
    }
    
}









