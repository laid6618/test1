<%-- 
    Document   : afficherResume
    Created on : 2014-02-18, 10:51:33
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
        <title>JSP resume</title>
    </head>
    <body>
        <h2>Le resume</h2><BR>
        
                    <table border="2">
               
                    <tr>
                    <ul>
                      
                        <li>Numero Agent ${bean.numero}</li>
                        <li>Type : ${bean.typeVente}</li>
                        <li>Numero de Dossier :${bean.numeroDossier}</li>
                        <li>la Commission Accordee :${commission} $CAD</li>
                    </ul>

                      
                    </tr>
                </tbody>
            </table>
        
        
                        <html:link href="/enregistrer.jsp">Home</html:link>
        
    </body>
</html>



