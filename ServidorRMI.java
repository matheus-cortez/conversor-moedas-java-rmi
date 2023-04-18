import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    
	public static void main(String[] args) {
        try {
			// cria um objeto para que o cliente se conecte via rede
            IConversorMoedas conversor = new ConversorMoedas();
            String objName = "rmi://localhost/ConversorMoedas";
			
            System.out.println("Registrando o objeto no RMIRegistry...");
			LocateRegistry.createRegistry(1099); // porta padrão do RMI
            Naming.rebind(objName, conversor);
			
            System.out.println("Aguardando Clientes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}