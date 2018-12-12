<h1>Eloqua / Campa&ntilde;a</h1>
<form method="post" action="#">
	<input type="hidden"  size="150" name="action" value="${action}"/>
	<ul>
	<li>
		<label>Nombre lista de contacto</label>
		<br/>
	    <input type="text" name="searchName" size="150" class="field-style field-split align-left" value="${searchName}"/>
		<br/>
		<label>Mensaje de texto base</label>
		<br/>
		<input type="text"  size="150" name="messageText" class="field-style field-split align-left" placeholder=""  value="${messageText}"/>
	</li>
	<li>
	<input type="submit" value="Send" />
	</li>
	<li><b>${message}</b></li>
	</ul>
	
	
</form>