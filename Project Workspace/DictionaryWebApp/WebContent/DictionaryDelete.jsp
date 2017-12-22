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
 
 		<H2><B>Delete from Dictionary</B></H2>
        <form action="DictionaryServletDelete">
        Word:  <input type="text" name="word" size="20px"> <br>
        <input type="submit" value="submit">
        </form>
 
    </div>
</body>
</html>
