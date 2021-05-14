import java.rmi.Naming;

import java.util.*;;

public class ClienteMensagem {

	public static void main(String args[]) {

		try {

			Mensagem obj = (Mensagem) Naming.lookup("//" + "localhost:2021" + "/Mensagem");

			// Entrada
			Scanner entrada = new Scanner(System.in);

			System.out.print("Digite a mensagem: ");

			String mensagem = entrada.nextLine().toLowerCase();

			System.out.println("\n ------ Saída 1 ------ ");

			Map<Character, Integer> freq = obj.freqVogais(mensagem);
			Set<Character> chaves = freq.keySet();

			// Imprimir a frequência de cada um vogal
			for (Character chave : chaves) {

				System.out.println(String.format("        %s = %d", chave, freq.get(chave)));

			}

			System.out.println("\n ------ Saída 2 ------ ");
			List<Character> chVogaisDistintas = obj.printVogaisDistintas(mensagem);

			// Imprimir a lista de vogais distintas
			System.out.println(String.format("\n Vogais distintas = %s", chVogaisDistintas));

			// Imprimir a quantidade de vogais distintas
			System.out.println(String.format(" Quantidade de vogais distintas: %d \n", chVogaisDistintas.size()));

			System.out.println("\n ------ Saída 3 ------ ");
			List<Character> chVogais = obj.printVogais((mensagem));

			// Imprimir a lista de vogais
			System.out.println(String.format("\n Vogais = %s", chVogais));

			// Imprimir a quantidade de vogais
			System.out.println(String.format(" Quantidade de vogais: %d \n", chVogais.size()));

			System.out.println("\n ------ Saída 4 ------ ");
			List<Character> chSorted = obj.sortMensagem(mensagem);
			
			System.out.println("         Sort");

			// Imprimir os caracteres ordenados
			for (char sort : chSorted) {
				System.out.println(String.format("          %s", sort));
			
			}

			System.out.println("\n ------ Saída 5 ------ ");

			// Imprimir a soma de caracteres
			System.out.println(String.format("\n  Soma: %d", obj.somar(mensagem)));

		} catch (Exception ex) {
			System.out.println("MensagemClient exception: " + ex.getMessage());
			ex.printStackTrace();
		}

	}

}
