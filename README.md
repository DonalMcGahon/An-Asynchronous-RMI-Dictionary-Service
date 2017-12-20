# An-Asynchronous-RMI-Dictionary-Service

***Project given to me by Lecture Patrick Mannion for the module Distributed Systems***

<p align="center">
  <img width="260" height="200" src="https://s.cafebazaar.ir/1/icons/Ali.Dejbord.ComDic_512x512.png">
</p>

## Project Overview
You are required to use the Servlet/JSP and Java RMI frameworks to develop a remote, asynchronous dictionary
lookup service. A JSP page should provide users with the ability to specify a string which will be checked
against the dictionary. The HTML form information should be dispatched to a servlet that adds the client request
to an in-queue and then returns a job ID to the web client. The web client should poll the web server periodically
(every 10 seconds) and query if the request has been processed. Client requests in the inQueue should
be periodically removed and processed (every 10 seconds).

## How to download and run my application
1. Clone the repository to your machine.
1. Import the folder called "Project Workspace" into Eclipse. (A java Project called DictionaryServer & and a Dynamic Web Application called DictionaryWebApp will be set up).
1. Go to the DictionaryServer project and run "DictionaryServiceSetup.java" file as a Java Application.
1. Then go to the Dynamic Web Application and run "DictController.java" file on the server.
1. Go to the web brower on your machine or on Eclipse and enter in the following URL - "http://localhost:8080/DictionaryWebApp/DictionaryForm.jsp".
1. Search for a word from the list of words available in the dictionary which are displayed in the README.

## How to install Tomcat Server v9.0 into the project
1. Have project open in Eclipse
1. Go to Window -> Preferences
1. Type in server -> Runtime environment
1. Add -> Apache Tomcat v9.0
1. Then go back & Go to Project -> Properties
1. Java Build Path -> Libraries -> Add Library -> Server Runtime -> Apache Tomcat v9.0 -> Finish -> Apply

## Information about architecture used in project
### RMI (Remote Method Innovation)
![rmi](https://user-images.githubusercontent.com/14197773/34213651-c84f8a60-e597-11e7-9622-13f5d2226e88.png)

RMI (Remote Method Invocation) is a way that a programmer, using the Java programming language and development environment, can write object-oriented programming in which objects on different computers can interact in a distributed network.
RMI is the Java version of what is generally known as a remote procedure call (RPC), but with the ability to pass one or more objects along with the request.
The object can include information that will change the service that is performed in the remote computer.

### JSP
![jsp](https://user-images.githubusercontent.com/14197773/34214078-45b22566-e599-11e7-82b9-f019c50b66ee.png)

Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications.
JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases.

### Apache Tomcat Server
![image](https://user-images.githubusercontent.com/14197773/34214259-d5666758-e599-11e7-96c7-28459674f48a.png)

The Apache Tomcat® software is an open source implementation of the Java Servlet, JavaServer Pages, Java Expression Language and Java WebSocket technologies.
For this project I used Apache Tomcat® v9.0.

## Java Servlet
![image](https://user-images.githubusercontent.com/14197773/34214677-1679f6aa-e59b-11e7-993b-241d1e44484c.png)

A Java servlet is a Java program that extends the capabilities of a server.
Although servlets can respond to any types of requests, they most commonly implement applications hosted on Web servers.
Such Web servlets are the Java counterpart to other dynamic Web content technologies such as PHP and ASP.NET.