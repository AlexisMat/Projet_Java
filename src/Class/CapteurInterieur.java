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
public class CapteurInterieur extends Capteur {

    public GPS getLocalisation() {
        return localisation;
    }

    public void setLocalisation(GPS localisation) {
        this.localisation = localisation;
    }
    private GPS localisation;
    
    public CapteurInterieur(GPS gps,String uniteDeMesure, String Identifant, Intervalle i, String date, String t, float precision, float marge, Integer frequence) {
        super(uniteDeMesure, Identifant, i, date, t, precision, marge, frequence);
        this.localisation = gps;
    }
    
}
