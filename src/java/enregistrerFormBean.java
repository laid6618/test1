/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author 1395372
 */
public class enregistrerFormBean extends org.apache.struts.validator.ValidatorForm {
    
   
  
    private int numero;
    private String typeVente;
    private Double montant;
    private String numeroDossier;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTypeVente() {
        return typeVente;
    }

    public void setTypeVente(String typeVente) {
        this.typeVente = typeVente;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getNumeroDossier() {
        return numeroDossier;
    }

    public void setNumeroDossier(String numeroDossier) {
        this.numeroDossier = numeroDossier;
    }

    public enregistrerFormBean() {
    }

    public enregistrerFormBean(int numero, String typeVente, Double montant, String numeroDossier) {
        this.numero = numero;
        this.typeVente = typeVente;
        this.montant = montant;
        this.numeroDossier = numeroDossier;
    }

   

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
//    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
//        ActionErrors errors = new ActionErrors();
//        if (getName() == null || getName().length() < 1) {
//            errors.add("name", new ActionMessage("error.name.required"));
//            // TODO: add 'error.name.required' key to your resources
//        }
//        return errors;
//    }
}
