package ie.gmit.sw;
//Reference - Lecture RMI Lab Solution dsRMI_FileServer_Solution
import java.rmi.Naming;

public class Client {

	public static void main(String[] args) throws Exception {
		//Ask the registry running on localhost and listening in port 1099 for the instance of
		//the DictionaryServer object that is bound to the RMI registry with the name dictionaryService.
		DictionaryServer fs = (DictionaryServer) Naming.lookup("rmi://127.0.0.1:1099/dictionaryService");
	}

}
