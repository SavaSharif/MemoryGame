/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author Jiri Booij, Sava Sharif
 */
public class MemoryGame {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   

         try {
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
          if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
         }
        }
       }  
     catch (Exception e) {}
         
        Main main = new Main ();
        main.setVisible(true);
        
        
        // TODO code application logic here
    }
    
    
    
}
