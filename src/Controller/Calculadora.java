package Controller;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public interface Calculadora extends Remote {

    public long somar(long a, long b) throws RemoteException;
}
