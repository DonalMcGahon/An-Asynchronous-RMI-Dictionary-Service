# An-Asynchronous-RMI-Dictionary-Service

***Project given to me by Lecture Patrick Mannion for the module Distributed Systems***
## Project Overview
You are required to use the Servlet/JSP and Java RMI frameworks to develop a remote, asynchronous dictionary
lookup service. A JSP page should provide users with the ability to specify a string which will be checked
against the dictionary. The HTML form information should be dispatched to a servlet that adds the client request
to an in-queue and then returns a job ID to the web client. The web client should poll the web server periodically
(every 10 seconds) and query if the request has been processed. Client requests in the inQueue should
be periodically removed and processed (every 10 seconds).

## Information about architecture used in project
### RMI (Remote Method Innovation)
![rmi](https://user-images.githubusercontent.com/14197773/34213651-c84f8a60-e597-11e7-9622-13f5d2226e88.png)

RMI (Remote Method Invocation) is a way that a programmer, using the Java programming language and development environment, can write object-oriented programming in which objects on different computers can interact in a distributed network.
RMI is the Java version of what is generally known as a remote procedure call (RPC), but with the ability to pass one or more objects along with the request.
The object can include information that will change the service that is performed in the remote computer.

### JSP

### Apache Tomcat Server