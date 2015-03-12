

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
            //INSERT
            Mitglied m = new Mitglied("Stefan", "Mustermann", "3432423423", "max@holl", "PassauerStr. 4", 45454, "NähePassau", 1, "nicht dass ich wüsste", "andy@eracing", "LKW, Fahrrad", "ka", 0, 0, "Bayerisch/Deutsch", 1, "Vorstand");
            System.out.println(rmi.insertMitglied(m));

            /**
             * SELECT 
             * ArrayList <Mitglied> mitglieder =
             * rmi.selectMitglied("Vorname","thomas"); String tabs = "\t"+"\t";
             * for (int i=0; i<mitglieder.size(); i++){
             * System.out.print(mitglieder.get(i).getMitgliederID()+tabs);
             * System.out.print(mitglieder.get(i).getVorname()+tabs);
             * System.out.print(mitglieder.get(i).getName()+tabs);
             * System.out.print(mitglieder.get(i).getTelefonnr()+tabs);
             * System.out.print(mitglieder.get(i).getEmail()+tabs);
             * System.out.print(mitglieder.get(i).getStrasse_Hsnr()+tabs);
             * System.out.print(mitglieder.get(i).getPlz()+tabs);
             * System.out.print(mitglieder.get(i).getOrt()+tabs);
             * System.out.print(mitglieder.get(i).isAngemeldet()+tabs);
             * System.out.print(mitglieder.get(i).getStudiumGenerale()+tabs);
             * System.out.print(mitglieder.get(i).getEmail_eRacing()+tabs);
             * System.out.print(mitglieder.get(i).getFuehrerschein()+tabs);
             * System.out.print(mitglieder.get(i).getVermerk()+tabs);
             * System.out.print(mitglieder.get(i).isWerkstattregeln()+tabs);
             * System.out.print(mitglieder.get(i).isServerzugang()+tabs);
             * System.out.print(mitglieder.get(i).getStaatsangehoerigkeit()+tabs);
             * System.out.print(mitglieder.get(i).isFoto_vorhanden()+tabs);
             * System.out.print(mitglieder.get(i).getPosition()+"\n");
            }
             */
            //DELETE
            System.out.println(rmi.deleteMitglied(3));

        } catch (Exception e) {
            System.err.println("Fehler: " + e.getMessage());
        }

    }
}
