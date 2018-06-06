package Network;

import Controller.Calculadora;
import java.rmi.Naming;

/**
 *
 * @author Leandro Pereira Sampaio
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            System.out.println("Cliente");
            Calculadora calculadora = (Calculadora) Naming.lookup("127.0.0.1/Calculadora");
            long resultado = calculadora.somar(10, 50);

            System.out.println("A SOMA FOI: " + resultado);
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
    }
}
