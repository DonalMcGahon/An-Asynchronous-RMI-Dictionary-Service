package ie.gmit.sw;
//Reference - Lecture RMI Lab Solution dsRMI_FileServer_Solution
//Dictionary Server that extends Remote
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface DictionaryServer extends Remote{
	
	public String getWordMeaning(String word) throws RemoteException;
	
	public String addWordMeaning(String word, String meaning) throws RemoteException;
	
	public String deleteWordMeaning(String word) throws RemoteException;
	
	public String modifyWordMeaning(String word, String meaning) throws RemoteException;
	
}
