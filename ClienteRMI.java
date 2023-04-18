import java.rmi.Naming;
import java.rmi.RemoteException;

public class ClienteRMI {
    public static void main(String[] args) throws Exception {
        String objName = "rmi://localhost:1099/ConversorMoedas";
        IConversorMoedas conversor = (IConversorMoedas) Naming.lookup(objName);
        System.out.println("O resultado da conversão de 1.0 Reais para Dólares é de : " + conversor.converterMoedas("Real","Dólar",1.0));
    }
}