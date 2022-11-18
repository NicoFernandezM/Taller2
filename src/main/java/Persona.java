import java.util.ArrayList;

public class Persona {
    private String nombre, apellido, rut;
    private ArrayList<CorreoElectronico> correoElectronicos;
    private ArrayList<Automovil> automoviles;

    public Persona(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.correoElectronicos = new ArrayList<>();
        this.automoviles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    public ArrayList<CorreoElectronico> getCorreoElectronicos() {
        return correoElectronicos;
    }

    public ArrayList<Automovil> getAutomoviles() {
        return automoviles;
    }

    @Override
    public String toString() {
        return "\nPersona " +
                "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nRut:" + rut;
    }
}