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
    
    private Capteur capteur;
    private Adresse adresse;
    
    public Réseau (Capteur capteur){
        this.capteur = capteur;
        this.adresse = adresse;
}
    
    public void Connexion()throws UnknownHostException, IOException
    {
            String testCo = null;
        if(capteur instanceof CapteurInterieur){
           CapteurInterieur captInt = (CapteurInterieur) this.capteur;
           testCo = new String("ConnexionCapteur;"+captInt.getIdentifant()+";"+captInt.getType()+";"+captInt.getLocalisation());//ConnexionCapteur;IdentifiantCapteur;TypeCapteur;Bâtiment;Etage;Salle;PositionRelative
        }else if(capteur instanceof CapteurExterieur){
            CapteurExterieur captExt = (CapteurExterieur) this.capteur;
            testCo = new String("ConnexionCapteur;"+captExt.getIdentifant()+";"+captExt.getType()+";"+captExt.getLocalisation());//ConnexionCapteur;Id;type;coordLat;coordLong
                    
        }
          try{
                Socket client = new Socket(InetAddress.getLocalHost(),adresse.getPort());
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
         String testDeco = new String("DeconnexionCapteur;"+capteur.getIdentifant());//DeconnexionCapteur;IdentifiantCapteur
         
         try{
             Socket  client =  new Socket(InetAddress.getLocalHost(),adresse.getPort());
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
