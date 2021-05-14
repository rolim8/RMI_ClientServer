import java.rmi.*;
import java.util.*;

public interface Mensagem extends Remote {

	public Map<Character, Integer> freqVogais(String mensagem) throws RemoteException;

	public List<Character> printVogaisDistintas(String mensagem) throws RemoteException;

	public List<Character> printVogais(String mensagem) throws RemoteException;

	public List<Character> sortMensagem(String mensagem) throws RemoteException;

	public int somar(String mensagem) throws RemoteException;

}
