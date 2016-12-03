/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Quentin
 */
public class CapteurExterieur extends Capteur {

    public void setLocalisation(String Localisation) {
        this.Localisation = Localisation;
    }

    public String getLocalisation() {
        return Localisation;
    }
    private String Localisation; // A recuopere dans un fichier
    
    public CapteurExterieur(String localisation,String uniteDeMesure, String Identifant, Intervalle i, String date, String t, float precision, float marge, Integer frequence) {
        super(uniteDeMesure, Identifant, i, date, t, precision, marge, frequence);
        this.Localisation = localisation;
    }
    
}
