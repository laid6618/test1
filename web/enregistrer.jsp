<%-- 
    Document   : enregistrer
    Created on : 2014-02-18, 09:18:29
    Author     : 1395372
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP enregistements</title>
    </head>
    <body>
        <h1>Formulaire d'enrgistrements!</h1><BR>
        
        <h1>Entrer vous donnees s'il vous plait..!</h1><BR>
       <html:errors/><BR> 
        <html:form action="enregistrerAction.do">
            
            <table border="2">
               
                    <tr>
                       <th>Numero Agent:</th>
                       <td><html:text property="numero"/></td>
                    </tr>
                    <tr>
                        <th>Type Vente:</th>
                        <td>
                            <html:select property="typeVente" >
                               
                                    <option>Vol</option>
                                    <option>Hotel</option>
                                     <option>Forfait</option>
                                                       
                            </html:select> 
                            
                            </td>
                    </tr>
                    <tr>
                       <th>Montant:</th>
                        <td><html:text property="montant"/></td>
                    </tr>
                    <tr>
                       <th>Numero de Dossier:</th>
                        <td><html:text property="numeroDossier"/></td>
                    </tr>
                    <tr >
                        <th colspan="2"><html:submit> Envoyer</html:submit></th>
                      
                    </tr>
                </tbody>
            </table>

            
            
            
            
        </html:form>
        
    </body>
</html>
