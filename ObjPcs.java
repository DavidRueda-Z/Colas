public class ObjPcs {

    private String Serial;
    private String Marca;
    private int Ram;
    private int DiscoDuro;
    private double Precio;
    private boolean Disponible;
    private int Cantidad;
    private ObjEstudiante EstudianteAsignado;

    // Constructor vacio
    public ObjPcs() {
    }

    public ObjPcs(String serial, String marca, int ram, int discoDuro, double precio, boolean disponible,
            int cantidad, ObjEstudiante estudianteAsignado) {
        Serial = serial;
        Marca = marca;
        Ram = ram;
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

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
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

    public ObjEstudiante getEstudianteAsignado() {
        return EstudianteAsignado;
    }

    public void setEstudianteAsignado() {
        EstudianteAsignado = estudianteAsignado;
    }
}