/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author 1395372
 */
public class enregistrerBean {
    
    
    
   private String name;
   private int numero;
    private String typeVente;
    private Double montant;
    private String numeroDossier;

    public enregistrerBean(String name, int numero, String typeVente, Double montant) {
        this.name = name;
        this.numero = numero;
        this.typeVente = typeVente;
        this.montant = montant;
    }

    public enregistrerBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
    
    
    
}
