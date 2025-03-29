public class ObjPcs {

    private String Serial;
    private String Marca;
    private String Ram;
    private String DiscoDuro;
    private double Precio;
    private String NombreEst;
    private String Carnet;
    private boolean Disponible;

    //Constructor vacio
    public ObjPcs() {
    }

    //Constructor 
    public ObjPcs(String serial, String marca, String ram, String discoDuro, double precio, String nombreEst,
            String carnet, boolean disponible) {
                
        Serial = serial;
        Marca = marca;
        Ram = ram;
        DiscoDuro = discoDuro;
        Precio = precio;
        NombreEst = nombreEst;
        Carnet = carnet;
        Disponible = disponible;
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


    public String getRam() {
        return Ram;
    }


    public void setRam(String ram) {
        Ram = ram;
    }


    public String getDiscoDuro() {
        return DiscoDuro;
    }


    public void setDiscoDuro(String discoDuro) {
        DiscoDuro = discoDuro;
    }


    public double getPrecio() {
        return Precio;
    }


    public void setPrecio(double precio) {
        Precio = precio;
    }


    public String getNombreEst() {
        return NombreEst;
    }


    public void setNombreEst(String nombreEst) {
        NombreEst = nombreEst;
    }


    public String getCarnet() {
        return Carnet;
    }


    public void setCarnet(String carnet) {
        Carnet = carnet;
    }


    public boolean isDisponible() {
        return Disponible;
    }


    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

    
}