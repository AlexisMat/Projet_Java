/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Interface.Login;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Quentin
 */
public class Main  {
    

    public static void main (String[] args) throws IOException
    {
       
           
            Map<String,InfoLog>register = new HashMap<>();
                
            try{
                    InputStream flux=new FileInputStream(".\\ressource\\LogIn.txt"); 
                    InputStreamReader lecture=new InputStreamReader(flux);
                    BufferedReader buff=new BufferedReader(lecture);
                    String ligne;
                    while ((ligne=buff.readLine())!=null){
                        
                        String[] tab;
                        tab = ligne.split(" ");
                        boolean premiereConnexion ;
                        premiereConnexion = !"1".equals(tab[2]);
                        InfoLog infolog =  new InfoLog (tab[1],premiereConnexion);
                        register.put(tab[0],infolog );
                        
                       }
                    buff.close(); 
                    
               }		
               catch (Exception e){
                  System.out.println(e.toString());
             
               }
          
        System.out.println(register.toString());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(register).setVisible(true);
            }
        });
    }
}
