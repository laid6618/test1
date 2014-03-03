/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.HashMap;


/**
 *
 * @author 1395372
 */
public class EmployeeManager {
    
    private HashMap<String, enregistrerBean> hm=new HashMap<String, enregistrerBean>();

    public EmployeeManager() {
    }

    public HashMap<String, enregistrerBean> getHm() {
        return hm;
    }

    public void setHm(HashMap<String, enregistrerBean> hm) {
        this.hm = hm;
    }

  
    
    
}
