/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_Manager;

import UI.DepartementUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author utilisateur
 */
public class Manager_Departement implements ActionListener{

    private DepartementUI win;
    public Manager_Departement(DepartementUI dep){
        win=dep;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        Gestion_DB.Departement dep=new Gestion_DB.Departement(win.getNom_dep().getText(),(Gestion_DB.Faculte)win.getFac().getSelectedItem());
        
       dep.creer_Departement();
       System.out.println(dep.getInfo());
    }
    
}
