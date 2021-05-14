import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import java.util.*;

public class ObjetoMensagem extends UnicastRemoteObject implements Mensagem {

	private static final long serialVersionUID = 1L;

	public ObjetoMensagem() throws RemoteException {
		super();

	}

	@Override
	public Map<Character, Integer> freqVogais(String mensagem) throws RemoteException {

		Map<Character, Integer> chars = new HashMap<Character, Integer>();

		for (char ch : mensagem.toCharArray()) {

			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {

				Integer valor = chars.get(ch);

				// Se o caractere existir no HashMap então adiciona 1 ao valor anterior
				if (!(valor == null)) {

					chars.put(ch, valor + 1);

					// Se o caractere não existir no HashMap então defina o valor 1

				} else {

					chars.put(ch, 1);
				}

			}
		}

		return chars;

	}

	@Override
	public List<Character> printVogaisDistintas(String mensagem) throws RemoteException {

		List<Character> chars = new ArrayList<Character>();

		for (char ch : mensagem.toCharArray()) {

			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {

				chars.add(ch);
			}
		}

		// Retornando a lista quando se contém cada um elemento não repetido

		Set<Character> set = new HashSet<Character>(chars);

		List<Character> newChar = new ArrayList<Character>(set);

		return newChar;
	}

	@Override
	public List<Character> printVogais(String mensagem) throws RemoteException {

		List<Character> chars = new ArrayList<Character>();

		for (char ch : mensagem.toCharArray()) {

			if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {

				chars.add(ch);
			}
		}

		return chars;
	}

	@Override
	public List<Character> sortMensagem(String mensagem) throws RemoteException {

		List<Character> chars = new ArrayList<Character>();

		for (char ch : mensagem.toCharArray()) {

			chars.add(ch);

		}

		// Cada um caractere seja ordenado
		Collections.sort(chars);

		return chars;
	}

	@Override
	public int somar(String mensagem) throws RemoteException {

		int soma = 0;
		int valor = 0;

		List<Integer> valores = new ArrayList<Integer>();

		for (int i = 0; i < mensagem.length(); i++) {

			char c = mensagem.charAt(i);

			if ((c >= 'a') && (c <= 'z')) {

				valor = 1 + c - 'a';

				valores.add(valor);

				// Stream para realizar a soma;
				soma = valores.stream().mapToInt(Integer::intValue).sum();

			}
		}

		return soma;
	}

}
