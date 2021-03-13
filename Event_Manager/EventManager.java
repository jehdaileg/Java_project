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

/* --BROUILLON EXAMEN JAVA -- */
 try {
          String select_admin="SELECT * FROM administrateur WHERE username='"+admin_username.getText()+"' and password='"+password_admin.getText()+"' " ;
          con=connect_db.setConnexion();
          ps=con.prepareStatement(select_admin);
          resultat=ps.executeQuery(); 
          
          if(resultat.next()){
              HomeCareApp accueil=new HomeCareApp();
              accueil.setVisible(true);
              accueil.pack();
              accueil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              this.dispose();
              
          }else{
             JOptionPane.showMessageDialog(null,"Pas d'acces, Mot de passe ou nom d'administrateur incorrect!");
             
           
             
          }
          
      }catch(Exception e ) {
          JOptionPane.showMessageDialog(null, e);
      }       
        
    }   



    --BROUILLON 2--
     if(check.equalsIgnoreCase("Etablie avec Succès")) {
           try {
              stat=conn.createStatement();
              resultat=stat.executeUpdate(request);
           }catch(SQLException e) {
               e.printStackTrace();
               check="La requete n'a pas été exécutée!";
           }
       }                                      









