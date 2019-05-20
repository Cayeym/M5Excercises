public class Vehicle {

    private String marca;
    private String model;
    private int categoria;
    public static int BASIC = 0;
    public static int GENERAL = 1;
    public static int DELUXE = 2;

    public Vehicle(String marca, String model, int categoria){
        this.marca = marca;
        this.model = model;
        this.categoria = wichCategory(categoria);
    }

    public int getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int wichCategory(int num){
        if(BASIC == num){
            return 0;
        }
        else if (GENERAL == num){
            return 1;
        }
        else{
            return 2;
        }
    }
}
