/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Random;

/**
 *
 * @author Quentin
 * Cette classe permet de cree des intervalle 
 */


public class Intervalle {
    
    private float borneInf ;
    private float  borneSup;
    
    public Intervalle(float a , float b)
    {
        this.borneInf = a ;
        this.borneSup =b;
    }
    
    private float GenerateValue ()
    {
        Random rand = new Random();

         return (rand.nextFloat() * (this.borneSup - this.borneInf) + this.borneInf);

    }
    
   
}

