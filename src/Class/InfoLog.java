/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 * Cette classe permet de contenir le mdp et se savoit si l'user c'est deja connecté
 * @author Quentin
 */
public class InfoLog {

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public boolean isPremiereConnexion() {
        return premiereConnexion;
    }

    public void setPremiereConnexion(boolean premiereConnexion) {
        this.premiereConnexion = premiereConnexion;
    }

    public InfoLog(String mdp, boolean premiereConnexion) {
        this.mdp = mdp;
        this.premiereConnexion = premiereConnexion;
    }
    
    String mdp ;
    boolean premiereConnexion ;
    
    
}
