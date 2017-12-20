package ie.gmit.sw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.HashMap;
 

public class DictController extends HttpServlet {
	
	HashMap<Integer, HttpServletRequest> requests = new HashMap<Integer,HttpServletRequest>();
	HashMap<Integer, HttpServletResponse> responses = new HashMap<Integer,HttpServletResponse>();
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        String inputWord = request.getParameter("inputWord");
        String wordMeaning = "";
        DictionaryServer fs;
		try {
			fs = (DictionaryServer) Naming.lookup("rmi://127.0.0.1:1099/dictionaryService");
			wordMeaning = fs.getWordMeaning(inputWord);
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

		 
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
                        "Description: " + wordMeaning +
                    "</font></body> \n" +
                  "</html>" 
                );
    }
}