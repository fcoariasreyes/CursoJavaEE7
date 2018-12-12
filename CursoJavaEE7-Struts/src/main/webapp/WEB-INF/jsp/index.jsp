<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
    <head>
        <title>Struts 2 hello world example</title>
        <!--  <link rel="stylesheet" href="styles.css">-->
        <s:head/>
    </head>

    <body>
        <h1><s:text name="welcome" /></h1>
        <s:if test="hasActionErrors()">
	        <div id="fieldErrors">
	            <s:actionerror cssClass="error"/>
	        </div>
        </s:if>
        <s:form action="testAction" namespace="/" method="post" name="myForm" theme="xhtml">
            <s:textfield name="name" size="40" maxlength="40" key="label.name"/>
            <s:submit key="submit" />
        </s:form>
    </body>
</html>