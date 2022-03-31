<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dia da semana</title>
</head>
<body>
<%
String week = "";
Calendar c = Calendar.getInstance();
int weekNumber = c.getTime().getDay();
if (weekNumber == 1) {
	week = "Segunda Feira";
}
if (weekNumber == 2) {
	week = "Terca Feira";
}
if (weekNumber == 3) {
	week = "Quarta Feira";
}
if (weekNumber == 4) {
	week = "Quinta Feira";
}
if (weekNumber == 5) {
	week = "Sexta Feira";
}
if (weekNumber == 6) {
	week = "Sabado";
}
if (weekNumber == 7) {
	week = "Domingo";
}
	%>
<h1>Hoje é <%= week%></h1>
</body>
</html>