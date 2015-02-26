
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
public class CRM_Client_Methoden {
    
    

    void connectServer() {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            CRM_Interface rmi = (CRM_Interface) reg.lookup("server");
            System.out.println("Connected to Server");
            //Scanner scan = new Scanner(System.in);
            Mitglied m = new Mitglied("Stefan", "Mustermann", "3432423423", "max@holl", "PassauerStr. 4", 45454, "NähePassau", 1, "nicht dass ich wüsste", "andy@eracing", "LKW, Fahrrad", "ka", 0, 0, "Bayerisch/Deutsch", 1, "Vorstand");
            //System.out.println(m.getName());
            //System.out.println("Vorname: \t");
            //m.setVorname(scan.nextLine());
            rmi.writeNewMitgliedInDatabase(m);
            System.out.println("Daten gesendet");
            //System.out.println();
        } catch (Exception e) {
            System.err.println("Fehler: "+e.getMessage());
        }
    }
    
}
