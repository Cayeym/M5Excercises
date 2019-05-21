import java.util.Date;

public class Lloguer {

    private Date data;
    private int dies;
    private Vehicle vehicle;
    private static final double IMPOST_PER_DIA_LLOGUER_BASIC = 1.5;
    private static final double IMPOST_PER_DIA_LLOGUER_GENERAL = 2.5;
    private static final int IMPOST_PER_DIA_LLOGUER_DELUXE = 6;
    private static final int MINIM_DIES_PER_IMPOST_BASIC = 3;
    private static final int MINIM_DIES_PER_IMPOST_GENERAL = 2;

    public Lloguer(Date data, int dies, Vehicle vehicle){
        this.data = data;
        this.dies = dies;
        this.vehicle = vehicle;
    }

    public int getDies() {
        return dies;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDies(int dies) {
        this.dies = dies;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double quantitat(){
        double quantitat = 0;
        switch (vehicle.getCategoria()) {
            case Vehicle.BASIC:
                quantitat += MINIM_DIES_PER_IMPOST_BASIC;
                if (getDies() > MINIM_DIES_PER_IMPOST_BASIC) {
                    quantitat += (getDies() - 3) * IMPOST_PER_DIA_LLOGUER_BASIC;
                }
                break;
            case Vehicle.GENERAL:
                quantitat += 4;
                if (getDies() > MINIM_DIES_PER_IMPOST_GENERAL) {
                    quantitat += (getDies() - MINIM_DIES_PER_IMPOST_GENERAL) * IMPOST_PER_DIA_LLOGUER_GENERAL;
                }
                break;
            case Vehicle.DELUXE:
                quantitat += getDies() * IMPOST_PER_DIA_LLOGUER_DELUXE;
                break;
        }
        return quantitat;
    }
    public int bonificacions(){
        int bonificacions = 0;
        // afegeix lloguers freqüents
        bonificacions ++;

        // afegeix bonificació per dos dies de lloguer de Luxe
        if (getVehicle().getCategoria() == Vehicle.DELUXE && getDies()>1 ) {
            bonificacions ++;
        }
        return bonificacions;
    }
}
