import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversorMoedas extends Remote {
    double converterMoedas(String moedaReferencia, String moedaSecundaria, double valor) throws RemoteException;
}