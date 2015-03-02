
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MarkusH
 */
public class CRM_Client_ServerConnection {

    CRM_Interface rmi;

    public CRM_Interface connectServer() {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            System.out.println("Connected to Server");
            return rmi = (CRM_Interface) reg.lookup("server");
        } catch (Exception e) {
            System.err.println("Verbindung zum Server konnte nicht hergestellt werden: Fehler: " + e.getMessage());
        }
        return null;
    }

}
