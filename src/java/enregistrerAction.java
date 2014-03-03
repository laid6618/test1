/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.EmployeeManager;
import modele.enregistrerBean;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author 1395372
 */
public class enregistrerAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";


    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        enregistrerFormBean enregistrer=(enregistrerFormBean)form;
        
        HashMap<Integer, enregistrerFormBean> hm=new HashMap<Integer, enregistrerFormBean>();
        //validation en cas le montant est negatif..
        if (enregistrer.getMontant()<0){
            ActionErrors erreur = new ActionErrors();
            erreur.add("negatifNumber", new ActionMessage("formeng.negatif"));
            saveErrors(request, erreur);
      
        }
       // EmployeeManager emanager=new EmployeeManager();
        
        //simulation bd
        hm.put(enregistrer.getNumero(), enregistrer);
        request.getSession().setAttribute("liste", hm);
        
        // le montant de la commision
        Double commission=modele.Util.calculCommission(enregistrer.getTypeVente(), enregistrer.getMontant());
         request.getSession().setAttribute("commission", commission);
         
         request.setAttribute("bean", enregistrer);
         
         // affichage
         
         
         
         
        return mapping.findForward(SUCCESS);
    }
}
