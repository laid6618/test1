<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: activeborder">
     <bean:message key="welcome.title"/><BR>
     
     vers : <html:link href="enregistrer.jsp">Enregistrements</html:link><BR><br>
      vers : <html:link href="affichage.jsp">Afficher Ventes</html:link>
        
     
      
    </body>
</html:html>
