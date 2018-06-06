package Controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public class CalculadoraImplementacao extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImplementacao() throws RemoteException {
        super();
    }

    @Override
    public long somar(long a, long b) throws RemoteException {
        return a + b;
    }

}
