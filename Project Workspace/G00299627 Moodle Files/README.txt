Github Repository - https://github.com/DonalMcGahon/An-Asynchronous-RMI-Dictionary-Service.git

Description of Application:
You are required to use the Servlet/JSP and Java RMI frameworks to develop a remote, asynchronous dictionary lookup service.
A JSP page should provide users with the ability to specify a string which will be checked against the dictionary.
The HTML form information should be dispatched to a servlet that adds the client request to an in-queue and then returns a job ID to the web client.
The web client should poll the web server periodically (every 10 seconds) and query if the request has been processed.
Client requests in the inQueue should be periodically removed and processed (every 10 seconds).

How to download and run my application:
1. Clone the repository to your machine.
2. Import the folder called "Project Workspace" into Eclipse. (A java Project called DictionaryServer & and a Dynamic Web Application called DictionaryWebApp will be set up).
3. Go to the DictionaryServer project and run "DictionaryServiceSetup.java" file as a Java Application.
4. Then go to the Dynamic Web Application and run "DictController.java" file on the server.
5. Go to the web brower on your machine or on Eclipse and enter in the following URL - "http://localhost:8080/DictionaryWebApp/DictionaryForm.jsp".
6. Search for a word from the list of words available in the dictionary which are displayed in this file.
7. Test out the other functionality available, for example - Add, delete or modify a word.

How to install Tomcat Server v9.0 into the project:
1. Have project open in Eclipse
2. Go to Window -> Preferences
3. Type in server -> Runtime environment
4. Add -> Apache Tomcat v9.0
5. Then go back & Go to Project -> Properties
6. Java Build Path -> Libraries -> Add Library -> Server Runtime -> Apache Tomcat v9.0 -> Finish -> Apply

Extra Functionality:
I added functionality which allows the client JSP to add/remove/modify entries in the dictionary

Dictionary Words to test out with Application:
Sad
Confidence
Whimsical
Happy
Registry
Roarer
Disclosed
Retain
Vortical
Ranty
Condolence
Indirectness
Considerateness
Library
Tomium
Disensanity
Lithium
Dupery
Reunite
Inefficacy
Donatory
Violinist
Bacciferous
Platin
Crocoite
Ordinable
Verbarfistuca
Tubulipore
Rhymeless
Curbless
Defensory
Humoralist
Abruptness
Choir
Voiced
Indiretin
Titler
Thrombosis
Biorgan
Motograph
Theatricals
Estimably
Fleetings
Pedomotive
Healthily
Coryanthes
Bashaw
Pessimism
Overbreed
Dictionary
Table
Chair
Pub
Map
Desktop
Internet
Network
Connect
