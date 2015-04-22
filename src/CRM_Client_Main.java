
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
            /*Mitglied m = new Mitglied("Alphatest", "a", "0800/96725514", "alpha@test.de", "Alpha Str. 6", 8954, "Beta", 0, "alpha@eracing", "alpha + betarad", "verstrahlt" , 0, 0, "gammastrahlung", 1, "Vorstand");
            Geburtsdaten g = new Geburtsdaten ("1036-01-19","Hiroshima");
            Kontodaten k = new Kontodaten("Sparkasse", 945822, 89475, "jfjj565dsf", "BYdi94");
            Mitgliedsstatus st = new Mitgliedsstatus("2015-04-22", null ,"aktiv");
            Studiuminfo si = new Studiuminfo(14, "WIF");
            Team t = new Team("Vorstandschaft");
            System.out.println(rmi.insertMitglied(m,g,k,st,si,t));*/
            
            //rmi.updateSemester();
            
            //SELECT
            /*ArrayList <Mitglied > mitglieder = rmi.selectMitglied("Vorname", "Alphatest"); 
            //ArrayList <Mitglied > mitglieder = rmi.selectMitglied("Team", "Vorstandschaft");       //Teams abfragen             
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

            ArrayList <Geburtsdaten> geburtsdaten = rmi.selectGeburtsdaten("GeburtsID", "1002");
            for (int i = 0; i < geburtsdaten.size(); i++) {
                System.out.print(geburtsdaten.get(i).getGeburtsID() + tabs);
                System.out.print(geburtsdaten.get(i).getGeburtsdatum() + tabs);
                System.out.print(geburtsdaten.get(i).getGeburtsort() + "\n");
            }
            
            ArrayList <Kontodaten> kontodaten = rmi.selectKontodaten("KontoID", "1002");
            for (int i = 0; i < kontodaten.size(); i++) {
                System.out.print(kontodaten.get(i).getKontoID() + tabs);
                System.out.print(kontodaten.get(i).getKreditinstitut() + tabs);
                System.out.print(kontodaten.get(i).getKontonr() + tabs);
                System.out.print(kontodaten.get(i).getBlz() + tabs);
                System.out.print(kontodaten.get(i).getIban() + tabs);
                System.out.print(kontodaten.get(i).getBic() + "\n");
            }
            ArrayList <Mitgliedsstatus> mitgliedsstatus = rmi.selectMitgliedsstatus("statusID", "1002");
            for (int i = 0; i < mitgliedsstatus.size(); i++) {
                System.out.print(mitgliedsstatus.get(i).getStatusID() + tabs);
                System.out.print(mitgliedsstatus.get(i).getMitglied_seit() + tabs);
                System.out.print(mitgliedsstatus.get(i).getAustrittsdatum()+ tabs);
                System.out.print(mitgliedsstatus.get(i).getMitgliedsstatus() + "\n");
                
            }
            
            ArrayList <Studiuminfo> studiuminfo = rmi.selectStudiuminfo("studID", "1002");
            for (int i = 0; i < studiuminfo.size(); i++) {
                System.out.print(studiuminfo.get(i).getStudID() + tabs);
                System.out.print(studiuminfo.get(i).getAktSemester() + tabs);
                System.out.print(studiuminfo.get(i).getStudiengang() + "\n");
                
            }*/
            
            
            //UPDATE Mitgliedertabelle
             /*ArrayList<Mitglied> mitglieder = rmi.selectMitglied("MitgliederID", "1002");
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
             Mitglied m = new Mitglied(mitglID, vorname, name, telefonnr, email, strasse_Hsnr, plz, ort, angemeldet, email_eRacing, fuehrerschein, vermerk, werkstattregeln, serverzugang, staatsangehoerigkeit, foto_vorhanden, Position);
             m.setAngemeldet(1);
             m.setWerkstattregeln(1);
            
             System.out.println(rmi.updateMitglied(m));
             ArrayList<Mitglied> mitgliederNeu = rmi.selectMitglied("MitgliederID", "1002");
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
             System.out.print(mitgliederNeu.get(i).getPosition() + "\n");*/
            
            //Update geburtsdatentabelle
            /*ArrayList <Geburtsdaten> geburtsdaten = rmi.selectGeburtsdaten("GeburtsID", "1002");
            String tabs = "\t" + "\t";
            int i = 0;
            System.out.print(geburtsdaten.get(i).getGeburtsID() + tabs);
            System.out.print(geburtsdaten.get(i).getGeburtsdatum() + tabs);
            System.out.print(geburtsdaten.get(i).getGeburtsort() + "\n");
            int geburtsID = geburtsdaten.get(i).getGeburtsID();
            String geburtsdatum = geburtsdaten.get(i).getGeburtsdatum();
            String geburtsort = geburtsdaten.get(i).getGeburtsort();
            Geburtsdaten g = new Geburtsdaten(geburtsID, geburtsdatum, geburtsort);
            
            g.setGeburtsdatum("1039-01-19");
            System.out.println(rmi.updateGeburtsdaten(g));
            ArrayList <Geburtsdaten> geburtsdatenNeu = rmi.selectGeburtsdaten("GeburtsID", "1002");
            System.out.print(geburtsdatenNeu.get(i).getGeburtsID() + tabs);
            System.out.print(geburtsdatenNeu.get(i).getGeburtsdatum() + tabs);
            System.out.print(geburtsdatenNeu.get(i).getGeburtsort() + "\n");*/
            
            //Update kontodatentabelle
            /*ArrayList <Kontodaten> kontodaten = rmi.selectKontodaten("KontoID", "1002");
            String tabs = "\t" + "\t";
            int i = 0;
            System.out.print(kontodaten.get(i).getKontoID() + tabs);
            System.out.print(kontodaten.get(i).getKreditinstitut() + tabs);
            System.out.print(kontodaten.get(i).getKontonr() + tabs);
            System.out.print(kontodaten.get(i).getBlz() + tabs);
            System.out.print(kontodaten.get(i).getIban() + tabs);
            System.out.print(kontodaten.get(i).getBic() + "\n");
            
            int kontoID = kontodaten.get(i).getKontoID();
            String kreditinstitut = kontodaten.get(i).getKreditinstitut();
            int kontonr = kontodaten.get(i).getKontonr();
            int blz = kontodaten.get(i).getBlz();
            String iban = kontodaten.get(i).getIban();
            String bic = kontodaten.get(i).getBic();
            
            Kontodaten k = new Kontodaten(kontoID, kreditinstitut, kontonr, blz, iban, bic);
            k.setKontonr(5452216);
            System.out.println(rmi.updateKontodaten(k));
            
            ArrayList <Kontodaten> kontodatenNeu = rmi.selectKontodaten("KontoID", "1002");
            
            System.out.print(kontodatenNeu.get(i).getKontoID() + tabs);
            System.out.print(kontodatenNeu.get(i).getKreditinstitut() + tabs);
            System.out.print(kontodatenNeu.get(i).getKontonr() + tabs);
            System.out.print(kontodatenNeu.get(i).getBlz() + tabs);
            System.out.print(kontodatenNeu.get(i).getIban() + tabs);
            System.out.print(kontodatenNeu.get(i).getBic() + "\n");*/
            
            //update mitgliedsstatustabelle
            /*ArrayList <Mitgliedsstatus> mitgliedsstatus = rmi.selectMitgliedsstatus("statusID", "1002");
            String tabs = "\t" + "\t";
            int i = 0;
            System.out.print(mitgliedsstatus.get(i).getStatusID() + tabs);
            System.out.print(mitgliedsstatus.get(i).getMitglied_seit() + tabs);
            System.out.print(mitgliedsstatus.get(i).getAustrittsdatum()+ tabs);
            System.out.print(mitgliedsstatus.get(i).getMitgliedsstatus() + "\n");
            
            int statusID = mitgliedsstatus.get(i).getStatusID();
            String mitglied_seit = mitgliedsstatus.get(i).getMitglied_seit();
            String austrittsdatum = mitgliedsstatus.get(i).getAustrittsdatum();
            String mitgliedstatus = mitgliedsstatus.get(i).getMitgliedsstatus();
            
            Mitgliedsstatus st = new Mitgliedsstatus(statusID, mitglied_seit, austrittsdatum, mitgliedstatus);
            
            st.setMitglied_seit("2015-04-25");

            System.out.println(rmi.updateMitgliedsstatus(st));
            ArrayList <Mitgliedsstatus> mitgliedsstatusNeu = rmi.selectMitgliedsstatus("statusID", "1002");
            System.out.print(mitgliedsstatusNeu.get(i).getStatusID() + tabs);
            System.out.print(mitgliedsstatusNeu.get(i).getMitglied_seit() + tabs);
            System.out.print(mitgliedsstatusNeu.get(i).getAustrittsdatum()+ tabs);
            System.out.print(mitgliedsstatusNeu.get(i).getMitgliedsstatus() + "\n");*/
            
            //update studiuminfo
            /*/ArrayList <Studiuminfo> studiuminfo = rmi.selectStudiuminfo("studID", "1002");
            String tabs = "\t" + "\t";
            int i = 0;
            System.out.print(studiuminfo.get(i).getStudID() + tabs);
            System.out.print(studiuminfo.get(i).getAktSemester() + tabs);
            System.out.print(studiuminfo.get(i).getStudiengang() + "\n");
            
            int studID = studiuminfo.get(i).getStudID();
            int aktSemester = studiuminfo.get(i).getAktSemester();
            String studiengang = studiuminfo.get(i).getStudiengang();
            
            Studiuminfo si = new Studiuminfo(studID, aktSemester, studiengang);
            
            si.setAktSemester(15);
            System.out.println(rmi.updateStudiuminfo(si));
            
            ArrayList <Studiuminfo> studiuminfoNeu = rmi.selectStudiuminfo("studID", "1002");
            System.out.print(studiuminfoNeu.get(i).getStudID() + tabs);
            System.out.print(studiuminfoNeu.get(i).getAktSemester() + tabs);
            System.out.print(studiuminfoNeu.get(i).getStudiengang() + "\n");*/
            
            //update team
            /*Team t = new Team("Programmierung");
            System.out.println(rmi.updateTeam(t, 1002));*/
            
            //DELETE
            System.out.println(rmi.deleteMitglied(1002));
            
            
        } catch (Exception e) {
            System.err.println("Fehler: " + e.getMessage());
        }

    }
}
