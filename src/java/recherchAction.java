/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author 1395372
 */
public class recherchAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        rechercherFormBean recherche=(rechercherFormBean)form;
        HashMap<Integer, enregistrerFormBean>   has=(HashMap<Integer, enregistrerFormBean>)request.getSession().getAttribute("liste");
        Set<Integer> keys=has.keySet();
        
        for (int i = 0; i < keys.size(); i++) {
            
            if(i==recherche.getNumber()){
            request.getSession().setAttribute("trouver", recherche);
             return mapping.findForward(SUCCESS);
            
            
            }
            
        }
        
        
        
        return mapping.findForward("introuvable");
    }
}
