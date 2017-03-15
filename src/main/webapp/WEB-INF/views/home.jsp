<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<a href="listar">apreta para ir</a>
<h2>  Actualmente hay registrados ${cars} en BBDD. </h2>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
