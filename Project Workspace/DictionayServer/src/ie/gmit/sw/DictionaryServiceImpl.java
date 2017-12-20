package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.*;
import java.rmi.server.*;
import java.util.HashMap;

public class DictionaryServiceImpl extends UnicastRemoteObject implements DictionaryServer {
	private static final long serialVersionUID = 1L;


	public DictionaryServiceImpl() throws RemoteException{
		super();
	}

	public static HashMap<String,String> getDictionary() {
		HashMap<String,String> dictionary = new HashMap<String,String>();
		String dictionaryPath = "Dictionary/MyDictionary.csv";
		try(BufferedReader br = new BufferedReader(new FileReader(dictionaryPath))) {
			for(String line; (line = br.readLine()) != null; ) {
				String[] tokens = line.split(",");	
				dictionary.put(tokens[0], tokens[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dictionary;
	}
	@Override
	public String getWordMeaning(String word) throws RemoteException {	
		
		HashMap<String,String> dictionary = getDictionary();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(dictionary.containsKey(word)){
			return dictionary.get(word);
		}else
			return "Word not found!";
	}
	
}
