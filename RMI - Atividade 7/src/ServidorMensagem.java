import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorMensagem {

	public static void main(String args[]) {
		
		try {

			// servidor se registra em uma determinada porta
			LocateRegistry.createRegistry(2021);

			ObjetoMensagem objeto = new ObjetoMensagem();

			Naming.rebind("//localhost:2021/Mensagem", objeto);

			System.out.println("Servidor concetado!");
			
		} catch (Exception ex) {
			System.out.println("MensagemServer exception: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

}
