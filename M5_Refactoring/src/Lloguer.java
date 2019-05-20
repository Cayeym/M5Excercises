import java.util.Vector;

public class Lloguer {

    private String data;
    private int dies;
    private Vector<Vehicle> vehicles;

    public Lloguer(){
        data = "Sense data";
        dies = 0;
        vehicles = new Vector<>();
    }

    public int getDies() {
        return dies;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDies(int dies) {
        this.dies = dies;
    }
}
