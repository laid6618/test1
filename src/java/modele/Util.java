/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author 1395372
 */
public class Util {
    
    
    
    public static Double calculCommission(String mot,Double montant){
    
    if(mot.equals("Vol")|| mot.equals("Hotel") ){
    
    montant=montant*1.1;
    
    return montant;
    }else
      return  montant;
 
    }
    
}
