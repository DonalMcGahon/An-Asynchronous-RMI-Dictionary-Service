package ie.gmit.sw;

//Reference - http://crunchify.com/servlet-tutorial-getting-starting-with-jsp-servlet-example/

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.HashMap;

public class DictControllerModify extends HttpServlet {
	
	HashMap<Integer, HttpServletRequest> requests = new HashMap<Integer,HttpServletRequest>();
	HashMap<Integer, HttpServletResponse> responses = new HashMap<Integer,HttpServletResponse>();
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        String word = request.getParameter("word");     
        String meaning = request.getParameter("meaning");
        DictionaryServer fs;
        String message = "";
       
		try {
			fs = (DictionaryServer) Naming.lookup("rmi://127.0.0.1:1099/dictionaryService");
	        if("".equals(word) || "".equals(meaning)){
	        	message = "Please input word and its meaning";
	        }else{
	        	message = fs.modifyWordMeaning(word,meaning);
			}
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		// HTML thats responses with the word modified
        PrintWriter out = response.getWriter();
        out.println (
                  "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                      "http://www.w3.org/TR/html4/loose.dtd\">\n" +
                  "<html> \n" +
                    "<head> \n" +
                      "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                        "charset=ISO-8859-1\"> \n" +
                      "<title> Dictionary Web App  </title> \n" +
                    "</head> \n" +
                    "<body> <div align='center'> \n" +
                      "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
                        message +
                        "<form action = " +
                        "DictionaryModify.jsp>" +
                        "<input type =" +
                        "submit value=" +
                        "Modify_another" +
                        "></form>" +
                    "</font></body> \n" +
                  "</html>" 
                );
    }

}
