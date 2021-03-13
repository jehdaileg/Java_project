/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_Manager;

import Gestion_DB.DeparNiveau;
import Gestion_DB.Departement;
import Gestion_DB.Niveau;
import UI.DepartNiveauUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Manager_DepartNiveau implements ActionListener{
    
    private DepartNiveauUI win =null;
    public Manager_DepartNiveau(DepartNiveauUI dept){
        win = dept;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DeparNiveau new_deptNiv_obj = new DeparNiveau((Niveau)win.getLevel_name().getSelectedItem(), (Departement)win.getDept_name().getSelectedItem());
        
        new_deptNiv_obj.creer_Dep_Niv();
        if(new_deptNiv_obj.getStatus()==0){
        JOptionPane.showMessageDialog (null, new_deptNiv_obj.getInfo(), "Success", JOptionPane.INFORMATION_MESSAGE);//To change body of generated methods, choose Tools | Templates.
        }
        else
            JOptionPane.showMessageDialog (null, new_deptNiv_obj.getInfo(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Event_Manager;

import Gestion_DB.DeparNiveau;
import Gestion_DB.Departement;
import Gestion_DB.Niveau;
import UI.DepartNiveauUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul NIYUNGEKO
 */
public class Manager_DepartNiveau implements ActionListener{
    
    private DepartNiveauUI win =null;
    public Manager_DepartNiveau(DepartNiveauUI dept){
        win = dept;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DeparNiveau new_deptNiv_obj = new DeparNiveau((Niveau)win.getLevel_name().getSelectedItem(), (Departement)win.getDept_name().getSelectedItem());
        
        new_deptNiv_obj.creer_Dep_Niv();
        System.out.println("ok");
}
