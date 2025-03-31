public class ObjEstudiante {
    private String Nombre;
    private String Carne;
    private String Vinculo;

    public ObjEstudiante() {
    }

    public ObjEstudiante(String nombre, String carne, String vinculo) {
        Nombre = nombre;
        Carne = carne;
        Vinculo = vinculo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String carne) {
        Carne = carne;
    }

    public String getVinculo() {
        return Vinculo;
    }

    public void setVinculo(String vinculo) {
        Vinculo = vinculo;
    }

}
