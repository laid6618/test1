<%-- 
    Document   : affichage
    Created on : 2014-02-18, 09:21:04
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
        <h1>Formulaire de la recherche!</h1><BR>
        
        <h1>Entrer votre numero Agent s'il vous plait..!</h1><BR>
       <html:errors/><BR> 
        <html:form action="rechercher.do">
            
            <table border="2">
               
                    <tr>
                       <th>Numero Agent:</th>
                       <td><html:text property="numero"/></td>
                    </tr>
              
                    <tr >
                        <th colspan="2"><html:submit> Envoyer</html:submit></th>
                      
                    </tr>
                </tbody>
            </table>

            
            
            
            
        </html:form>
        
    </body>
</html>
