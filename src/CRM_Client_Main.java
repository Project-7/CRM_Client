
import java.util.ArrayList;







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
            ArrayList <Mitglied> mitglieder = rmi.selectMitglied("Vorname","thomas");
            String tabs = "\t"+"\t";
            for (int i=0; i<mitglieder.size(); i++){
                System.out.print(mitglieder.get(i).getMitgliederID()+tabs);
                System.out.print(mitglieder.get(i).getVorname()+tabs);
                System.out.print(mitglieder.get(i).getName()+tabs);
                System.out.print(mitglieder.get(i).getTelefonnr()+tabs);
                System.out.print(mitglieder.get(i).getEmail()+tabs);
                System.out.print(mitglieder.get(i).getStrasse_Hsnr()+tabs);
                System.out.print(mitglieder.get(i).getPlz()+tabs);
                System.out.print(mitglieder.get(i).getOrt()+tabs);
                System.out.print(mitglieder.get(i).isAngemeldet()+tabs);
                System.out.print(mitglieder.get(i).getStudiumGenerale()+tabs);
                System.out.print(mitglieder.get(i).getEmail_eRacing()+tabs);
                System.out.print(mitglieder.get(i).getFuehrerschein()+tabs);
                System.out.print(mitglieder.get(i).getVermerk()+tabs);
                System.out.print(mitglieder.get(i).isWerkstattregeln()+tabs);
                System.out.print(mitglieder.get(i).isServerzugang()+tabs);
                System.out.print(mitglieder.get(i).getStaatsangehoerigkeit()+tabs);
                System.out.print(mitglieder.get(i).isFoto_vorhanden()+tabs);
                System.out.print(mitglieder.get(i).getPosition()+"\n");
            }
            /*for(Iterator<Mitglied> i = mitglieder.iterator(); i.hasNext();){
                
                int mitglID = m.getMitgliederID();
                String vorname = m.getString(2);
                String name = rs.getString(3);
                String telefonnr = rs.getString(4);
                String email = rs.getString(5);
                String strasse_Hsnr = rs.getString(6);
                int plz = rs.getInt(7);
                String ort = rs.getString(8);
                int angemeldet = rs.getInt(9);
                String studiumGenerale = rs.getString(10);
                String email_eRacing = rs.getString(11);
                String fuehrerschein = rs.getString(12);
                String vermerk = rs.getString(13);
                int werkstattregeln = rs.getInt(14);
                int serverzugang = rs.getInt(15);
                String staatsangehoerigkeit = rs.getString(16);
                int foto_vorhanden = rs.getInt(17);
                String Position = rs.getString(18);
                Mitglied m = new Mitglied(mitglID, String vorname, String name, String telefonnr, String email, String strasse_Hsnr, int plz, String ort,int angemeldet, String studiumGenerale, String email_eRacing, String fuehrerschein, String vermerk, int werkstattregeln, int serverzugang, String staatsangehoerigkeit, int foto_vorhanden, String Position);
                System.out.println(m.getEmail());
                System.out.println(i.toString());
                System.out.println(i.next().getName());
                System.out.println(i.next().getTelefonnr());
                System.out.println(i.next().getEmail());
                System.out.println(i.next().getStrasse_Hsnr());
                System.out.println(i.next().getPlz());
                System.out.println(i.next().getOrt());
                System.out.println(i.next().isAngemeldet());
                System.out.println(i.next().getStudiumGenerale());
                System.out.println(i.next().getEmail_eRacing());
                System.out.println(i.next().getFuehrerschein());
                System.out.println(i.next().getVermerk());
                System.out.println(i.next().isWerkstattregeln());
                System.out.println(i.next().isServerzugang());
                System.out.println(i.next().getStaatsangehoerigkeit());
                System.out.println(i.next().isFoto_vorhanden());
                System.out.println(i.next().getPosition());
            }*/
        } catch (Exception e) {
            System.err.println("Fehler: "+e.getMessage());
        } 
        

    }
}
