import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLloguersLite {
    public static void main(String[] args) throws ParseException{
        Client client = new Client("45676493H", "Caye", "601216893");
        SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
        Date date = dateFormat.parse("2/8/2013");
        Vehicle a1 = new Vehicle("Mercedes", "2", Vehicle.BASIC);
        Vehicle b1 = new Vehicle("Renault", "3", Vehicle.GENERAL);
        Vehicle c1 = new Vehicle("Citroen", "4", Vehicle.DELUXE);
        Lloguer a = new Lloguer(date, 2, a1);
        client.afegeix(a);
        Lloguer b = new Lloguer(date, 2, b1);
        client.afegeix(b);
        Lloguer c = new Lloguer(date, 5, c1);
        client.afegeix(c);
        printAll(client);
    }

    public static void printAll(Client client){
        System.out.println("Client: " + client.getNom());
        System.out.println(client.getNif());
        System.out.println(client.getTelefon());
        System.out.println("Lloguers: " + client.getClients());
        for (int i = 0; i<client.getClients(); i++){
            System.out.println("    " + (i+1) + ". vehicle: " + client.getLloguers().get(i).getVehicle().getMarca());
            System.out.println("       " + "data d'inici: " + client.getLloguers().get(i).getData());
            System.out.println("       " + "dies llogats: " + client.getLloguers().get(i).getDies());
        }
    }
}
