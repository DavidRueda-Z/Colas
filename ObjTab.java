public class ObjTab {

    private String Serial;
    private String Marca;
    private String Tamaño;
    private int DiscoDuro;
    private double Precio;
    private boolean Disponible;
    private int Cantidad;

    public ObjTab() {
    }

    public ObjTab(String serial, String marca, String tamaño, int discoDuro, double precio, boolean disponible,
            int cantidad) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        DiscoDuro = discoDuro;
        Precio = precio;
        Disponible = disponible;
        Cantidad = cantidad;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public int getDiscoDuro() {
        return DiscoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        DiscoDuro = discoDuro;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

}