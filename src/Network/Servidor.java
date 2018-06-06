package Network;

import Controller.Calculadora;
import Controller.CalculadoraImplementacao;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public class Servidor {

    public Servidor() {
        try {
            LocateRegistry.createRegistry(1099);
            Calculadora cal = new CalculadoraImplementacao();
            Naming.rebind("127.0.0.1/Calculadora", (Remote) cal);
            System.out.println("Servidor Remoto Iniciado...");
        } catch (RemoteException | MalformedURLException ex) {
            System.err.println("ERRO: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
    }
}
