
import java.util.ArrayList;
import java.util.Iterator;







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MarkusH
 */
public class CRM_Client_Main {

    public static void main(String args[]) {

        try {
            CRM_Client_ServerConnection client = new CRM_Client_ServerConnection();
            CRM_Interface rmi = client.connectServer();
            //Mitglied m = new Mitglied("Stefan", "Mustermann", "3432423423", "max@holl", "PassauerStr. 4", 45454, "NähePassau", 1, "nicht dass ich wüsste", "andy@eracing", "LKW, Fahrrad", "ka", 0, 0, "Bayerisch/Deutsch", 1, "Vorstand");
            //System.out.println(rmi.insertMitglied(m).toString());
            ArrayList <Mitglied> mitglieder = rmi.selectMitglied();
            for(Iterator<Mitglied> i = mitglieder.iterator(); i.hasNext();){
                System.out.println(i.next());
            }
        } catch (Exception e) {
            System.err.println("Fehler: "+e.getMessage());
        } 
        

    }
}
