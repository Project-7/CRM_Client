
import java.util.ArrayList;
import java.util.Date;

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
            //Mitglied m = new Mitglied("Tomandy", "GeeTeeA", "6633663", "max@holl", "PassauerStr. 4", 45454, "NähePassau", 1, "andy@eracing", "LKW, Fahrrad", "ka", 0, 0, "Bayerisch/Deutsch", 1, "Vorstand");
            //Geburtsdaten g = new Geburtsdaten ("1899-08-08","Los Santos");
            //System.out.println(rmi.insertMitglied(m,g));
            rmi.updateSemester();
            //SELECT
            ArrayList <Mitglied > mitglieder = rmi.selectMitglied("Foto_vorhanden", "1");                    
            String tabs = "\t" + "\t";
            for (int i = 0; i < mitglieder.size(); i++) {
                System.out.print(mitglieder.get(i).getMitgliederID() + tabs);
                System.out.print(mitglieder.get(i).getVorname() + tabs);
                System.out.print(mitglieder.get(i).getName() + tabs);
                System.out.print(mitglieder.get(i).getTelefonnr() + tabs);
                System.out.print(mitglieder.get(i).getEmail() + tabs);
                System.out.print(mitglieder.get(i).getStrasse_Hsnr() + tabs);
                System.out.print(mitglieder.get(i).getPlz() + tabs);
                System.out.print(mitglieder.get(i).getOrt() + tabs);
                System.out.print(mitglieder.get(i).isAngemeldet() + tabs);
                System.out.print(mitglieder.get(i).getEmail_eRacing() + tabs);
                System.out.print(mitglieder.get(i).getFuehrerschein() + tabs);
                System.out.print(mitglieder.get(i).getVermerk() + tabs);
                System.out.print(mitglieder.get(i).isWerkstattregeln() + tabs);
                System.out.print(mitglieder.get(i).isServerzugang() + tabs);
                System.out.print(mitglieder.get(i).getStaatsangehoerigkeit() + tabs);
                System.out.print(mitglieder.get(i).isFoto_vorhanden() + tabs);
                System.out.print(mitglieder.get(i).getPosition() + "\n");
            }

            //DELETE
            //System.out.println(rmi.deleteMitglied(4));
            //UPDATE
             /*ArrayList<Mitglied> mitglieder = rmi.selectMitglied("MitgliederID", "16");
             String tabs = "\t" + "\t";
             int i = 0;
             System.out.print(mitglieder.get(i).getMitgliederID() + tabs);
             System.out.print(mitglieder.get(i).getVorname() + tabs);
             System.out.print(mitglieder.get(i).getName() + tabs);
             System.out.print(mitglieder.get(i).getTelefonnr() + tabs);
             System.out.print(mitglieder.get(i).getEmail() + tabs);
             System.out.print(mitglieder.get(i).getStrasse_Hsnr() + tabs);
             System.out.print(mitglieder.get(i).getPlz() + tabs);
             System.out.print(mitglieder.get(i).getOrt() + tabs);
             System.out.print(mitglieder.get(i).isAngemeldet() + tabs);
             System.out.print(mitglieder.get(i).getEmail_eRacing() + tabs);
             System.out.print(mitglieder.get(i).getFuehrerschein() + tabs);
             System.out.print(mitglieder.get(i).getVermerk() + tabs);
             System.out.print(mitglieder.get(i).isWerkstattregeln() + tabs);
             System.out.print(mitglieder.get(i).isServerzugang() + tabs);
             System.out.print(mitglieder.get(i).getStaatsangehoerigkeit() + tabs);
             System.out.print(mitglieder.get(i).isFoto_vorhanden() + tabs);
             System.out.print(mitglieder.get(i).getPosition() + "\n");
             int mitglID = mitglieder.get(i).getMitgliederID();
             String vorname = mitglieder.get(i).getVorname();
             String name = mitglieder.get(i).getName();
             String telefonnr = mitglieder.get(i).getTelefonnr();
             String email = mitglieder.get(i).getEmail();
             String strasse_Hsnr = mitglieder.get(i).getStrasse_Hsnr();
             int plz = mitglieder.get(i).getPlz();
             String ort = mitglieder.get(i).getOrt();
             int angemeldet = mitglieder.get(i).isAngemeldet();
             String email_eRacing = mitglieder.get(i).getEmail_eRacing();
             String fuehrerschein = mitglieder.get(i).getFuehrerschein();
             String vermerk = mitglieder.get(i).getVermerk();
             int werkstattregeln = mitglieder.get(i).isWerkstattregeln();
             int serverzugang = mitglieder.get(i).isServerzugang();
             String staatsangehoerigkeit = mitglieder.get(i).getStaatsangehoerigkeit();
             int foto_vorhanden = mitglieder.get(i).isFoto_vorhanden();
             String Position = mitglieder.get(i).getPosition();
             Mitglied m = new Mitglied(mitglID, vorname, name, telefonnr, email, strasse_Hsnr, plz, ort, angemeldet, studiumGenerale, email_eRacing, fuehrerschein, vermerk, werkstattregeln, serverzugang, staatsangehoerigkeit, foto_vorhanden, Position);
             m.setVorname("Massod");
             m.setVermerk("test2");
             m.setAngemeldet(0);
             m.setName("Test");
            
             System.out.println(rmi.updateMitglied(m));
             ArrayList<Mitglied> mitgliederNeu = rmi.selectMitglied("MitgliederID", "16");
             System.out.print(mitgliederNeu.get(i).getMitgliederID() + tabs);
             System.out.print(mitgliederNeu.get(i).getVorname() + tabs);
             System.out.print(mitgliederNeu.get(i).getName() + tabs);
             System.out.print(mitgliederNeu.get(i).getTelefonnr() + tabs);
             System.out.print(mitgliederNeu.get(i).getEmail() + tabs);
             System.out.print(mitgliederNeu.get(i).getStrasse_Hsnr() + tabs);
             System.out.print(mitgliederNeu.get(i).getPlz() + tabs);
             System.out.print(mitgliederNeu.get(i).getOrt() + tabs);
             System.out.print(mitgliederNeu.get(i).isAngemeldet() + tabs);
             System.out.print(mitgliederNeu.get(i).getEmail_eRacing() + tabs);
             System.out.print(mitgliederNeu.get(i).getFuehrerschein() + tabs);
             System.out.print(mitgliederNeu.get(i).getVermerk() + tabs);
             System.out.print(mitgliederNeu.get(i).isWerkstattregeln() + tabs);
             System.out.print(mitgliederNeu.get(i).isServerzugang() + tabs);
             System.out.print(mitgliederNeu.get(i).getStaatsangehoerigkeit() + tabs);
             System.out.print(mitgliederNeu.get(i).isFoto_vorhanden() + tabs);
             System.out.print(mitgliederNeu.get(i).getPosition() + "\n");
             */
        } catch (Exception e) {
            System.err.println("Fehler: " + e.getMessage());
        }

    }
}
