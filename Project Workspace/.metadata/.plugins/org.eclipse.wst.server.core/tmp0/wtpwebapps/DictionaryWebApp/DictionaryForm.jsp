<%-- Reference - http://crunchify.com/servlet-tutorial-getting-starting-with-jsp-servlet-example/ --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dictionary Lookup</title>
</head>
<body>
<div align="center" style="margin-top: 50px;">
 
 		<H2><B>Dictionary Service</B></H2>
        <form action="DictionaryServlet">
        Enter your query here:  <input type="text" name="inputWord" size="20px"> <br>
        <input type="submit" value="Submit">
        </form>
        
        <h3>Options Below</h3>
        
        <h5>Add Word to Dictionary</h5>
        <form action="http://localhost:8080/DictionaryWebApp/DictionaryAdd.jsp">
		    <input type="submit" value="Add word" />
		</form>
		
		<h5>Delete Word from Dictionary</h5>
        <form action="http://localhost:8080/DictionaryWebApp/DictionaryDelete.jsp">
		    <input type="submit" value="Delete word" />
		</form>
		
		<h5>Modify Word in Dictionary</h5>
        <form action="http://localhost:8080/DictionaryWebApp/DictionaryModify.jsp">
		    <input type="submit" value="Modify word" />
		</form>
 
    </div>
</body>
</html>
