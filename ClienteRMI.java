import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ClienteRMI {
    public static String converteDigitoParaMoeda(int digitoMoeda) {
        String moeda = "";
        switch(digitoMoeda) {
            case 1:
                moeda = "Real";
                break;
            case 2:
                moeda = "Dólar";
                break;
            case 3:
                moeda = "Euro";
                break;
        }
        return moeda;
    }

    public static boolean checkDigitoValido(int digitoMoeda) {
        if (digitoMoeda < 1 && digitoMoeda > 3){
            return false;
        } 
        return true;
    }

    public static void main(String[] args) throws Exception {
        String objName = "rmi://localhost:1099/ConversorMoedas";
        IConversorMoedas conversor = (IConversorMoedas) Naming.lookup(objName);
        
        int digitoMoedaPrimaria;
        int digitoMoedaSecundaria;
        String moedaPrimaria = "";
        String moedaSecundaria = "";
        double valor;

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Bem vindo ao conversor de moedas! As taxas de conversão são relativas à consulta feita às 15h05 GMT-03:00 18/04/2023.\n\nDigite o número correspondente à moeda que deseja converter.\n1: Real\n2: Dólar\n3: Euro\n");

        digitoMoedaPrimaria = scanner.nextInt();

        while(checkDigitoValido(digitoMoedaPrimaria)==false){
            System.out.println("\nNúmero inválido, por favor inserir um número de 1 a 3.\n");
            digitoMoedaPrimaria = scanner.nextInt();
        }

        moedaPrimaria = converteDigitoParaMoeda(digitoMoedaPrimaria);
        

        System.out.println("\nDigite o número correspondente à moeda para a qual você deseja realizar a conversão.\n1: Real\n2: Dólar\n3: Euro");

        digitoMoedaSecundaria = scanner.nextInt();

        while(checkDigitoValido(digitoMoedaPrimaria)==false || digitoMoedaSecundaria == digitoMoedaPrimaria){
            System.out.println("\nNúmero inválido, por favor inserir um número de 1 a 3 diferente da moeda anterior.\n");
            digitoMoedaSecundaria = scanner.nextInt();
        }

        moedaSecundaria = converteDigitoParaMoeda(digitoMoedaSecundaria);

        System.out.println("\nPor fim, digite o valor em " + moedaPrimaria + " a ser convertido para " + moedaSecundaria +"\n");
        valor = scanner.nextDouble();

        System.out.println("\nO resultado da conversão de "+ valor + " " + moedaPrimaria + " para " + moedaSecundaria + " é de : " + conversor.converterMoedas(moedaPrimaria, moedaSecundaria, valor));
    
    }
}