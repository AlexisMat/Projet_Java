/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author Alexis
 */
public class Réseau {
    
    public void Connexion()throws UnknownHostException, IOException
    {
          String testCo = new String("ConnexionCapteur;radiateur;Température;U3;2;204;pas loin de la porte");//ConnexionCapteur;IdentifiantCapteur;TypeCapteur;Bâtiment;Etage;Salle;PositionRelative
          
          try{
                Socket client = new Socket(InetAddress.getLocalHost(),7888);
                System.out.println("Demande de connexion");
                
                OutputStream co =  client.getOutputStream();
                 
                for (char c : testCo.toCharArray())
                     co.write(c);
                client.close();
          }catch(UnknownHostException e){
                 e.printStackTrace();
          }     
    }
    
    public void Deconnexion() throws UnknownHostException, IOException{
         String testDeco = new String("DeconnexionCapteur;radiateur");//DeconnexionCapteur;IdentifiantCapteur
         
         try{
             Socket  client =  new Socket(InetAddress.getLocalHost(),7888);
             System.out.println("Demande de déconnexion");
             
             OutputStream deco =  client.getOutputStream();
              for (char c : testDeco.toCharArray())
                     deco.write(c);
                client.close();
         }catch(UnknownHostException e){
                 e.printStackTrace();
          } 
    }
}
