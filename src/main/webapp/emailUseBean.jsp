<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Email Use Bean</title>
</head>
<body>
<jsp:useBean id="email" class="aula4.Mensagem" />
<h1>Informacoes do seu email:</h1>
<form id="formulario" name="formulario1">
	<p>Destinatario:
		<input type="text" name="destinatario" id="destinatario" 
			<jsp:setProperty property="destinatario" name="email" param="destinatario"/>
		/>
	</p>
	<p>Assunto:
		<input type="text" name="assunto" id="assunto"
			<jsp:setProperty property="assunto" name="email" param="assunto"/>
		/>
	</p>
	<p>Corpo da mensagem:
		<input type="text" name="corpoDaMensagem" id="corpoDaMensagem"
			<jsp:setProperty property="corpoDaMensagem" name="email" param="corpoDaMensagem"/>
		/>
	</p>
	
	<p>
		<input type="submit" name="button" id="button" value="Enviar email" />
	</p>	
</form>
<h2>Destinatario: </h2>
<h3><jsp:getProperty property="destinatario" name="email"/></h3>

<h3>Assunto: </h3>
<h4><jsp:getProperty property="assunto" name="email"/></h4>
<h3>Corpo da Mensagem</h3>
<p>>>>> <jsp:getProperty property="corpoDaMensagem" name="email"/></p>

</body>
</html>