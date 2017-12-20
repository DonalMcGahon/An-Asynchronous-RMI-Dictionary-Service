package ie.gmit.sw;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface DictionaryServer extends Remote{
	
	public String getWordMeaning(String word) throws RemoteException;
	
	public String addWordMeaning(String word, String meaning) throws RemoteException;
	
	public String deleteWordMeaning(String word) throws RemoteException;
	
	public String modifyWordMeaning(String word, String meaning) throws RemoteException;
	
	//public ArrayList<String> getFileNames() throws RemoteException;
	
	//public void uploadFile(String fileName, byte[] bytes) throws RemoteException;
}
