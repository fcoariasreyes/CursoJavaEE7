<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
   		 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		 <title>Struts2 Tiles Example</title>
    </head>
   <body>
   		<div id="friendsLinkDiv">
   			<a id="friendsLinkId" href="<s:url action="friendsLink"/>" >Friends</a>
   		</div>
		<div id="officeLinkDiv">
			<a id="officeLinkId" href="<s:url action="officeLink"/>" >The Office</a>
		</div>		
    </body>
</html>