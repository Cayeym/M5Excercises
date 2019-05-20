public class Vehicle {

    private String marca;
    private String model;
    private Categoria categoria;

    public Vehicle(){
        marca = "Sense marca";
        model = "Sense model";
        categoria = Categoria.BASIC;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public enum Categoria{
        BASIC, GENERAL, DELUXE
    }
}
