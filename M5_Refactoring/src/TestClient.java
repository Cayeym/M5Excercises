import org.junit.*;
import org.junit.rules.ExpectedException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class TestClient {
    @Test
    public void TestInforme() throws ParseException {
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
        assertEquals("Informe de lloguers del client Caye (45676493H)\n" +
                "\tMercedes 2: 90.0€\n" +
                "\tRenault 3: 120.0€\n" +
                "\tCitroen 4: 900.0€\n" +
                "Import a pagar: 1110.0€\n" +
                "Punts guanyats: 4" +
                "\n",
                client.informe());
    }

}
