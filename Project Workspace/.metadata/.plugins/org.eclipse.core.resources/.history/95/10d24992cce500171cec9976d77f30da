package ie.gmit.sw;

import java.rmi.Naming;

public class Client {
	
	public static void main(String[] args) throws Exception {
		//Ask the registry running on localhost and listening in port 1099 for the instance of
		//the FileService object that is bound to the RMI registry with the name fileService.
		DictionaryService fs = (DictionaryService) Naming.lookup("rmi://127.0.0.1:1099/dictionaryService");
	}

}
