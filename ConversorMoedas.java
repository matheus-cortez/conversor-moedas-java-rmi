import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversorMoedas extends UnicastRemoteObject implements IConversorMoedas {
    public ConversorMoedas() throws RemoteException {
        super(); // Esse método sempre é chamado, mesmo que não fosse explicitado
    }

    public double converterMoedas(String moedaReferencia, String moedaSecundaria, double valorMoedaReferencia) throws RemoteException {
        double valorMoedaSecundaria = 0;
        
        // consulta feita às 15h05 GMT-03:00 18/04/2023
        switch(moedaReferencia) {
            case "Real":
                switch(moedaSecundaria) {
                    case "Dólar":
                        valorMoedaSecundaria = 0.20;
                        break;
                    case "Euro":
                        valorMoedaSecundaria = 0.18;
                        break;
                }
                break;
            case "Dólar":
                switch(moedaSecundaria) {
                    case "Real":
                        valorMoedaSecundaria = 4.98;
                        break;
                    case "Euro":
                        valorMoedaSecundaria = 0.91;
                        break;
                }
                break;
            case "Euro":
                switch(moedaSecundaria) {
                    case "Real":
                        valorMoedaSecundaria = 5.46;
                        break;
                    case "Dólar":
                        valorMoedaSecundaria = 1.10;
                        break;
                }
                break;
        }
                
        return valorMoedaSecundaria * valorMoedaReferencia;
    }
}