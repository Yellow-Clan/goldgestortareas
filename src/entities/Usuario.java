package entities;
public class Usuario {

    public static Usuario getByPId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int ID;
    private String Nombre;
    private String DNI;
    private String InformaconAdicional;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getInformaconAdicional() {
        return InformaconAdicional;
    }

    public void setInformaconAdicional(String InformaconAdicional) {
        this.InformaconAdicional = InformaconAdicional;
    }
    
    
    
}
